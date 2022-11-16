/**
 * generated by Xtext 2.28.0
 */
package com.espressif.idf.componen.iDFComponentDsl.impl;

import com.espressif.idf.componen.iDFComponentDsl.ComponentModel;
import com.espressif.idf.componen.iDFComponentDsl.DependenciesComp;
import com.espressif.idf.componen.iDFComponentDsl.Description;
import com.espressif.idf.componen.iDFComponentDsl.Feature;
import com.espressif.idf.componen.iDFComponentDsl.IDFComponentDslFactory;
import com.espressif.idf.componen.iDFComponentDsl.IDFComponentDslPackage;
import com.espressif.idf.componen.iDFComponentDsl.Type;
import com.espressif.idf.componen.iDFComponentDsl.VersionInfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDFComponentDslPackageImpl extends EPackageImpl implements IDFComponentDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependenciesCompEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componenT_NAMEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componenT_NAME_FEATUREEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overridE_PATHEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulesEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.espressif.idf.componen.iDFComponentDsl.IDFComponentDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IDFComponentDslPackageImpl()
  {
    super(eNS_URI, IDFComponentDslFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link IDFComponentDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IDFComponentDslPackage init()
  {
    if (isInited) return (IDFComponentDslPackage)EPackage.Registry.INSTANCE.getEPackage(IDFComponentDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredIDFComponentDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    IDFComponentDslPackageImpl theIDFComponentDslPackage = registeredIDFComponentDslPackage instanceof IDFComponentDslPackageImpl ? (IDFComponentDslPackageImpl)registeredIDFComponentDslPackage : new IDFComponentDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theIDFComponentDslPackage.createPackageContents();

    // Initialize created meta-data
    theIDFComponentDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIDFComponentDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IDFComponentDslPackage.eNS_URI, theIDFComponentDslPackage);
    return theIDFComponentDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComponentModel()
  {
    return componentModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComponentModel_Elements()
  {
    return (EReference)componentModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDescription_Name()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVersionInfo()
  {
    return versionInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVersionInfo_Name()
  {
    return (EAttribute)versionInfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getURL()
  {
    return urlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getURL_Name()
  {
    return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCOMMENT()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCOMMENT_Name()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDependenciesComp()
  {
    return dependenciesCompEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDependenciesComp_Features()
  {
    return (EReference)dependenciesCompEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIDF()
  {
    return idfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCOMPONENT_NAME()
  {
    return componenT_NAMEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCOMPONENT_NAME_Features()
  {
    return (EReference)componenT_NAMEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCOMPONENT_NAME_FEATURE()
  {
    return componenT_NAME_FEATUREEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCOMPONENT_NAME_FEATURE_Name()
  {
    return (EAttribute)componenT_NAME_FEATUREEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPUBLIC()
  {
    return publicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOVERRIDE_PATH()
  {
    return overridE_PATHEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRULES()
  {
    return rulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IDFComponentDslFactory getIDFComponentDslFactory()
  {
    return (IDFComponentDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    componentModelEClass = createEClass(COMPONENT_MODEL);
    createEReference(componentModelEClass, COMPONENT_MODEL__ELEMENTS);

    typeEClass = createEClass(TYPE);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__NAME);

    versionInfoEClass = createEClass(VERSION_INFO);
    createEAttribute(versionInfoEClass, VERSION_INFO__NAME);

    urlEClass = createEClass(URL);
    createEAttribute(urlEClass, URL__NAME);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__NAME);

    dependenciesCompEClass = createEClass(DEPENDENCIES_COMP);
    createEReference(dependenciesCompEClass, DEPENDENCIES_COMP__FEATURES);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);

    idfEClass = createEClass(IDF);

    componenT_NAMEEClass = createEClass(COMPONENT_NAME);
    createEReference(componenT_NAMEEClass, COMPONENT_NAME__FEATURES);

    componenT_NAME_FEATUREEClass = createEClass(COMPONENT_NAME_FEATURE);
    createEAttribute(componenT_NAME_FEATUREEClass, COMPONENT_NAME_FEATURE__NAME);

    publicEClass = createEClass(PUBLIC);

    overridE_PATHEClass = createEClass(OVERRIDE_PATH);

    rulesEClass = createEClass(RULES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    descriptionEClass.getESuperTypes().add(this.getType());
    versionInfoEClass.getESuperTypes().add(this.getType());
    urlEClass.getESuperTypes().add(this.getType());
    commentEClass.getESuperTypes().add(this.getType());
    dependenciesCompEClass.getESuperTypes().add(this.getType());
    idfEClass.getESuperTypes().add(this.getFeature());
    componenT_NAMEEClass.getESuperTypes().add(this.getFeature());
    publicEClass.getESuperTypes().add(this.getCOMPONENT_NAME_FEATURE());
    overridE_PATHEClass.getESuperTypes().add(this.getFeature());
    rulesEClass.getESuperTypes().add(this.getCOMPONENT_NAME_FEATURE());

    // Initialize classes and features; add operations and parameters
    initEClass(componentModelEClass, ComponentModel.class, "ComponentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentModel_Elements(), this.getType(), null, "elements", null, 0, -1, ComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionInfoEClass, VersionInfo.class, "VersionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersionInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, VersionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlEClass, com.espressif.idf.componen.iDFComponentDsl.URL.class, "URL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURL_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.espressif.idf.componen.iDFComponentDsl.URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, com.espressif.idf.componen.iDFComponentDsl.COMMENT.class, "COMMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCOMMENT_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.espressif.idf.componen.iDFComponentDsl.COMMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependenciesCompEClass, DependenciesComp.class, "DependenciesComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependenciesComp_Features(), this.getFeature(), null, "features", null, 0, -1, DependenciesComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idfEClass, com.espressif.idf.componen.iDFComponentDsl.IDF.class, "IDF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componenT_NAMEEClass, com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME.class, "COMPONENT_NAME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCOMPONENT_NAME_Features(), this.getCOMPONENT_NAME_FEATURE(), null, "features", null, 0, -1, com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componenT_NAME_FEATUREEClass, com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE.class, "COMPONENT_NAME_FEATURE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCOMPONENT_NAME_FEATURE_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(publicEClass, com.espressif.idf.componen.iDFComponentDsl.PUBLIC.class, "PUBLIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(overridE_PATHEClass, com.espressif.idf.componen.iDFComponentDsl.OVERRIDE_PATH.class, "OVERRIDE_PATH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rulesEClass, com.espressif.idf.componen.iDFComponentDsl.RULES.class, "RULES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //IDFComponentDslPackageImpl
