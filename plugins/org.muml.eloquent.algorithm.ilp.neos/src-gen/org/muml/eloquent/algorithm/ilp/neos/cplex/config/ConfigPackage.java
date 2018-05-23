/**
 */
package org.muml.eloquent.algorithm.ilp.neos.cplex.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/eloquent/algorithm/ilp/neos/cplex/config/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXConfigurationImpl <em>CPLEX Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXConfigurationImpl
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.ConfigPackageImpl#getCPLEXConfiguration()
	 * @generated
	 */
	int CPLEX_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_CONFIGURATION__EMAIL = 0;

	/**
	 * The number of structural features of the '<em>CPLEX Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CPLEX Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXExportConfigurationImpl <em>CPLEX Export Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXExportConfigurationImpl
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.ConfigPackageImpl#getCPLEXExportConfiguration()
	 * @generated
	 */
	int CPLEX_EXPORT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Export Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_EXPORT_CONFIGURATION__EXPORT_FILENAME = ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME;

	/**
	 * The feature id for the '<em><b>Ilp Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_EXPORT_CONFIGURATION__ILP_CONFIGURATION = ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION;

	/**
	 * The number of structural features of the '<em>CPLEX Export Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_EXPORT_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.ILP_EXPORT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CPLEX Export Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPLEX_EXPORT_CONFIGURATION_OPERATION_COUNT = ConfigurationPackage.ILP_EXPORT_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration <em>CPLEX Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPLEX Configuration</em>'.
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration
	 * @generated
	 */
	EClass getCPLEXConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration#getEmail()
	 * @see #getCPLEXConfiguration()
	 * @generated
	 */
	EAttribute getCPLEXConfiguration_Email();

	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXExportConfiguration <em>CPLEX Export Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPLEX Export Configuration</em>'.
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXExportConfiguration
	 * @generated
	 */
	EClass getCPLEXExportConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXConfigurationImpl <em>CPLEX Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXConfigurationImpl
		 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.ConfigPackageImpl#getCPLEXConfiguration()
		 * @generated
		 */
		EClass CPLEX_CONFIGURATION = eINSTANCE.getCPLEXConfiguration();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPLEX_CONFIGURATION__EMAIL = eINSTANCE.getCPLEXConfiguration_Email();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXExportConfigurationImpl <em>CPLEX Export Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.CPLEXExportConfigurationImpl
		 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl.ConfigPackageImpl#getCPLEXExportConfiguration()
		 * @generated
		 */
		EClass CPLEX_EXPORT_CONFIGURATION = eINSTANCE.getCPLEXExportConfiguration();

	}

} //ConfigPackage
