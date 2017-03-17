/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.psm.allocation.language.as.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsFactoryImpl extends EFactoryImpl implements AsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsFactory init() {
		try {
			AsFactory theAsFactory = (AsFactory)EPackage.Registry.INSTANCE.getEFactory(AsPackage.eNS_URI);
			if (theAsFactory != null) {
				return theAsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AsPackage.SPECIFICATION: return createSpecification();
			case AsPackage.RELATION: return createRelation();
			case AsPackage.BOUND: return createBound();
			case AsPackage.COHERENCE_CONSTRAINT: return createCoherenceConstraint();
			case AsPackage.RESOURCE_CONSTRAINT: return createResourceConstraint();
			case AsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT: return createRequiredHardwareResourceInstanceConstraint();
			case AsPackage.TUPLE_DESCRIPTOR: return createTupleDescriptor();
			case AsPackage.WEIGHT_TUPLE_DESCRIPTOR: return createWeightTupleDescriptor();
			case AsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR: return createBoundWeightTupleDescriptor();
			case AsPackage.TYPED_NAMED_PART: return createTypedNamedPart();
			case AsPackage.TYPED_PAIR: return createTypedPair();
			case AsPackage.MEASURE_FUNCTION: return createMeasureFunction();
			case AsPackage.SERVICE: return createService();
			case AsPackage.QO_SDIMENSION: return createQoSDimension();
			case AsPackage.JAVA_IMPLEMENTATION_PROVIDER: return createJavaImplementationProvider();
			case AsPackage.OCL_CONTEXT: return createOCLContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AsPackage.COHERENCE_CONSTRAINT_TYPE:
				return createCoherenceConstraintTypeFromString(eDataType, initialValue);
			case AsPackage.GOAL:
				return createGoalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AsPackage.COHERENCE_CONSTRAINT_TYPE:
				return convertCoherenceConstraintTypeToString(eDataType, instanceValue);
			case AsPackage.GOAL:
				return convertGoalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound createBound() {
		BoundImpl bound = new BoundImpl();
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoherenceConstraint createCoherenceConstraint() {
		CoherenceConstraintImpl coherenceConstraint = new CoherenceConstraintImpl();
		return coherenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConstraint createResourceConstraint() {
		ResourceConstraintImpl resourceConstraint = new ResourceConstraintImpl();
		return resourceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHardwareResourceInstanceConstraint createRequiredHardwareResourceInstanceConstraint() {
		RequiredHardwareResourceInstanceConstraintImpl requiredHardwareResourceInstanceConstraint = new RequiredHardwareResourceInstanceConstraintImpl();
		return requiredHardwareResourceInstanceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptor createTupleDescriptor() {
		TupleDescriptorImpl tupleDescriptor = new TupleDescriptorImpl();
		return tupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightTupleDescriptor createWeightTupleDescriptor() {
		WeightTupleDescriptorImpl weightTupleDescriptor = new WeightTupleDescriptorImpl();
		return weightTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundWeightTupleDescriptor createBoundWeightTupleDescriptor() {
		BoundWeightTupleDescriptorImpl boundWeightTupleDescriptor = new BoundWeightTupleDescriptorImpl();
		return boundWeightTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedPart createTypedNamedPart() {
		TypedNamedPartImpl typedNamedPart = new TypedNamedPartImpl();
		return typedNamedPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedPair createTypedPair() {
		TypedPairImpl typedPair = new TypedPairImpl();
		return typedPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFunction createMeasureFunction() {
		MeasureFunctionImpl measureFunction = new MeasureFunctionImpl();
		return measureFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDimension createQoSDimension() {
		QoSDimensionImpl qoSDimension = new QoSDimensionImpl();
		return qoSDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaImplementationProvider createJavaImplementationProvider() {
		JavaImplementationProviderImpl javaImplementationProvider = new JavaImplementationProviderImpl();
		return javaImplementationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLContext createOCLContext() {
		OCLContextImpl oclContext = new OCLContextImpl();
		return oclContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoherenceConstraintType createCoherenceConstraintTypeFromString(EDataType eDataType, String initialValue) {
		CoherenceConstraintType result = CoherenceConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoherenceConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoalFromString(EDataType eDataType, String initialValue) {
		Goal result = Goal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsPackage getAsPackage() {
		return (AsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsPackage getPackage() {
		return AsPackage.eINSTANCE;
	}

} //AsFactoryImpl
