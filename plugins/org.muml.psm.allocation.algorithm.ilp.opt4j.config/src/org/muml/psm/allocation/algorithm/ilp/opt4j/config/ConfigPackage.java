/**
 */
package org.muml.psm.allocation.algorithm.ilp.opt4j.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigFactory
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
	String eNS_URI = "http://www.muml.org/psm/allocation/algorithm/ilp/opt4j/config/1.0.0";

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
	ConfigPackage eINSTANCE = org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl <em>Opt4j Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.ConfigPackageImpl#getOpt4jConfiguration()
	 * @generated
	 */
	int OPT4J_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION__POPULATION_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION__GENERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION__PARENTS = 2;

	/**
	 * The feature id for the '<em><b>Offspring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION__OFFSPRING = 3;

	/**
	 * The feature id for the '<em><b>No Dominated Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS = 4;

	/**
	 * The number of structural features of the '<em>Opt4j Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Opt4j Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT4J_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration <em>Opt4j Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt4j Configuration</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration
	 * @generated
	 */
	EClass getOpt4jConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getPopulationSize <em>Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Size</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getPopulationSize()
	 * @see #getOpt4jConfiguration()
	 * @generated
	 */
	EAttribute getOpt4jConfiguration_PopulationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getGenerations <em>Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generations</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getGenerations()
	 * @see #getOpt4jConfiguration()
	 * @generated
	 */
	EAttribute getOpt4jConfiguration_Generations();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parents</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getParents()
	 * @see #getOpt4jConfiguration()
	 * @generated
	 */
	EAttribute getOpt4jConfiguration_Parents();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getOffspring <em>Offspring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offspring</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getOffspring()
	 * @see #getOpt4jConfiguration()
	 * @generated
	 */
	EAttribute getOpt4jConfiguration_Offspring();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#isNoDominatedSolutions <em>No Dominated Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Dominated Solutions</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#isNoDominatedSolutions()
	 * @see #getOpt4jConfiguration()
	 * @generated
	 */
	EAttribute getOpt4jConfiguration_NoDominatedSolutions();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl <em>Opt4j Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl
		 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.ConfigPackageImpl#getOpt4jConfiguration()
		 * @generated
		 */
		EClass OPT4J_CONFIGURATION = eINSTANCE.getOpt4jConfiguration();

		/**
		 * The meta object literal for the '<em><b>Population Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT4J_CONFIGURATION__POPULATION_SIZE = eINSTANCE.getOpt4jConfiguration_PopulationSize();

		/**
		 * The meta object literal for the '<em><b>Generations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT4J_CONFIGURATION__GENERATIONS = eINSTANCE.getOpt4jConfiguration_Generations();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT4J_CONFIGURATION__PARENTS = eINSTANCE.getOpt4jConfiguration_Parents();

		/**
		 * The meta object literal for the '<em><b>Offspring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT4J_CONFIGURATION__OFFSPRING = eINSTANCE.getOpt4jConfiguration_Offspring();

		/**
		 * The meta object literal for the '<em><b>No Dominated Solutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS = eINSTANCE.getOpt4jConfiguration_NoDominatedSolutions();

	}

} //ConfigPackage
