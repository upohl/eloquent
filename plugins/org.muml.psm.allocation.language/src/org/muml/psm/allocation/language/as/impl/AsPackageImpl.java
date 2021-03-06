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
import org.muml.psm.allocation.language.as.Bound;
import org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor;
import org.muml.psm.allocation.language.as.CoherenceConstraint;
import org.muml.psm.allocation.language.as.CoherenceConstraintType;
import org.muml.psm.allocation.language.as.Constraint;
import org.muml.psm.allocation.language.as.EvaluableElement;
import org.muml.psm.allocation.language.as.ForbiddenLocationConstraint;
import org.muml.psm.allocation.language.as.Goal;
import org.muml.psm.allocation.language.as.ImplicationConstraint;
import org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor;
import org.muml.psm.allocation.language.as.JavaImplementationProvider;
import org.muml.psm.allocation.language.as.LocationConstraint;
import org.muml.psm.allocation.language.as.MeasureFunction;
import org.muml.psm.allocation.language.as.NameProvider;
import org.muml.psm.allocation.language.as.OCLContext;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.Relation;
import org.muml.psm.allocation.language.as.ResourceConstraint;
import org.muml.psm.allocation.language.as.Service;
import org.muml.psm.allocation.language.as.Specification;
import org.muml.psm.allocation.language.as.StorageProvider;
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
	private EClass evaluableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundEClass = null;

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
	private EClass coherenceConstraintEClass = null;

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
	private EClass locationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forbiddenLocationConstraintEClass = null;

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
	private EClass implicationConstraintTupleDescriptorEClass = null;

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
	private EClass storageProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coherenceConstraintTypeEEnum = null;

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
	public EReference getSpecification_Relations() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Services() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Constraints() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Measure() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Goal() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_NameProvider() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_StorageProvider() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OclContext() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluableElement() {
		return evaluableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluableElement_Expression() {
		return (EReference)evaluableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_TupleDescriptor() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_LowerBound() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_UpperBound() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBound() {
		return boundEClass;
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
	public EClass getCoherenceConstraint() {
		return coherenceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoherenceConstraint_TupleDescriptor() {
		return (EReference)coherenceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoherenceConstraint_Type() {
		return (EAttribute)coherenceConstraintEClass.getEStructuralFeatures().get(1);
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
	public EClass getImplicationConstraint() {
		return implicationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationConstraint_TupleDescriptor() {
		return (EReference)implicationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForbiddenLocationConstraint() {
		return forbiddenLocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForbiddenLocationConstraint_TupleDescriptor() {
		return (EReference)forbiddenLocationConstraintEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTupleDescriptor_SequencePart() {
		return (EAttribute)tupleDescriptorEClass.getEStructuralFeatures().get(1);
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
	public EClass getImplicationConstraintTupleDescriptor() {
		return implicationConstraintTupleDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicationConstraintTupleDescriptor_Premise() {
		return (EAttribute)implicationConstraintTupleDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationConstraintTupleDescriptor_PremiseTupleDescriptor() {
		return (EReference)implicationConstraintTupleDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicationConstraintTupleDescriptor_Conclusion() {
		return (EAttribute)implicationConstraintTupleDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationConstraintTupleDescriptor_ConclusionTupleDescriptor() {
		return (EReference)implicationConstraintTupleDescriptorEClass.getEStructuralFeatures().get(3);
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
	public EClass getStorageProvider() {
		return storageProviderEClass;
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
	public EEnum getCoherenceConstraintType() {
		return coherenceConstraintTypeEEnum;
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
		createEReference(specificationEClass, SPECIFICATION__RELATIONS);
		createEReference(specificationEClass, SPECIFICATION__SERVICES);
		createEReference(specificationEClass, SPECIFICATION__CONSTRAINTS);
		createEReference(specificationEClass, SPECIFICATION__MEASURE);
		createEAttribute(specificationEClass, SPECIFICATION__GOAL);
		createEReference(specificationEClass, SPECIFICATION__NAME_PROVIDER);
		createEReference(specificationEClass, SPECIFICATION__STORAGE_PROVIDER);
		createEReference(specificationEClass, SPECIFICATION__OCL_CONTEXT);

		evaluableElementEClass = createEClass(EVALUABLE_ELEMENT);
		createEReference(evaluableElementEClass, EVALUABLE_ELEMENT__EXPRESSION);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__TUPLE_DESCRIPTOR);
		createEReference(relationEClass, RELATION__LOWER_BOUND);
		createEReference(relationEClass, RELATION__UPPER_BOUND);

		boundEClass = createEClass(BOUND);

		constraintEClass = createEClass(CONSTRAINT);

		coherenceConstraintEClass = createEClass(COHERENCE_CONSTRAINT);
		createEReference(coherenceConstraintEClass, COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR);
		createEAttribute(coherenceConstraintEClass, COHERENCE_CONSTRAINT__TYPE);

		resourceConstraintEClass = createEClass(RESOURCE_CONSTRAINT);
		createEReference(resourceConstraintEClass, RESOURCE_CONSTRAINT__TUPLE_DESCRIPTOR);

		locationConstraintEClass = createEClass(LOCATION_CONSTRAINT);
		createEReference(locationConstraintEClass, LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR);

		implicationConstraintEClass = createEClass(IMPLICATION_CONSTRAINT);
		createEReference(implicationConstraintEClass, IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR);

		forbiddenLocationConstraintEClass = createEClass(FORBIDDEN_LOCATION_CONSTRAINT);
		createEReference(forbiddenLocationConstraintEClass, FORBIDDEN_LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR);

		tupleDescriptorEClass = createEClass(TUPLE_DESCRIPTOR);
		createEReference(tupleDescriptorEClass, TUPLE_DESCRIPTOR__TYPED_PAIRS);
		createEAttribute(tupleDescriptorEClass, TUPLE_DESCRIPTOR__SEQUENCE_PART);

		weightTupleDescriptorEClass = createEClass(WEIGHT_TUPLE_DESCRIPTOR);
		createEAttribute(weightTupleDescriptorEClass, WEIGHT_TUPLE_DESCRIPTOR__WEIGHT);

		boundWeightTupleDescriptorEClass = createEClass(BOUND_WEIGHT_TUPLE_DESCRIPTOR);
		createEAttribute(boundWeightTupleDescriptorEClass, BOUND_WEIGHT_TUPLE_DESCRIPTOR__BOUND);

		implicationConstraintTupleDescriptorEClass = createEClass(IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR);
		createEAttribute(implicationConstraintTupleDescriptorEClass, IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE);
		createEReference(implicationConstraintTupleDescriptorEClass, IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR);
		createEAttribute(implicationConstraintTupleDescriptorEClass, IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION);
		createEReference(implicationConstraintTupleDescriptorEClass, IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR);

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

		storageProviderEClass = createEClass(STORAGE_PROVIDER);

		oclContextEClass = createEClass(OCL_CONTEXT);

		// Create enums
		coherenceConstraintTypeEEnum = createEEnum(COHERENCE_CONSTRAINT_TYPE);
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
		evaluableElementEClass.getESuperTypes().add(thePivotPackage.getElement());
		relationEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		relationEClass.getESuperTypes().add(this.getEvaluableElement());
		boundEClass.getESuperTypes().add(this.getEvaluableElement());
		constraintEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		constraintEClass.getESuperTypes().add(this.getEvaluableElement());
		coherenceConstraintEClass.getESuperTypes().add(this.getConstraint());
		resourceConstraintEClass.getESuperTypes().add(this.getConstraint());
		locationConstraintEClass.getESuperTypes().add(this.getConstraint());
		implicationConstraintEClass.getESuperTypes().add(this.getConstraint());
		forbiddenLocationConstraintEClass.getESuperTypes().add(this.getConstraint());
		tupleDescriptorEClass.getESuperTypes().add(thePivotPackage.getElement());
		weightTupleDescriptorEClass.getESuperTypes().add(this.getTupleDescriptor());
		boundWeightTupleDescriptorEClass.getESuperTypes().add(this.getWeightTupleDescriptor());
		implicationConstraintTupleDescriptorEClass.getESuperTypes().add(thePivotPackage.getElement());
		typedNamedPartEClass.getESuperTypes().add(thePivotPackage.getTypedElement());
		typedPairEClass.getESuperTypes().add(thePivotPackage.getElement());
		measureFunctionEClass.getESuperTypes().add(thePivotPackage.getElement());
		serviceEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		qoSDimensionEClass.getESuperTypes().add(thePivotPackage.getNamedElement());
		qoSDimensionEClass.getESuperTypes().add(this.getEvaluableElement());
		javaImplementationProviderEClass.getESuperTypes().add(thePivotPackage.getElement());
		oclContextEClass.getESuperTypes().add(thePivotPackage.getTypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Relations(), this.getRelation(), null, "relations", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Services(), this.getService(), null, "services", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Measure(), this.getMeasureFunction(), null, "measure", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Goal(), this.getGoal(), "goal", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_NameProvider(), this.getNameProvider(), null, "nameProvider", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_StorageProvider(), this.getStorageProvider(), null, "storageProvider", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OclContext(), this.getOCLContext(), null, "oclContext", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluableElementEClass, EvaluableElement.class, "EvaluableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluableElement_Expression(), thePivotPackage.getExpressionInOCL(), null, "expression", null, 1, 1, EvaluableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_LowerBound(), this.getBound(), null, "lowerBound", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_UpperBound(), this.getBound(), null, "upperBound", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundEClass, Bound.class, "Bound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coherenceConstraintEClass, CoherenceConstraint.class, "CoherenceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoherenceConstraint_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, CoherenceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoherenceConstraint_Type(), this.getCoherenceConstraintType(), "type", null, 0, 1, CoherenceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConstraintEClass, ResourceConstraint.class, "ResourceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConstraint_TupleDescriptor(), this.getBoundWeightTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, ResourceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationConstraintEClass, LocationConstraint.class, "LocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationConstraint_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, LocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationConstraintEClass, ImplicationConstraint.class, "ImplicationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicationConstraint_TupleDescriptor(), this.getImplicationConstraintTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, ImplicationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forbiddenLocationConstraintEClass, ForbiddenLocationConstraint.class, "ForbiddenLocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForbiddenLocationConstraint_TupleDescriptor(), this.getTupleDescriptor(), null, "tupleDescriptor", null, 1, 1, ForbiddenLocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleDescriptorEClass, TupleDescriptor.class, "TupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleDescriptor_TypedPairs(), this.getTypedPair(), null, "typedPairs", null, 0, -1, TupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTupleDescriptor_SequencePart(), ecorePackage.getEString(), "sequencePart", null, 0, 1, TupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weightTupleDescriptorEClass, WeightTupleDescriptor.class, "WeightTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightTupleDescriptor_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, WeightTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundWeightTupleDescriptorEClass, BoundWeightTupleDescriptor.class, "BoundWeightTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundWeightTupleDescriptor_Bound(), ecorePackage.getEString(), "bound", null, 0, 1, BoundWeightTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationConstraintTupleDescriptorEClass, ImplicationConstraintTupleDescriptor.class, "ImplicationConstraintTupleDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplicationConstraintTupleDescriptor_Premise(), ecorePackage.getEString(), "premise", null, 0, 1, ImplicationConstraintTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicationConstraintTupleDescriptor_PremiseTupleDescriptor(), this.getTupleDescriptor(), null, "premiseTupleDescriptor", null, 1, 1, ImplicationConstraintTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplicationConstraintTupleDescriptor_Conclusion(), ecorePackage.getEString(), "conclusion", null, 0, 1, ImplicationConstraintTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicationConstraintTupleDescriptor_ConclusionTupleDescriptor(), this.getTupleDescriptor(), null, "conclusionTupleDescriptor", null, 1, 1, ImplicationConstraintTupleDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(nameProviderEClass, NameProvider.class, "NameProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(nameProviderEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageProviderEClass, StorageProvider.class, "StorageProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(storageProviderEClass, null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageProviderEClass, thePivotPackage.getObject(), "store", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePivotPackage.getObject(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(storageProviderEClass, thePivotPackage.getObject(), "noRelationFound", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclContextEClass, OCLContext.class, "OCLContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(coherenceConstraintTypeEEnum, CoherenceConstraintType.class, "CoherenceConstraintType");
		addEEnumLiteral(coherenceConstraintTypeEEnum, CoherenceConstraintType.COLLOCATION);
		addEEnumLiteral(coherenceConstraintTypeEEnum, CoherenceConstraintType.SEPARATE_LOCATION);

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
		  (relationEClass, 
		   source, 
		   new String[] {
			 "constraints", "exactlyOnePairOrSequencePart"
		   });	
		addAnnotation
		  (coherenceConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "exactlyOnePair"
		   });	
		addAnnotation
		  (tupleDescriptorEClass, 
		   source, 
		   new String[] {
			 "constraints", "typedPairsOrSequencePart"
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
		  (relationEClass, 
		   source, 
		   new String[] {
			 "exactlyOnePairOrSequencePart", "self.tupleDescriptor.typedPairs->size() = 1\nor\n(\n\tnot self.tupleDescriptor.sequencePart.oclIsUndefined()\n\tand\n\tself.tupleDescriptor.sequencePart <> \'\'\n)"
		   });	
		addAnnotation
		  (coherenceConstraintEClass, 
		   source, 
		   new String[] {
			 "exactlyOnePair", "self.tupleDescriptor.typedPairs->size() = 1"
		   });	
		addAnnotation
		  (tupleDescriptorEClass, 
		   source, 
		   new String[] {
			 "typedPairsOrSequencePart", "let sequencePart : Boolean = not self.sequencePart.oclIsUndefined() and self.sequencePart <> \'\'\nin\nsequencePart implies self.typedPairs->isEmpty()\nand\nself.typedPairs->notEmpty() implies not sequencePart\nand\n(sequencePart or self.typedPairs->notEmpty())"
		   });
	}

} //AsPackageImpl
