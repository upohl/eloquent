/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.Constraint;
import de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.LanguageFactory;
import de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage;
import de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint;
import de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes;
import de.uni_paderborn.fujaba.muml.allocation.language.LocationTupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction;
import de.uni_paderborn.fujaba.muml.allocation.language.OptionalNamedElement;
import de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension;
import de.uni_paderborn.fujaba.muml.allocation.language.RequiredHardwareResourceInstanceConstraint;
import de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint;
import de.uni_paderborn.fujaba.muml.allocation.language.Service;
import de.uni_paderborn.fujaba.muml.allocation.language.Specification;
import de.uni_paderborn.fujaba.muml.allocation.language.TupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguagePackageImpl extends EPackageImpl implements LanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalNamedElementEClass = null;

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
	private EClass instanceTupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentResourceTupleDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTupleDescriptorEClass = null;

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
	private EEnum locationConstraintTypesEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LanguagePackageImpl() {
		super(eNS_URI, LanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LanguagePackage init() {
		if (isInited) return (LanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);

		// Obtain or create and register package
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LanguagePackage.eNS_URI, theLanguagePackage);
		return theLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalNamedElement() {
		return optionalNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalNamedElement_Name() {
		return (EAttribute)optionalNamedElementEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getQoSDimension_Metric() {
		return (EAttribute)qoSDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimension_TupleDescriptors() {
		return (EReference)qoSDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSDimension_Value() {
		return (EReference)qoSDimensionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getConstraint_Expression() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
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
	public EReference getLocationConstraint_TupleDescriptors() {
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
	public EReference getResourceConstraint_TupleDescriptors() {
		return (EReference)resourceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConstraint_Lhs() {
		return (EReference)resourceConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConstraint_Rhs() {
		return (EReference)resourceConstraintEClass.getEStructuralFeatures().get(2);
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
	public EReference getRequiredHardwareResourceInstanceConstraint_TupleDescriptors() {
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
	public EClass getInstanceTupleDescriptor() {
		return instanceTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceTupleDescriptor_Instance() {
		return (EAttribute)instanceTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationTupleDescriptor() {
		return locationTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTupleDescriptor_Instances() {
		return (EAttribute)locationTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentResourceTupleDescriptor() {
		return componentResourceTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResourceTupleDescriptor_Hwresinstance() {
		return (EAttribute)componentResourceTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTupleDescriptor() {
		return valueTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTupleDescriptor_Value() {
		return (EAttribute)valueTupleDescriptorEClass.getEStructuralFeatures().get(0);
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
	public EEnum getLocationConstraintTypes() {
		return locationConstraintTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFactory getLanguageFactory() {
		return (LanguageFactory)getEFactoryInstance();
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
		optionalNamedElementEClass = createEClass(OPTIONAL_NAMED_ELEMENT);
		createEAttribute(optionalNamedElementEClass, OPTIONAL_NAMED_ELEMENT__NAME);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SERVICES);
		createEReference(specificationEClass, SPECIFICATION__CONSTRAINTS);
		createEReference(specificationEClass, SPECIFICATION__MEASURE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__DIMENSIONS);

		qoSDimensionEClass = createEClass(QO_SDIMENSION);
		createEAttribute(qoSDimensionEClass, QO_SDIMENSION__METRIC);
		createEReference(qoSDimensionEClass, QO_SDIMENSION__TUPLE_DESCRIPTORS);
		createEReference(qoSDimensionEClass, QO_SDIMENSION__VALUE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__EXPRESSION);

		locationConstraintEClass = createEClass(LOCATION_CONSTRAINT);
		createEReference(locationConstraintEClass, LOCATION_CONSTRAINT__TUPLE_DESCRIPTORS);
		createEAttribute(locationConstraintEClass, LOCATION_CONSTRAINT__TYPE);

		resourceConstraintEClass = createEClass(RESOURCE_CONSTRAINT);
		createEReference(resourceConstraintEClass, RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS);
		createEReference(resourceConstraintEClass, RESOURCE_CONSTRAINT__LHS);
		createEReference(resourceConstraintEClass, RESOURCE_CONSTRAINT__RHS);

		requiredHardwareResourceInstanceConstraintEClass = createEClass(REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT);
		createEReference(requiredHardwareResourceInstanceConstraintEClass, REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTORS);

		tupleDescriptorEClass = createEClass(TUPLE_DESCRIPTOR);

		instanceTupleDescriptorEClass = createEClass(INSTANCE_TUPLE_DESCRIPTOR);
		createEAttribute(instanceTupleDescriptorEClass, INSTANCE_TUPLE_DESCRIPTOR__INSTANCE);

		locationTupleDescriptorEClass = createEClass(LOCATION_TUPLE_DESCRIPTOR);
		createEAttribute(locationTupleDescriptorEClass, LOCATION_TUPLE_DESCRIPTOR__INSTANCES);

		componentResourceTupleDescriptorEClass = createEClass(COMPONENT_RESOURCE_TUPLE_DESCRIPTOR);
		createEAttribute(componentResourceTupleDescriptorEClass, COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE);

		valueTupleDescriptorEClass = createEClass(VALUE_TUPLE_DESCRIPTOR);
		createEAttribute(valueTupleDescriptorEClass, VALUE_TUPLE_DESCRIPTOR__VALUE);

		measureFunctionEClass = createEClass(MEASURE_FUNCTION);
		createEReference(measureFunctionEClass, MEASURE_FUNCTION__SERVICES);

		// Create enums
		locationConstraintTypesEEnum = createEEnum(LOCATION_CONSTRAINT_TYPES);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specificationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		serviceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		qoSDimensionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		constraintEClass.getESuperTypes().add(this.getOptionalNamedElement());
		locationConstraintEClass.getESuperTypes().add(this.getConstraint());
		resourceConstraintEClass.getESuperTypes().add(this.getConstraint());
		requiredHardwareResourceInstanceConstraintEClass.getESuperTypes().add(this.getConstraint());
		instanceTupleDescriptorEClass.getESuperTypes().add(this.getTupleDescriptor());
		locationTupleDescriptorEClass.getESuperTypes().add(this.getInstanceTupleDescriptor());
		componentResourceTupleDescriptorEClass.getESuperTypes().add(this.getInstanceTupleDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(optionalNamedElementEClass, OptionalNamedElement.class, "OptionalNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionalNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, OptionalNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Services(), this.getService(), null, "services", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Measure(), this.getMeasureFunction(), null, "measure", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Dimensions(), this.getQoSDimension(), null, "dimensions", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimensionEClass, QoSDimension.class, "QoSDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoSDimension_Metric(), ecorePackage.getEString(), "metric", null, 1, 1, QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSDimension_TupleDescriptors(), this.getComponentResourceTupleDescriptor(), null, "tupleDescriptors", null, 1, -1, QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoSDimension_Value(), this.getValueTupleDescriptor(), null, "value", null, 1, 1, QoSDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationConstraintEClass, LocationConstraint.class, "LocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationConstraint_TupleDescriptors(), this.getLocationTupleDescriptor(), null, "tupleDescriptors", null, 1, -1, LocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationConstraint_Type(), this.getLocationConstraintTypes(), "type", null, 1, 1, LocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConstraintEClass, ResourceConstraint.class, "ResourceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConstraint_TupleDescriptors(), this.getComponentResourceTupleDescriptor(), null, "tupleDescriptors", null, 1, -1, ResourceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConstraint_Lhs(), this.getValueTupleDescriptor(), null, "lhs", null, 1, 1, ResourceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConstraint_Rhs(), this.getValueTupleDescriptor(), null, "rhs", null, 1, 1, ResourceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredHardwareResourceInstanceConstraintEClass, RequiredHardwareResourceInstanceConstraint.class, "RequiredHardwareResourceInstanceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredHardwareResourceInstanceConstraint_TupleDescriptors(), this.getComponentResourceTupleDescriptor(), null, "tupleDescriptors", null, 1, -1, RequiredHardwareResourceInstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleDescriptorEClass, TupleDescriptor.class, "TupleDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceTupleDescriptorEClass, InstanceTupleDescriptor.class, "InstanceTupleDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceTupleDescriptor_Instance(), ecorePackage.getEString(), "instance", null, 1, 1, InstanceTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTupleDescriptorEClass, LocationTupleDescriptor.class, "LocationTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationTupleDescriptor_Instances(), ecorePackage.getEString(), "instances", null, 1, 1, LocationTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentResourceTupleDescriptorEClass, ComponentResourceTupleDescriptor.class, "ComponentResourceTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentResourceTupleDescriptor_Hwresinstance(), ecorePackage.getEString(), "hwresinstance", null, 1, 1, ComponentResourceTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTupleDescriptorEClass, ValueTupleDescriptor.class, "ValueTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueTupleDescriptor_Value(), ecorePackage.getEString(), "value", null, 1, 1, ValueTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureFunctionEClass, MeasureFunction.class, "MeasureFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureFunction_Services(), this.getService(), null, "services", null, 0, -1, MeasureFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(locationConstraintTypesEEnum, LocationConstraintTypes.class, "LocationConstraintTypes");
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.SAME_LOCATION);
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.DIFFERENT_LOCATION);

		// Create resource
		createResource(eNS_URI);
	}

} //LanguagePackageImpl
