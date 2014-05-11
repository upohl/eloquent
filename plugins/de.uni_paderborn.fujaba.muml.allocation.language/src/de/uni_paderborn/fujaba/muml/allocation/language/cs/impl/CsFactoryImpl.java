/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case CsPackage.SERVICE_CS: return createServiceCS();
			case CsPackage.QO_SDIMENSION_CS: return createQoSDimensionCS();
			case CsPackage.LOCATION_CONSTRAINT_CS: return createLocationConstraintCS();
			case CsPackage.RESOURCE_CONSTRAINT_CS: return createResourceConstraintCS();
			case CsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS: return createRequiredHardwareResourceInstanceConstraintCS();
			case CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS: return createLocationTupleDescriptorCS();
			case CsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS: return createComponentResourceTupleDescriptorCS();
			case CsPackage.VALUE_TUPLE_DESCRIPTOR: return createValueTupleDescriptor();
			case CsPackage.MEASURE_FUNCTION: return createMeasureFunction();
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
	public LocationTupleDescriptorCS createLocationTupleDescriptorCS() {
		LocationTupleDescriptorCSImpl locationTupleDescriptorCS = new LocationTupleDescriptorCSImpl();
		return locationTupleDescriptorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResourceTupleDescriptorCS createComponentResourceTupleDescriptorCS() {
		ComponentResourceTupleDescriptorCSImpl componentResourceTupleDescriptorCS = new ComponentResourceTupleDescriptorCSImpl();
		return componentResourceTupleDescriptorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor createValueTupleDescriptor() {
		ValueTupleDescriptorImpl valueTupleDescriptor = new ValueTupleDescriptorImpl();
		return valueTupleDescriptor;
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