/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.psm.allocation.language.cs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory(CsPackage.eNS_URI);
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
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
			case CsPackage.SPECIFICATION_CS: return createSpecificationCS();
			case CsPackage.LOCATION_CONSTRAINT_CS: return createLocationConstraintCS();
			case CsPackage.RESOURCE_CONSTRAINT_CS: return createResourceConstraintCS();
			case CsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS: return createRequiredHardwareResourceInstanceConstraintCS();
			case CsPackage.TUPLE_DESCRIPTOR_CS: return createTupleDescriptorCS();
			case CsPackage.WEIGHT_TUPLE_DESCRIPTOR_CS: return createWeightTupleDescriptorCS();
			case CsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS: return createBoundWeightTupleDescriptorCS();
			case CsPackage.TYPED_NAMED_PART_CS: return createTypedNamedPartCS();
			case CsPackage.TYPED_PAIR_CS: return createTypedPairCS();
			case CsPackage.MEASURE_FUNCTION_CS: return createMeasureFunctionCS();
			case CsPackage.SERVICE_CS: return createServiceCS();
			case CsPackage.QO_SDIMENSION_CS: return createQoSDimensionCS();
			case CsPackage.JAVA_IMPLEMENTATION_PROVIDER_CS: return createJavaImplementationProviderCS();
			case CsPackage.OCL_CONTEXT_CS: return createOCLContextCS();
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
			case CsPackage.LOCATION_CONSTRAINT_TYPES:
				return createLocationConstraintTypesFromString(eDataType, initialValue);
			case CsPackage.GOAL:
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
			case CsPackage.LOCATION_CONSTRAINT_TYPES:
				return convertLocationConstraintTypesToString(eDataType, instanceValue);
			case CsPackage.GOAL:
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
	public SpecificationCS createSpecificationCS() {
		SpecificationCSImpl specificationCS = new SpecificationCSImpl();
		return specificationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationConstraintCS createLocationConstraintCS() {
		LocationConstraintCSImpl locationConstraintCS = new LocationConstraintCSImpl();
		return locationConstraintCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConstraintCS createResourceConstraintCS() {
		ResourceConstraintCSImpl resourceConstraintCS = new ResourceConstraintCSImpl();
		return resourceConstraintCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredHardwareResourceInstanceConstraintCS createRequiredHardwareResourceInstanceConstraintCS() {
		RequiredHardwareResourceInstanceConstraintCSImpl requiredHardwareResourceInstanceConstraintCS = new RequiredHardwareResourceInstanceConstraintCSImpl();
		return requiredHardwareResourceInstanceConstraintCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptorCS createTupleDescriptorCS() {
		TupleDescriptorCSImpl tupleDescriptorCS = new TupleDescriptorCSImpl();
		return tupleDescriptorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightTupleDescriptorCS createWeightTupleDescriptorCS() {
		WeightTupleDescriptorCSImpl weightTupleDescriptorCS = new WeightTupleDescriptorCSImpl();
		return weightTupleDescriptorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundWeightTupleDescriptorCS createBoundWeightTupleDescriptorCS() {
		BoundWeightTupleDescriptorCSImpl boundWeightTupleDescriptorCS = new BoundWeightTupleDescriptorCSImpl();
		return boundWeightTupleDescriptorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedPartCS createTypedNamedPartCS() {
		TypedNamedPartCSImpl typedNamedPartCS = new TypedNamedPartCSImpl();
		return typedNamedPartCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedPairCS createTypedPairCS() {
		TypedPairCSImpl typedPairCS = new TypedPairCSImpl();
		return typedPairCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFunctionCS createMeasureFunctionCS() {
		MeasureFunctionCSImpl measureFunctionCS = new MeasureFunctionCSImpl();
		return measureFunctionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCS createServiceCS() {
		ServiceCSImpl serviceCS = new ServiceCSImpl();
		return serviceCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDimensionCS createQoSDimensionCS() {
		QoSDimensionCSImpl qoSDimensionCS = new QoSDimensionCSImpl();
		return qoSDimensionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaImplementationProviderCS createJavaImplementationProviderCS() {
		JavaImplementationProviderCSImpl javaImplementationProviderCS = new JavaImplementationProviderCSImpl();
		return javaImplementationProviderCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLContextCS createOCLContextCS() {
		OCLContextCSImpl oclContextCS = new OCLContextCSImpl();
		return oclContextCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationConstraintTypes createLocationConstraintTypesFromString(EDataType eDataType, String initialValue) {
		LocationConstraintTypes result = LocationConstraintTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationConstraintTypesToString(EDataType eDataType, Object instanceValue) {
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
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
