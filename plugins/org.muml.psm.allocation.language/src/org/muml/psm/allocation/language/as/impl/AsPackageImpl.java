/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.pivot.PivotPackage;

import org.muml.psm.allocation.language.as.AsFactory;
import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor;
import org.muml.psm.allocation.language.as.Constraint;
import org.muml.psm.allocation.language.as.EvaluatableElement;
import org.muml.psm.allocation.language.as.Goal;
import org.muml.psm.allocation.language.as.JavaImplementationProvider;
import org.muml.psm.allocation.language.as.LocationConstraint;
import org.muml.psm.allocation.language.as.LocationConstraintTypes;
import org.muml.psm.allocation.language.as.MeasureFunction;
import org.muml.psm.allocation.language.as.NameProvider;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint;
import org.muml.psm.allocation.language.as.ResourceConstraint;
import org.muml.psm.allocation.language.as.Service;
import org.muml.psm.allocation.language.as.Specification;
import org.muml.psm.allocation.language.as.TupleDescriptor;
import org.muml.psm.allocation.language.as.TypedNamedPart;
import org.muml.psm.allocation.language.as.TypedPair;
import org.muml.psm.allocation.language.as.WeightTupleDescriptor;

import org.muml.psm.allocation.language.as.util.AsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsPackageImpl extends EPackageImpl implements AsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredHardwareResourceInstanceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightTupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundWeightTupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedNamedPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaImplementationProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameProviderEClass = null;

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
	 * @see org.muml.psm.allocation.language.as.AsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AsPackageImpl() {
		super(eNS_URI, AsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AsPackage init() {
		if (isInited) return (AsPackage)EPackage.Registry.INSTANCE.getEPackage(AsPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AsPackageImpl theAsPackage = (AsPackageImpl)(ePackage instanceof AsPackageImpl ? ePackage : new AsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PivotPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAsPackage.createPackageContents();

		// Initialize created meta-data
		theAsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AsPackage.eNS_URI, theAsPackage);
		return theAsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Services() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Constraints() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Measure() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Goal() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_NameProvider() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluatableElement() {
		return evaluatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluatableElement_Expression() {
		return (EReference)evaluatableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationConstraint() {
		return locationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationConstraint_TupleDescriptor() {
		return (EReference)locationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationConstraint_Type() {
		return (EAttribute)locationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConstraint() {
		return resourceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConstraint_TupleDescriptor() {
		return (EReference)resourceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredHardwareResourceInstanceConstraint() {
		return requiredHardwareResourceInstanceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredHardwareResourceInstanceConstraint_TupleDescriptor() {
		return (EReference)requiredHardwareResourceInstanceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleDescriptor() {
		return tupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleDescriptor_TypedPairs() {
		return (EReference)tupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightTupleDescriptor() {
		return weightTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightTupleDescriptor_Weight() {
		return (EAttribute)weightTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundWeightTupleDescriptor() {
		return boundWeightTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundWeightTupleDescriptor_Bound() {
		return (EAttribute)boundWeightTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedNamedPart() {
		return typedNamedPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedPair() {
		return typedPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedPair_First() {
		return (EReference)typedPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedPair_Second() {
		return (EReference)typedPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureFunction() {
		return measureFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureFunction_Services() {
		return (EReference)measureFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Dimensions() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDimension() {
		return qoSDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimension_TupleDescriptor() {
		return (EReference)qoSDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaImplementationProvider() {
		return javaImplementationProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameProvider() {
		return nameProviderEClass;
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
	public AsFactory getAsFactory() {
		return (AsFactory)getEFactoryInstance();
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
		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SERVICES);
		createEReference(specificationEClass, SPECIFICATION__CONSTRAINTS);
		createEReference(specificationEClass, SPECIFICATION__MEASURE);
		createEAttribute(specificationEClass, SPECIFICATION__GOAL);
		createEReference(specificationEClass, SPECIFICATION__NAME_PROVIDER);

		evaluatableElementEClass = createEClass(EVALUATABLE_ELEMENT);
		createEReference(evaluatableElementEClass, EVALUATABLE_ELEMENT__EXPRESSION);

		constraintEClass = createEClass(CONSTRAINT);

		locationConstraintEClass = createEClass(LOCATION_CONSTRAINT);
		createEReference(locationConstraintEClass, LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR);
		createEAttribute(locationConstraintEClass, LOCATION_CONSTRAINT__TYPE);

		resourceConstraintEClass = createEClass(RESOURCE_CONSTRAINT);
		createEReference(resourceConstraintEClass, RESOURCE_CONSTRAINT__TUPLE_DESCRIPTOR);

		requiredHardwareResourceInstanceConstraintEClass = createEClass(REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT);
		createEReference(requiredHardwareResourceInstanceConstraintEClass, REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTOR);

		tupleDescriptorEClass = createEClass(TUPLE_DESCRIPTOR);
		createEReference(tupleDescriptorEClass, TUPLE_DESCRIPTOR__TYPED_PAIRS);

		weightTupleDescriptorEClass = createEClass(WEIGHT_TUPLE_DESCRIPTOR);
		createEAttribute(weightTupleDescriptorEClass, WEIGHT_TUPLE_DESCRIPTOR__WEIGHT);

		boundWeightTupleDescriptorEClass = createEClass(BOUND_WEIGHT_TUPLE_DESCRIPTOR);
		createEAttribute(boundWeightTupleDescriptorEClass, BOUND_WEIGHT_TUPLE_DESCRIPTOR__BOUND);

		typedNamedPartEClass = createEClass(TYPED_NAMED_PART);

		typedPairEClass = createEClass(TYPED_PAIR);
		createEReference(typedPairEClass, TYPED_PAIR__FIRST);
		createEReference(typedPairEClass, TYPED_PAIR__SECOND);

		measureFunctionEClass = createEClass(MEASURE_FUNCTION);
		createEReference(measureFunctionEClass, MEASURE_FUNCTION__SERVICES);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__DIMENSIONS);

		qoSDimensionEClass = createEClass(QO_SDIMENSION);
		createEReference(qoSDimensionEClass, QO_SDIMENSION__TUPLE_DESCRIPTOR);

		javaImplementationProviderEClass = createEClass(JAVA_IMPLEMENTATION_PROVIDER);

		nameProviderEClass = createEClass(NAME_PROVIDER);

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
		PivotPackage thePivotPackage = (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specificationEClass.getESuperTypes().add(thePivotPackage.getModel());
		evaluatableElementEClass.getESuperTypes().add(thePivotPackage.getElement());
		constraintEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		constraintEClass.getESuperTypes().add(this.getEvaluatableElement());
		locationConstraintEClass.getESuperTypes().add(this.getConstraint());
		resourceConstraintEClass.getESuperTypes().add(this.getConstraint());
		requiredHardwareResourceInstanceConstraintEClass.getESuperTypes().add(this.getConstraint());
		tupleDescriptorEClass.getESuperTypes().add(thePivotPackage.getElement());
		weightTupleDescriptorEClass.getESuperTypes().add(this.getTupleDescriptor());
		boundWeightTupleDescriptorEClass.getESuperTypes().add(this.getWeightTupleDescriptor());
		typedNamedPartEClass.getESuperTypes().add(thePivotPackage.getTypedElement());
		typedPairEClass.getESuperTypes().add(thePivotPackage.getElement());
		measureFunctionEClass.getESuperTypes().add(thePivotPackage.getElement());
		serviceEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		qoSDimensionEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		qoSDimensionEClass.getESuperTypes().add(this.getEvaluatableElement());
		javaImplementationProviderEClass.getESuperTypes().add(thePivotPackage.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Services(), this.getService(), null, "services", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Measure(), this.getMeasureFunction(), null, "measure", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Goal(), this.getGoal(), "goal", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_NameProvider(), this.getNameProvider(), null, "nameProvider", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluatableElementEClass, EvaluatableElement.class, "EvaluatableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluatableElement_Expression(), thePivotPackage.getExpressionInOCL(), null, "expression", null, 1, 1, EvaluatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationConstraintEClass, LocationConstraint.class, "LocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationConstraint_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, LocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationConstraint_Type(), this.getLocationConstraintTypes(), "type", null, 0, 1, LocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConstraintEClass, ResourceConstraint.class, "ResourceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConstraint_TupleDescriptor(), this.getBoundWeightTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, ResourceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredHardwareResourceInstanceConstraintEClass, RequiredHardwareResourceInstanceConstraint.class, "RequiredHardwareResourceInstanceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredHardwareResourceInstanceConstraint_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, RequiredHardwareResourceInstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleDescriptorEClass, TupleDescriptor.class, "TupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleDescriptor_TypedPairs(), this.getTypedPair(), null, "typedPairs", null, 1, -1, TupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weightTupleDescriptorEClass, WeightTupleDescriptor.class, "WeightTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightTupleDescriptor_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, WeightTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundWeightTupleDescriptorEClass, BoundWeightTupleDescriptor.class, "BoundWeightTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundWeightTupleDescriptor_Bound(), ecorePackage.getEString(), "bound", null, 0, 1, BoundWeightTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedNamedPartEClass, TypedNamedPart.class, "TypedNamedPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedPairEClass, TypedPair.class, "TypedPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedPair_First(), this.getTypedNamedPart(), null, "first", null, 1, 1, TypedPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedPair_Second(), this.getTypedNamedPart(), null, "second", null, 1, 1, TypedPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureFunctionEClass, MeasureFunction.class, "MeasureFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureFunction_Services(), this.getService(), null, "services", null, 0, -1, MeasureFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Dimensions(), this.getQoSDimension(), null, "dimensions", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimensionEClass, QoSDimension.class, "QoSDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQoSDimension_TupleDescriptor(), this.getWeightTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaImplementationProviderEClass, JavaImplementationProvider.class, "JavaImplementationProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameProviderEClass, NameProvider.class, "NameProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(nameProviderEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

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
		  (locationConstraintEClass, 
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
		  (locationConstraintEClass, 
		   source, 
		   new String[] {
			 "exactlyOnePair", "self.tupleDescriptor.typedPairs->size() = 1"
		   });
	}

} //AsPackageImpl
