/**
 */
package org.muml.psm.allocation.language.oclcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.psm.allocation.language.oclcontext.OCLContext;
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory;
import org.muml.psm.allocation.language.oclcontext.OclcontextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OclcontextPackageImpl extends EPackageImpl implements OclcontextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclContextEClass = null;

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
	 * @see org.muml.psm.allocation.language.oclcontext.OclcontextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OclcontextPackageImpl() {
		super(eNS_URI, OclcontextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OclcontextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OclcontextPackage init() {
		if (isInited) return (OclcontextPackage)EPackage.Registry.INSTANCE.getEPackage(OclcontextPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OclcontextPackageImpl theOclcontextPackage = (OclcontextPackageImpl)(ePackage instanceof OclcontextPackageImpl ? ePackage : new OclcontextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HardwarePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOclcontextPackage.createPackageContents();

		// Initialize created meta-data
		theOclcontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOclcontextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OclcontextPackage.eNS_URI, theOclcontextPackage);
		return theOclcontextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLContext() {
		return oclContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLContext_ComponentInstanceConfiguration() {
		return (EReference)oclContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLContext_HardwarePlatformInstanceConfiguration() {
		return (EReference)oclContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclcontextFactory getOclcontextFactory() {
		return (OclcontextFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oclContextEClass = createEClass(OCL_CONTEXT);
		createEReference(oclContextEClass, OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(oclContextEClass, OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		HwplatforminstancePackage theHwplatforminstancePackage = (HwplatforminstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(oclContextEClass, OCLContext.class, "OCLContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOCLContext_ComponentInstanceConfiguration(), theInstancePackage.getComponentInstanceConfiguration(), null, "componentInstanceConfiguration", null, 0, 1, OCLContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOCLContext_HardwarePlatformInstanceConfiguration(), theHwplatforminstancePackage.getHWPlatformInstanceConfiguration(), null, "hardwarePlatformInstanceConfiguration", null, 0, 1, OCLContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OclcontextPackageImpl
