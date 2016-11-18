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
			case AsPackage.EVALUATABLE_ELEMENT:
				return validateEvaluatableElement((EvaluatableElement)value, diagnostics, context);
			case AsPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case AsPackage.LOCATION_CONSTRAINT:
				return validateLocationConstraint((LocationConstraint)value, diagnostics, context);
			case AsPackage.RESOURCE_CONSTRAINT:
				return validateResourceConstraint((ResourceConstraint)value, diagnostics, context);
			case AsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT:
				return validateRequiredHardwareResourceInstanceConstraint((RequiredHardwareResourceInstanceConstraint)value, diagnostics, context);
			case AsPackage.TUPLE_DESCRIPTOR:
				return validateTupleDescriptor((TupleDescriptor)value, diagnostics, context);
			case AsPackage.WEIGHT_TUPLE_DESCRIPTOR:
				return validateWeightTupleDescriptor((WeightTupleDescriptor)value, diagnostics, context);
			case AsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR:
				return validateBoundWeightTupleDescriptor((BoundWeightTupleDescriptor)value, diagnostics, context);
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
			case AsPackage.LOCATION_CONSTRAINT_TYPES:
				return validateLocationConstraintTypes((LocationConstraintTypes)value, diagnostics, context);
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
	public boolean validateEvaluatableElement(EvaluatableElement evaluatableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluatableElement, diagnostics, context);
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
	public boolean validateLocationConstraint(LocationConstraint locationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationConstraint_exactlyOnePair(locationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOnePair constraint of '<em>Location Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCATION_CONSTRAINT__EXACTLY_ONE_PAIR__EEXPRESSION = "self.tupleDescriptor.typedPairs->size() = 1";

	/**
	 * Validates the exactlyOnePair constraint of '<em>Location Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationConstraint_exactlyOnePair(LocationConstraint locationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AsPackage.Literals.LOCATION_CONSTRAINT,
				 locationConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOnePair",
				 LOCATION_CONSTRAINT__EXACTLY_ONE_PAIR__EEXPRESSION,
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
	public boolean validateRequiredHardwareResourceInstanceConstraint(RequiredHardwareResourceInstanceConstraint requiredHardwareResourceInstanceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredHardwareResourceInstanceConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleDescriptor(TupleDescriptor tupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tupleDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightTupleDescriptor(WeightTupleDescriptor weightTupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightTupleDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundWeightTupleDescriptor(BoundWeightTupleDescriptor boundWeightTupleDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundWeightTupleDescriptor, diagnostics, context);
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
	public boolean validateLocationConstraintTypes(LocationConstraintTypes locationConstraintTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
