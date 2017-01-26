/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.pivot.PivotPackage;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import org.eclipse.ocl.xtext.oclstdlibcs.OCLstdlibCSPackage;

import org.muml.core.CorePackage;

import org.muml.psm.allocation.language.cs.BoundCS;
import org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.ConstraintCS;
import org.muml.psm.allocation.language.cs.CsFactory;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.Goal;
import org.muml.psm.allocation.language.cs.JavaImplementationProviderCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.LocationConstraintTypes;
import org.muml.psm.allocation.language.cs.MeasureFunctionCS;
import org.muml.psm.allocation.language.cs.NameProviderCS;
import org.muml.psm.allocation.language.cs.OCLContextCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RelationCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.cs.ServiceCS;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.cs.StorageProviderCS;
import org.muml.psm.allocation.language.cs.TupleDescriptorCS;
import org.muml.psm.allocation.language.cs.TypedNamedPartCS;
import org.muml.psm.allocation.language.cs.TypedPairCS;
import org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS;

import org.muml.psm.allocation.language.cs.util.CsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluatableElementCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredHardwareResourceInstanceConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundWeightTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedNamedPartCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedPairCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureFunctionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDimensionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaImplementationProviderCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameProviderCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageProviderCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclContextCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationConstraintTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalEEnum = null;

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
	 * @see org.muml.psm.allocation.language.cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CsPackageImpl theCsPackage = (CsPackageImpl)(ePackage instanceof CsPackageImpl ? ePackage : new CsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompleteOCLCSPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		OCLstdlibCSPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCsPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationCS() {
		return specificationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Relations() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Services() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Constraints() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Measure() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationCS_Goal() {
		return (EAttribute)specificationCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_NameProviderImplementationClass() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_NameProvider() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_StorageProviderImplementationClass() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_StorageProvider() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_OclContext() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluatableElementCS() {
		return evaluatableElementCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluatableElementCS_Expression() {
		return (EReference)evaluatableElementCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationCS() {
		return relationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCS_TupleDescriptor() {
		return (EReference)relationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCS_LowerBound() {
		return (EReference)relationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCS_UpperBound() {
		return (EReference)relationCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundCS() {
		return boundCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintCS() {
		return constraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationConstraintCS() {
		return locationConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationConstraintCS_TupleDescriptor() {
		return (EReference)locationConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationConstraintCS_Type() {
		return (EAttribute)locationConstraintCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConstraintCS() {
		return resourceConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConstraintCS_TupleDescriptor() {
		return (EReference)resourceConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredHardwareResourceInstanceConstraintCS() {
		return requiredHardwareResourceInstanceConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptor() {
		return (EReference)requiredHardwareResourceInstanceConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleDescriptorCS() {
		return tupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleDescriptorCS_TypedPairs() {
		return (EReference)tupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightTupleDescriptorCS() {
		return weightTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightTupleDescriptorCS_Weight() {
		return (EAttribute)weightTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundWeightTupleDescriptorCS() {
		return boundWeightTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundWeightTupleDescriptorCS_Bound() {
		return (EAttribute)boundWeightTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedNamedPartCS() {
		return typedNamedPartCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedPairCS() {
		return typedPairCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedPairCS_First() {
		return (EReference)typedPairCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedPairCS_Second() {
		return (EReference)typedPairCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureFunctionCS() {
		return measureFunctionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureFunctionCS_Services() {
		return (EReference)measureFunctionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCS() {
		return serviceCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCS_Dimensions() {
		return (EReference)serviceCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDimensionCS() {
		return qoSDimensionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimensionCS_TupleDescriptor() {
		return (EReference)qoSDimensionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaImplementationProviderCS() {
		return javaImplementationProviderCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameProviderCS() {
		return nameProviderCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageProviderCS() {
		return storageProviderCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLContextCS() {
		return oclContextCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationConstraintTypes() {
		return locationConstraintTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoal() {
		return goalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
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
		specificationCSEClass = createEClass(SPECIFICATION_CS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__RELATIONS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__SERVICES);
		createEReference(specificationCSEClass, SPECIFICATION_CS__CONSTRAINTS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__MEASURE);
		createEAttribute(specificationCSEClass, SPECIFICATION_CS__GOAL);
		createEReference(specificationCSEClass, SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__NAME_PROVIDER);
		createEReference(specificationCSEClass, SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__STORAGE_PROVIDER);
		createEReference(specificationCSEClass, SPECIFICATION_CS__OCL_CONTEXT);

		evaluatableElementCSEClass = createEClass(EVALUATABLE_ELEMENT_CS);
		createEReference(evaluatableElementCSEClass, EVALUATABLE_ELEMENT_CS__EXPRESSION);

		relationCSEClass = createEClass(RELATION_CS);
		createEReference(relationCSEClass, RELATION_CS__TUPLE_DESCRIPTOR);
		createEReference(relationCSEClass, RELATION_CS__LOWER_BOUND);
		createEReference(relationCSEClass, RELATION_CS__UPPER_BOUND);

		boundCSEClass = createEClass(BOUND_CS);

		constraintCSEClass = createEClass(CONSTRAINT_CS);

		locationConstraintCSEClass = createEClass(LOCATION_CONSTRAINT_CS);
		createEReference(locationConstraintCSEClass, LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR);
		createEAttribute(locationConstraintCSEClass, LOCATION_CONSTRAINT_CS__TYPE);

		resourceConstraintCSEClass = createEClass(RESOURCE_CONSTRAINT_CS);
		createEReference(resourceConstraintCSEClass, RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR);

		requiredHardwareResourceInstanceConstraintCSEClass = createEClass(REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS);
		createEReference(requiredHardwareResourceInstanceConstraintCSEClass, REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR);

		tupleDescriptorCSEClass = createEClass(TUPLE_DESCRIPTOR_CS);
		createEReference(tupleDescriptorCSEClass, TUPLE_DESCRIPTOR_CS__TYPED_PAIRS);

		weightTupleDescriptorCSEClass = createEClass(WEIGHT_TUPLE_DESCRIPTOR_CS);
		createEAttribute(weightTupleDescriptorCSEClass, WEIGHT_TUPLE_DESCRIPTOR_CS__WEIGHT);

		boundWeightTupleDescriptorCSEClass = createEClass(BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS);
		createEAttribute(boundWeightTupleDescriptorCSEClass, BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__BOUND);

		typedNamedPartCSEClass = createEClass(TYPED_NAMED_PART_CS);

		typedPairCSEClass = createEClass(TYPED_PAIR_CS);
		createEReference(typedPairCSEClass, TYPED_PAIR_CS__FIRST);
		createEReference(typedPairCSEClass, TYPED_PAIR_CS__SECOND);

		measureFunctionCSEClass = createEClass(MEASURE_FUNCTION_CS);
		createEReference(measureFunctionCSEClass, MEASURE_FUNCTION_CS__SERVICES);

		serviceCSEClass = createEClass(SERVICE_CS);
		createEReference(serviceCSEClass, SERVICE_CS__DIMENSIONS);

		qoSDimensionCSEClass = createEClass(QO_SDIMENSION_CS);
		createEReference(qoSDimensionCSEClass, QO_SDIMENSION_CS__TUPLE_DESCRIPTOR);

		javaImplementationProviderCSEClass = createEClass(JAVA_IMPLEMENTATION_PROVIDER_CS);

		nameProviderCSEClass = createEClass(NAME_PROVIDER_CS);

		storageProviderCSEClass = createEClass(STORAGE_PROVIDER_CS);

		oclContextCSEClass = createEClass(OCL_CONTEXT_CS);

		// Create enums
		locationConstraintTypesEEnum = createEEnum(LOCATION_CONSTRAINT_TYPES);
		goalEEnum = createEEnum(GOAL);
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
		CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteOCLCSPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);
		OCLstdlibCSPackage theOCLstdlibCSPackage = (OCLstdlibCSPackage)EPackage.Registry.INSTANCE.getEPackage(OCLstdlibCSPackage.eNS_URI);
		PivotPackage thePivotPackage = (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specificationCSEClass.getESuperTypes().add(theCompleteOCLCSPackage.getCompleteOCLDocumentCS());
		specificationCSEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		evaluatableElementCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		relationCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		relationCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		boundCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		constraintCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		constraintCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		locationConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		resourceConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		requiredHardwareResourceInstanceConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		tupleDescriptorCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		weightTupleDescriptorCSEClass.getESuperTypes().add(this.getTupleDescriptorCS());
		boundWeightTupleDescriptorCSEClass.getESuperTypes().add(this.getWeightTupleDescriptorCS());
		typedNamedPartCSEClass.getESuperTypes().add(theBaseCSPackage.getTypedElementCS());
		typedPairCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		measureFunctionCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		serviceCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		qoSDimensionCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		qoSDimensionCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		javaImplementationProviderCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		javaImplementationProviderCSEClass.getESuperTypes().add(theOCLstdlibCSPackage.getJavaImplementationCS());
		oclContextCSEClass.getESuperTypes().add(theBaseCSPackage.getTypedElementCS());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationCSEClass, SpecificationCS.class, "SpecificationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationCS_Relations(), this.getRelationCS(), null, "relations", null, 0, -1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_Services(), this.getServiceCS(), null, "services", null, 0, -1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_Constraints(), this.getConstraintCS(), null, "constraints", null, 0, -1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_Measure(), this.getMeasureFunctionCS(), null, "measure", null, 0, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationCS_Goal(), this.getGoal(), "goal", null, 0, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_NameProviderImplementationClass(), this.getJavaImplementationProviderCS(), null, "nameProviderImplementationClass", null, 1, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_NameProvider(), this.getNameProviderCS(), null, "nameProvider", null, 0, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_StorageProviderImplementationClass(), this.getJavaImplementationProviderCS(), null, "storageProviderImplementationClass", null, 1, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_StorageProvider(), this.getStorageProviderCS(), null, "storageProvider", null, 0, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_OclContext(), this.getOCLContextCS(), null, "oclContext", null, 1, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluatableElementCSEClass, EvaluatableElementCS.class, "EvaluatableElementCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluatableElementCS_Expression(), theEssentialOCLCSPackage.getContextCS(), null, "expression", null, 1, 1, EvaluatableElementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationCSEClass, RelationCS.class, "RelationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationCS_TupleDescriptor(), this.getTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, RelationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCS_LowerBound(), this.getBoundCS(), null, "lowerBound", null, 1, 1, RelationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCS_UpperBound(), this.getBoundCS(), null, "upperBound", null, 1, 1, RelationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundCSEClass, BoundCS.class, "BoundCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintCSEClass, ConstraintCS.class, "ConstraintCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationConstraintCSEClass, LocationConstraintCS.class, "LocationConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationConstraintCS_TupleDescriptor(), this.getTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, LocationConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationConstraintCS_Type(), this.getLocationConstraintTypes(), "type", null, 1, 1, LocationConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConstraintCSEClass, ResourceConstraintCS.class, "ResourceConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConstraintCS_TupleDescriptor(), this.getBoundWeightTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, ResourceConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredHardwareResourceInstanceConstraintCSEClass, RequiredHardwareResourceInstanceConstraintCS.class, "RequiredHardwareResourceInstanceConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptor(), this.getTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, RequiredHardwareResourceInstanceConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleDescriptorCSEClass, TupleDescriptorCS.class, "TupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleDescriptorCS_TypedPairs(), this.getTypedPairCS(), null, "typedPairs", null, 1, -1, TupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weightTupleDescriptorCSEClass, WeightTupleDescriptorCS.class, "WeightTupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightTupleDescriptorCS_Weight(), ecorePackage.getEString(), "weight", null, 1, 1, WeightTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundWeightTupleDescriptorCSEClass, BoundWeightTupleDescriptorCS.class, "BoundWeightTupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundWeightTupleDescriptorCS_Bound(), ecorePackage.getEString(), "bound", null, 1, 1, BoundWeightTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedNamedPartCSEClass, TypedNamedPartCS.class, "TypedNamedPartCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedPairCSEClass, TypedPairCS.class, "TypedPairCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedPairCS_First(), this.getTypedNamedPartCS(), null, "first", null, 1, 1, TypedPairCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedPairCS_Second(), this.getTypedNamedPartCS(), null, "second", null, 1, 1, TypedPairCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureFunctionCSEClass, MeasureFunctionCS.class, "MeasureFunctionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureFunctionCS_Services(), this.getServiceCS(), null, "services", null, 0, -1, MeasureFunctionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCSEClass, ServiceCS.class, "ServiceCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceCS_Dimensions(), this.getQoSDimensionCS(), null, "dimensions", null, 0, -1, ServiceCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimensionCSEClass, QoSDimensionCS.class, "QoSDimensionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSDimensionCS_TupleDescriptor(), this.getWeightTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, QoSDimensionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaImplementationProviderCSEClass, JavaImplementationProviderCS.class, "JavaImplementationProviderCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameProviderCSEClass, NameProviderCS.class, "NameProviderCS", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(nameProviderCSEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageProviderCSEClass, StorageProviderCS.class, "StorageProviderCS", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(storageProviderCSEClass, null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageProviderCSEClass, thePivotPackage.getObject(), "store", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(storageProviderCSEClass, thePivotPackage.getObject(), "noRelationFound", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclContextCSEClass, OCLContextCS.class, "OCLContextCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(locationConstraintTypesEEnum, LocationConstraintTypes.class, "LocationConstraintTypes");
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.SAME_LOCATION);
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.DIFFERENT_LOCATION);

		initEEnum(goalEEnum, Goal.class, "Goal");
		addEEnumLiteral(goalEEnum, Goal.MAX);
		addEEnumLiteral(goalEEnum, Goal.MIN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (relationCSEClass, 
		   source, 
		   new String[] {
			 "constraints", "exactlyOnePair"
		   });	
		addAnnotation
		  (locationConstraintCSEClass, 
		   source, 
		   new String[] {
			 "constraints", "exactlyOnePair"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (relationCSEClass, 
		   source, 
		   new String[] {
			 "exactlyOnePair", "self.tupleDescriptor.typedPairs->size() = 1"
		   });	
		addAnnotation
		  (locationConstraintCSEClass, 
		   source, 
		   new String[] {
			 "exactlyOnePair", "self.tupleDescriptor.typedPairs->size() = 1"
		   });
	}

} //CsPackageImpl
