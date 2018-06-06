/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = org.muml.psm.allocation.algorithm.ilp.configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ILP Export Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ILP Export Configuration</em>'.
	 * @generated
	 */
	<T> ILPExportConfiguration<T> createILPExportConfiguration();

	/**
	 * Returns a new object of class '<em>ILP Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ILP Configuration</em>'.
	 * @generated
	 */
	ILPConfiguration createILPConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
