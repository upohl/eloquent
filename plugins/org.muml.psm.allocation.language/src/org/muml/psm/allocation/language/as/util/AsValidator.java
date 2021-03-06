/**
 */
package org.muml.psm.allocation.language.as.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.muml.psm.allocation.language.as.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.language.as.AsPackage
 * @generated
 */
public class AsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AsValidator INSTANCE = new AsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.psm.allocation.language.as";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AsPackage.SPECIFICATION:
				return validateSpecification((Specification)value, diagnostics, context);
			case AsPackage.EVALUABLE_ELEMENT:
				return validateEvaluableElement((EvaluableElement)value, diagnostics, context);
			case AsPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case AsPackage.BOUND:
				return validateBound((Bound)value, diagnostics, context);
			case AsPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case AsPackage.COHERENCE_CONSTRAINT:
				return validateCoherenceConstraint((CoherenceConstraint)value, diagnostics, context);
			case AsPackage.RESOURCE_CONSTRAINT:
				return validateResourceConstraint((ResourceConstraint)value, diagnostics, context);
			case AsPackage.LOCATION_CONSTRAINT:
				return validateLocationConstraint((LocationConstraint)value, diagnostics, context);
			case AsPackage.IMPLICATION_CONSTRAINT:
				return validateImplicationConstraint((ImplicationConstraint)value, diagnostics, context);
			case AsPackage.FORBIDDEN_LOCATION_CONSTRAINT:
				return validateForbiddenLocationConstraint((ForbiddenLocationConstraint)value, diagnostics, context);
			case AsPackage.TUPLE_DESCRIPTOR:
				return validateTupleDescriptor((TupleDescriptor)value, diagnostics, context);
			case AsPackage.WEIGHT_TUPLE_DESCRIPTOR:
				return validateWeightTupleDescriptor((WeightTupleDescriptor)value, diagnostics, context);
			case AsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR:
				return validateBoundWeightTupleDescriptor((BoundWeightTupleDescriptor)value, diagnostics, context);
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR:
				return validateImplicationConstraintTupleDescriptor((ImplicationConstraintTupleDescriptor)value, diagnostics, context);
			case AsPackage.TYPED_NAMED_PART:
				return validateTypedNamedPart((TypedNamedPart)value, diagnostics, context);
			case AsPackage.TYPED_PAIR:
				return validateTypedPair((TypedPair)value, diagnostics, context);
			case AsPackage.MEASURE_FUNCTION:
				return validateMeasureFunction((MeasureFunction)value, diagnostics, context);
			case AsPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case AsPackage.QO_SDIMENSION:
				return validateQoSDimension((QoSDimension)value, diagnostics, context);
			case AsPackage.JAVA_IMPLEMENTATION_PROVIDER:
				return validateJavaImplementationProvider((JavaImplementationProvider)value, diagnostics, context);
			case AsPackage.NAME_PROVIDER:
				return validateNameProvider((NameProvider)value, diagnostics, context);
			case AsPackage.STORAGE_PROVIDER:
				return validateStorageProvider((StorageProvider)value, diagnostics, context);
			case AsPackage.OCL_CONTEXT:
				return validateOCLContext((OCLContext)value, diagnostics, context);
			case AsPackage.COHERENCE_CONSTRAINT_TYPE:
				return validateCoherenceConstraintType((CoherenceConstraintType)value, diagnostics, context);
			case AsPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecification(Specification specification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluableElement(EvaluableElement evaluableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_exactlyOnePairOrSequencePart(relation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOnePairOrSequencePart constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATION__EXACTLY_ONE_PAIR_OR_SEQUENCE_PART__EEXPRESSION = "self.tupleDescriptor.typedPairs->size() = 1\n" +
		"or\n" +
		"(\n" +
		"\tnot self.tupleDescriptor.sequencePart.oclIsUndefined()\n" +
		"\tand\n" +
		"\tself.tupleDescriptor.sequencePart <> ''\n" +
		")";

	/**
	 * Validates the exactlyOnePairOrSequencePart constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_exactlyOnePairOrSequencePart(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AsPackage.Literals.RELATION,
				 relation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOnePairOrSequencePart",
				 RELATION__EXACTLY_ONE_PAIR_OR_SEQUENCE_PART__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBound(Bound bound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoherenceConstraint(CoherenceConstraint coherenceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coherenceConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coherenceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoherenceConstraint_exactlyOnePair(coherenceConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOnePair constraint of '<em>Coherence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COHERENCE_CONSTRAINT__EXACTLY_ONE_PAIR__EEXPRESSION = "self.tupleDescriptor.typedPairs->size() = 1";

	/**
	 * Validates the exactlyOnePair constraint of '<em>Coherence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoherenceConstraint_exactlyOnePair(CoherenceConstraint coherenceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AsPackage.Literals.COHERENCE_CONSTRAINT,
				 coherenceConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOnePair",
				 COHERENCE_CONSTRAINT__EXACTLY_ONE_PAIR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceConstraint(ResourceConstraint resourceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationConstraint(LocationConstraint locationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicationConstraint(ImplicationConstraint implicationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implicationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForbiddenLocationConstraint(ForbiddenLocationConstraint forbiddenLocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forbiddenLocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleDescriptor(TupleDescriptor tupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tupleDescriptor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validateTupleDescriptor_typedPairsOrSequencePart(tupleDescriptor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typedPairsOrSequencePart constraint of '<em>Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TUPLE_DESCRIPTOR__TYPED_PAIRS_OR_SEQUENCE_PART__EEXPRESSION = "let sequencePart : Boolean = not self.sequencePart.oclIsUndefined() and self.sequencePart <> ''\n" +
		"in\n" +
		"sequencePart implies self.typedPairs->isEmpty()\n" +
		"and\n" +
		"self.typedPairs->notEmpty() implies not sequencePart\n" +
		"and\n" +
		"(sequencePart or self.typedPairs->notEmpty())";

	/**
	 * Validates the typedPairsOrSequencePart constraint of '<em>Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleDescriptor_typedPairsOrSequencePart(TupleDescriptor tupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AsPackage.Literals.TUPLE_DESCRIPTOR,
				 tupleDescriptor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "typedPairsOrSequencePart",
				 TUPLE_DESCRIPTOR__TYPED_PAIRS_OR_SEQUENCE_PART__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightTupleDescriptor(WeightTupleDescriptor weightTupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(weightTupleDescriptor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(weightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validateTupleDescriptor_typedPairsOrSequencePart(weightTupleDescriptor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundWeightTupleDescriptor(BoundWeightTupleDescriptor boundWeightTupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boundWeightTupleDescriptor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boundWeightTupleDescriptor, diagnostics, context);
		if (result || diagnostics != null) result &= validateTupleDescriptor_typedPairsOrSequencePart(boundWeightTupleDescriptor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicationConstraintTupleDescriptor(ImplicationConstraintTupleDescriptor implicationConstraintTupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implicationConstraintTupleDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedNamedPart(TypedNamedPart typedNamedPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedNamedPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedPair(TypedPair typedPair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedPair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureFunction(MeasureFunction measureFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQoSDimension(QoSDimension qoSDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qoSDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaImplementationProvider(JavaImplementationProvider javaImplementationProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaImplementationProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameProvider(NameProvider nameProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageProvider(StorageProvider storageProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLContext(OCLContext oclContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoherenceConstraintType(CoherenceConstraintType coherenceConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AsValidator
