/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/algorithm/ilp/configuration/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = org.muml.psm.allocation.algorithm.ilp.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl <em>ILP Export Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.impl.ConfigurationPackageImpl#getILPExportConfiguration()
	 * @generated
	 */
	int ILP_EXPORT_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Export Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Ilp Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>ILP Export Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_EXPORT_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ILP Export Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILP_EXPORT_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration <em>ILP Export Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILP Export Configuration</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration
	 * @generated
	 */
	EClass getILPExportConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getExportFilename <em>Export Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Filename</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getExportFilename()
	 * @see #getILPExportConfiguration()
	 * @generated
	 */
	EAttribute getILPExportConfiguration_ExportFilename();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getIlpConfiguration <em>Ilp Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ilp Configuration</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getIlpConfiguration()
	 * @see #getILPExportConfiguration()
	 * @generated
	 */
	EReference getILPExportConfiguration_IlpConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl <em>ILP Export Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl
		 * @see org.muml.psm.allocation.algorithm.ilp.configuration.impl.ConfigurationPackageImpl#getILPExportConfiguration()
		 * @generated
		 */
		EClass ILP_EXPORT_CONFIGURATION = eINSTANCE.getILPExportConfiguration();

		/**
		 * The meta object literal for the '<em><b>Export Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME = eINSTANCE.getILPExportConfiguration_ExportFilename();

		/**
		 * The meta object literal for the '<em><b>Ilp Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION = eINSTANCE.getILPExportConfiguration_IlpConfiguration();

	}

} //ConfigurationPackage
