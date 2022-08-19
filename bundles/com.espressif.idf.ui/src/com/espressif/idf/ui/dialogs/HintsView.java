/*******************************************************************************
 * Copyright 2022-2023 Espressif Systems (Shanghai) PTE LTD. All rights reserved.
 * Use is subject to license terms.
 *******************************************************************************/
package com.espressif.idf.ui.dialogs;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.espressif.idf.core.util.HintsUtil;

public class HintsView extends ViewPart
{
	private TableViewer hintsTableViewer;
	private Table hintsTable;
	private final String[] titles = { "Error Type", "Hint" }; //$NON-NLS-1$ //$NON-NLS-2$
	private Text searchField;
	private List<String[]> reHintsList;

	public HintsView()
	{
		super();
	}

	@Override
	public void createPartControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(1, true);
		container.setLayout(layout);
		createSearchField(container);
		createHintsViewer(container);
	}

	private void createHintsViewer(Composite container)
	{
		reHintsList = HintsUtil.getReHintsList();
		hintsTableViewer = new TableViewer(container,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(container);
		hintsTable = hintsTableViewer.getTable();
		hintsTable.setHeaderVisible(true);
		hintsTable.setLinesVisible(true);
		hintsTableViewer.setContentProvider(new ArrayContentProvider());
		hintsTableViewer.setInput(reHintsList);
		resizeAllColumns();
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		hintsTableViewer.getControl().setLayoutData(gridData);

	}

	private void resizeAllColumns()
	{
		for (TableColumn tc : hintsTableViewer.getTable().getColumns())
		{
			tc.pack();
		}
	}

	private void createColumns(Composite container)
	{
		TableViewerColumn col = createTableViewerColumn(titles[0]);
		col.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				return ((String[]) element)[0];
			}
		});
		col = createTableViewerColumn(titles[1]);
		col.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				return ((String[]) element)[1];
			}
		});
		col.getViewer().addDoubleClickListener(new IDoubleClickListener()
		{

			@Override
			public void doubleClick(DoubleClickEvent event)
			{

				StructuredSelection selection = (StructuredSelection) event.getViewer().getSelection();
				MessageDialog.openInformation(container.getShell(), Messages.ColumnDetailsTitle,
						((String[]) selection.getFirstElement())[1]);

			}
		});
	}

	private TableViewerColumn createTableViewerColumn(String title)
	{
		TableViewerColumn viewerColumn = new TableViewerColumn(hintsTableViewer, SWT.NONE);
		TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private void createSearchField(Composite container)
	{
		GridData dataName = new GridData();
		dataName.grabExcessHorizontalSpace = true;
		dataName.horizontalAlignment = SWT.FILL;
		searchField = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.SEARCH | SWT.ICON_CANCEL | SWT.ICON_SEARCH);
		searchField.setMessage(Messages.FilterMessage);
		searchField.setLayoutData(dataName);
		searchField.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				List<String[]> allMatchesList = new ArrayList<>();
				for (String[] reHintEntry : reHintsList)
				{
					boolean isRegexMatchesWithField = Pattern.compile(reHintEntry[0]).matcher(searchField.getText())
							.find();
					if (isRegexMatchesWithField)
					{
						allMatchesList.add(reHintEntry);
					}
				}
				if (allMatchesList.isEmpty())
				{
					allMatchesList = reHintsList;
				}

				hintsTableViewer.setInput(allMatchesList);
				hintsTableViewer.refresh();
			}
		});

	}

	@Override
	public void setFocus()
	{
		searchField.setFocus();
	}

}
