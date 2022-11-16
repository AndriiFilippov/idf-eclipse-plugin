/**
 * generated by Xtext 2.28.0
 */
package com.espressif.idf.componen.iDFComponentDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.espressif.idf.componen.iDFComponentDsl.IDFComponentDslPackage
 * @generated
 */
public interface IDFComponentDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IDFComponentDslFactory eINSTANCE = com.espressif.idf.componen.iDFComponentDsl.impl.IDFComponentDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Component Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Model</em>'.
   * @generated
   */
  ComponentModel createComponentModel();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Version Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version Info</em>'.
   * @generated
   */
  VersionInfo createVersionInfo();

  /**
   * Returns a new object of class '<em>URL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URL</em>'.
   * @generated
   */
  URL createURL();

  /**
   * Returns a new object of class '<em>COMMENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COMMENT</em>'.
   * @generated
   */
  COMMENT createCOMMENT();

  /**
   * Returns a new object of class '<em>Dependencies Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependencies Comp</em>'.
   * @generated
   */
  DependenciesComp createDependenciesComp();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>IDF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IDF</em>'.
   * @generated
   */
  IDF createIDF();

  /**
   * Returns a new object of class '<em>COMPONENT NAME</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COMPONENT NAME</em>'.
   * @generated
   */
  COMPONENT_NAME createCOMPONENT_NAME();

  /**
   * Returns a new object of class '<em>COMPONENT NAME FEATURE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COMPONENT NAME FEATURE</em>'.
   * @generated
   */
  COMPONENT_NAME_FEATURE createCOMPONENT_NAME_FEATURE();

  /**
   * Returns a new object of class '<em>PUBLIC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PUBLIC</em>'.
   * @generated
   */
  PUBLIC createPUBLIC();

  /**
   * Returns a new object of class '<em>OVERRIDE PATH</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OVERRIDE PATH</em>'.
   * @generated
   */
  OVERRIDE_PATH createOVERRIDE_PATH();

  /**
   * Returns a new object of class '<em>RULES</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RULES</em>'.
   * @generated
   */
  RULES createRULES();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IDFComponentDslPackage getIDFComponentDslPackage();

} //IDFComponentDslFactory
