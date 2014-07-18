/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.oclcontext;

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
 * <!-- begin-model-doc -->
 * This package provides the OCL context class.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextFactory
 * @model kind="package"
 * @generated
 */
public interface OclcontextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oclcontext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/allocation/language/0.1.0/oclcontext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oclcontext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OclcontextPackage eINSTANCE = de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OclcontextPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OCLContextImpl <em>OCL Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OCLContextImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OclcontextPackageImpl#getOCLContext()
	 * @generated
	 */
	int OCL_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Component Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Hardware Platform Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>OCL Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OCL Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext <em>OCL Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Context</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext
	 * @generated
	 */
	EClass getOCLContext();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration()
	 * @see #getOCLContext()
	 * @generated
	 */
	EReference getOCLContext_ComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Platform Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration()
	 * @see #getOCLContext()
	 * @generated
	 */
	EReference getOCLContext_HardwarePlatformInstanceConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OclcontextFactory getOclcontextFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OCLContextImpl <em>OCL Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OCLContextImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OclcontextPackageImpl#getOCLContext()
		 * @generated
		 */
		EClass OCL_CONTEXT = eINSTANCE.getOCLContext();

		/**
		 * The meta object literal for the '<em><b>Component Instance Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getOCLContext_ComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Hardware Platform Instance Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION = eINSTANCE.getOCLContext_HardwarePlatformInstanceConfiguration();

	}

} //OclcontextPackage
