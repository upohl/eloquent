/**
 */
package org.muml.psm.allocation.language.cs.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.muml.psm.allocation.language.cs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.language.cs.CsPackage
 * @generated
 */
public class CsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CsValidator INSTANCE = new CsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.psm.allocation.language.cs";

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
	public CsValidator() {
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
	  return CsPackage.eINSTANCE;
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
			case CsPackage.SPECIFICATION_CS:
				return validateSpecificationCS((SpecificationCS)value, diagnostics, context);
			case CsPackage.EVALUATABLE_ELEMENT_CS:
				return validateEvaluatableElementCS((EvaluatableElementCS)value, diagnostics, context);
			case CsPackage.RELATION_CS:
				return validateRelationCS((RelationCS)value, diagnostics, context);
			case CsPackage.BOUND_CS:
				return validateBoundCS((BoundCS)value, diagnostics, context);
			case CsPackage.CONSTRAINT_CS:
				return validateConstraintCS((ConstraintCS)value, diagnostics, context);
			case CsPackage.LOCATION_CONSTRAINT_CS:
				return validateLocationConstraintCS((LocationConstraintCS)value, diagnostics, context);
			case CsPackage.RESOURCE_CONSTRAINT_CS:
				return validateResourceConstraintCS((ResourceConstraintCS)value, diagnostics, context);
			case CsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS:
				return validateRequiredHardwareResourceInstanceConstraintCS((RequiredHardwareResourceInstanceConstraintCS)value, diagnostics, context);
			case CsPackage.TUPLE_DESCRIPTOR_CS:
				return validateTupleDescriptorCS((TupleDescriptorCS)value, diagnostics, context);
			case CsPackage.WEIGHT_TUPLE_DESCRIPTOR_CS:
				return validateWeightTupleDescriptorCS((WeightTupleDescriptorCS)value, diagnostics, context);
			case CsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS:
				return validateBoundWeightTupleDescriptorCS((BoundWeightTupleDescriptorCS)value, diagnostics, context);
			case CsPackage.TYPED_NAMED_PART_CS:
				return validateTypedNamedPartCS((TypedNamedPartCS)value, diagnostics, context);
			case CsPackage.TYPED_PAIR_CS:
				return validateTypedPairCS((TypedPairCS)value, diagnostics, context);
			case CsPackage.MEASURE_FUNCTION_CS:
				return validateMeasureFunctionCS((MeasureFunctionCS)value, diagnostics, context);
			case CsPackage.SERVICE_CS:
				return validateServiceCS((ServiceCS)value, diagnostics, context);
			case CsPackage.QO_SDIMENSION_CS:
				return validateQoSDimensionCS((QoSDimensionCS)value, diagnostics, context);
			case CsPackage.JAVA_IMPLEMENTATION_PROVIDER_CS:
				return validateJavaImplementationProviderCS((JavaImplementationProviderCS)value, diagnostics, context);
			case CsPackage.NAME_PROVIDER_CS:
				return validateNameProviderCS((NameProviderCS)value, diagnostics, context);
			case CsPackage.STORAGE_PROVIDER_CS:
				return validateStorageProviderCS((StorageProviderCS)value, diagnostics, context);
			case CsPackage.OCL_CONTEXT_CS:
				return validateOCLContextCS((OCLContextCS)value, diagnostics, context);
			case CsPackage.LOCATION_CONSTRAINT_TYPES:
				return validateLocationConstraintTypes((LocationConstraintTypes)value, diagnostics, context);
			case CsPackage.GOAL:
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
	public boolean validateSpecificationCS(SpecificationCS specificationCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificationCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluatableElementCS(EvaluatableElementCS evaluatableElementCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluatableElementCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationCS(RelationCS relationCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationCS, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationCS, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationCS_exactlyOnePair(relationCS, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOnePair constraint of '<em>Relation CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATION_CS__EXACTLY_ONE_PAIR__EEXPRESSION = "self.tupleDescriptor.typedPairs->size() = 1";

	/**
	 * Validates the exactlyOnePair constraint of '<em>Relation CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationCS_exactlyOnePair(RelationCS relationCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CsPackage.Literals.RELATION_CS,
				 relationCS,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOnePair",
				 RELATION_CS__EXACTLY_ONE_PAIR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundCS(BoundCS boundCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintCS(ConstraintCS constraintCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationConstraintCS(LocationConstraintCS locationConstraintCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationConstraintCS, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationConstraintCS, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationConstraintCS_exactlyOnePair(locationConstraintCS, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOnePair constraint of '<em>Location Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCATION_CONSTRAINT_CS__EXACTLY_ONE_PAIR__EEXPRESSION = "self.tupleDescriptor.typedPairs->size() = 1";

	/**
	 * Validates the exactlyOnePair constraint of '<em>Location Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationConstraintCS_exactlyOnePair(LocationConstraintCS locationConstraintCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CsPackage.Literals.LOCATION_CONSTRAINT_CS,
				 locationConstraintCS,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOnePair",
				 LOCATION_CONSTRAINT_CS__EXACTLY_ONE_PAIR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceConstraintCS(ResourceConstraintCS resourceConstraintCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceConstraintCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredHardwareResourceInstanceConstraintCS(RequiredHardwareResourceInstanceConstraintCS requiredHardwareResourceInstanceConstraintCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredHardwareResourceInstanceConstraintCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleDescriptorCS(TupleDescriptorCS tupleDescriptorCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tupleDescriptorCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightTupleDescriptorCS(WeightTupleDescriptorCS weightTupleDescriptorCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightTupleDescriptorCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundWeightTupleDescriptorCS(BoundWeightTupleDescriptorCS boundWeightTupleDescriptorCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundWeightTupleDescriptorCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedNamedPartCS(TypedNamedPartCS typedNamedPartCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedNamedPartCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedPairCS(TypedPairCS typedPairCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedPairCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureFunctionCS(MeasureFunctionCS measureFunctionCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureFunctionCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCS(ServiceCS serviceCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQoSDimensionCS(QoSDimensionCS qoSDimensionCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qoSDimensionCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaImplementationProviderCS(JavaImplementationProviderCS javaImplementationProviderCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaImplementationProviderCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameProviderCS(NameProviderCS nameProviderCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)nameProviderCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageProviderCS(StorageProviderCS storageProviderCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)storageProviderCS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLContextCS(OCLContextCS oclContextCS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclContextCS, diagnostics, context);
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

} //CsValidator
