/**
 * generated by Xtext 2.28.0
 */
package com.espressif.idf.componen.iDFComponentDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.espressif.idf.componen.iDFComponentDsl.IDFComponentDslFactory
 * @model kind="package"
 * @generated
 */
public interface IDFComponentDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "iDFComponentDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.espressif.com/idf/componen/IDFComponentDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "iDFComponentDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IDFComponentDslPackage eINSTANCE = com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.ComponentModelImpl <em>Component Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.ComponentModelImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getComponentModel()
   * @generated
   */
  int COMPONENT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Component Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.TypeImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.DescriptionImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.VersionInfoImpl <em>Version Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.VersionInfoImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getVersionInfo()
   * @generated
   */
  int VERSION_INFO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_INFO__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_INFO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.URLImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getURL()
   * @generated
   */
  int URL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMMENTImpl <em>COMMENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMMENTImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMMENT()
   * @generated
   */
  int COMMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>COMMENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.DependenciesCompImpl <em>Dependencies Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.DependenciesCompImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getDependenciesComp()
   * @generated
   */
  int DEPENDENCIES_COMP = 6;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES_COMP__FEATURES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dependencies Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES_COMP_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.FeatureImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.IDFImpl <em>IDF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getIDF()
   * @generated
   */
  int IDF = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDF__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>IDF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDF_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAMEImpl <em>COMPONENT NAME</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAMEImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMPONENT_NAME()
   * @generated
   */
  int COMPONENT_NAME = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_NAME__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_NAME__FEATURES = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>COMPONENT NAME</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_NAME_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAME_FEATUREImpl <em>COMPONENT NAME FEATURE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAME_FEATUREImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMPONENT_NAME_FEATURE()
   * @generated
   */
  int COMPONENT_NAME_FEATURE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_NAME_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>COMPONENT NAME FEATURE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_NAME_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.PUBLICImpl <em>PUBLIC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.PUBLICImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getPUBLIC()
   * @generated
   */
  int PUBLIC = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC__NAME = COMPONENT_NAME_FEATURE__NAME;

  /**
   * The number of structural features of the '<em>PUBLIC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_FEATURE_COUNT = COMPONENT_NAME_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.OVERRIDE_PATHImpl <em>OVERRIDE PATH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.OVERRIDE_PATHImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getOVERRIDE_PATH()
   * @generated
   */
  int OVERRIDE_PATH = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PATH__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>OVERRIDE PATH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PATH_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.RULESImpl <em>RULES</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.RULESImpl
   * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getRULES()
   * @generated
   */
  int RULES = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__NAME = COMPONENT_NAME_FEATURE__NAME;

  /**
   * The number of structural features of the '<em>RULES</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_FEATURE_COUNT = COMPONENT_NAME_FEATURE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.ComponentModel <em>Component Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Model</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.ComponentModel
   * @generated
   */
  EClass getComponentModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.espressif.idf.componen.iDFComponentDsl.ComponentModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.ComponentModel#getElements()
   * @see #getComponentModel()
   * @generated
   */
  EReference getComponentModel_Elements();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.Description#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.Description#getName()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.VersionInfo <em>Version Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Info</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.VersionInfo
   * @generated
   */
  EClass getVersionInfo();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.VersionInfo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.VersionInfo#getName()
   * @see #getVersionInfo()
   * @generated
   */
  EAttribute getVersionInfo_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.URL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.URL#getName()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.COMMENT <em>COMMENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COMMENT</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMMENT
   * @generated
   */
  EClass getCOMMENT();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.COMMENT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMMENT#getName()
   * @see #getCOMMENT()
   * @generated
   */
  EAttribute getCOMMENT_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.DependenciesComp <em>Dependencies Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependencies Comp</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.DependenciesComp
   * @generated
   */
  EClass getDependenciesComp();

  /**
   * Returns the meta object for the containment reference list '{@link com.espressif.idf.componen.iDFComponentDsl.DependenciesComp#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.DependenciesComp#getFeatures()
   * @see #getDependenciesComp()
   * @generated
   */
  EReference getDependenciesComp_Features();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.IDF <em>IDF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDF</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.IDF
   * @generated
   */
  EClass getIDF();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME <em>COMPONENT NAME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COMPONENT NAME</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME
   * @generated
   */
  EClass getCOMPONENT_NAME();

  /**
   * Returns the meta object for the containment reference list '{@link com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME#getFeatures()
   * @see #getCOMPONENT_NAME()
   * @generated
   */
  EReference getCOMPONENT_NAME_Features();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE <em>COMPONENT NAME FEATURE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COMPONENT NAME FEATURE</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE
   * @generated
   */
  EClass getCOMPONENT_NAME_FEATURE();

  /**
   * Returns the meta object for the attribute '{@link com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.COMPONENT_NAME_FEATURE#getName()
   * @see #getCOMPONENT_NAME_FEATURE()
   * @generated
   */
  EAttribute getCOMPONENT_NAME_FEATURE_Name();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.PUBLIC <em>PUBLIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PUBLIC</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.PUBLIC
   * @generated
   */
  EClass getPUBLIC();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.OVERRIDE_PATH <em>OVERRIDE PATH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OVERRIDE PATH</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.OVERRIDE_PATH
   * @generated
   */
  EClass getOVERRIDE_PATH();

  /**
   * Returns the meta object for class '{@link com.espressif.idf.componen.iDFComponentDsl.RULES <em>RULES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RULES</em>'.
   * @see com.espressif.idf.componen.iDFComponentDsl.RULES
   * @generated
   */
  EClass getRULES();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IDFComponentDslFactory getIDFComponentDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.ComponentModelImpl <em>Component Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.ComponentModelImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getComponentModel()
     * @generated
     */
    EClass COMPONENT_MODEL = eINSTANCE.getComponentModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_MODEL__ELEMENTS = eINSTANCE.getComponentModel_Elements();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.TypeImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.DescriptionImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__NAME = eINSTANCE.getDescription_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.VersionInfoImpl <em>Version Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.VersionInfoImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getVersionInfo()
     * @generated
     */
    EClass VERSION_INFO = eINSTANCE.getVersionInfo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION_INFO__NAME = eINSTANCE.getVersionInfo_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.URLImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__NAME = eINSTANCE.getURL_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMMENTImpl <em>COMMENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMMENTImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMMENT()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getCOMMENT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__NAME = eINSTANCE.getCOMMENT_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.DependenciesCompImpl <em>Dependencies Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.DependenciesCompImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getDependenciesComp()
     * @generated
     */
    EClass DEPENDENCIES_COMP = eINSTANCE.getDependenciesComp();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCIES_COMP__FEATURES = eINSTANCE.getDependenciesComp_Features();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.FeatureImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.IDFImpl <em>IDF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getIDF()
     * @generated
     */
    EClass IDF = eINSTANCE.getIDF();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAMEImpl <em>COMPONENT NAME</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAMEImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMPONENT_NAME()
     * @generated
     */
    EClass COMPONENT_NAME = eINSTANCE.getCOMPONENT_NAME();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_NAME__FEATURES = eINSTANCE.getCOMPONENT_NAME_Features();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAME_FEATUREImpl <em>COMPONENT NAME FEATURE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.COMPONENT_NAME_FEATUREImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getCOMPONENT_NAME_FEATURE()
     * @generated
     */
    EClass COMPONENT_NAME_FEATURE = eINSTANCE.getCOMPONENT_NAME_FEATURE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_NAME_FEATURE__NAME = eINSTANCE.getCOMPONENT_NAME_FEATURE_Name();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.PUBLICImpl <em>PUBLIC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.PUBLICImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getPUBLIC()
     * @generated
     */
    EClass PUBLIC = eINSTANCE.getPUBLIC();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.OVERRIDE_PATHImpl <em>OVERRIDE PATH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.OVERRIDE_PATHImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getOVERRIDE_PATH()
     * @generated
     */
    EClass OVERRIDE_PATH = eINSTANCE.getOVERRIDE_PATH();

    /**
     * The meta object literal for the '{@link com.espressif.idf.componen.iDFComponentDsl.impl.RULESImpl <em>RULES</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.RULESImpl
     * @see com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslPackageImpl#getRULES()
     * @generated
     */
    EClass RULES = eINSTANCE.getRULES();

  }

} //IDFComponentDslPackage
