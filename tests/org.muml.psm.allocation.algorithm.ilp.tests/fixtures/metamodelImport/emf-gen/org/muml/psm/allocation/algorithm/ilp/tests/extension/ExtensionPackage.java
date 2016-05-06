/**
 */
package org.muml.psm.allocation.algorithm.ilp.tests.extension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.muml.core.CorePackage;

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
 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/algorithm/ilp/tests/extension/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.MemoryExtensionImpl <em>Memory Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.MemoryExtensionImpl
	 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.ExtensionPackageImpl#getMemoryExtension()
	 * @generated
	 */
	int MEMORY_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Amount Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION__AMOUNT_NEEDED = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Memory Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EXTENSION_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension <em>Memory Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Extension</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension
	 * @generated
	 */
	EClass getMemoryExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension#getAmountNeeded <em>Amount Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Needed</em>'.
	 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension#getAmountNeeded()
	 * @see #getMemoryExtension()
	 * @generated
	 */
	EAttribute getMemoryExtension_AmountNeeded();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.MemoryExtensionImpl <em>Memory Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.MemoryExtensionImpl
		 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.ExtensionPackageImpl#getMemoryExtension()
		 * @generated
		 */
		EClass MEMORY_EXTENSION = eINSTANCE.getMemoryExtension();

		/**
		 * The meta object literal for the '<em><b>Amount Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_EXTENSION__AMOUNT_NEEDED = eINSTANCE.getMemoryExtension_AmountNeeded();

	}

} //ExtensionPackage
