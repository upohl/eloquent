/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.*;

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
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageFactory init() {
		try {
			LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory(LanguagePackage.eNS_URI);
			if (theLanguageFactory != null) {
				return theLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFactoryImpl() {
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
			case LanguagePackage.SPECIFICATION: return createSpecification();
			case LanguagePackage.SERVICE: return createService();
			case LanguagePackage.QO_SDIMENSION: return createQoSDimension();
			case LanguagePackage.LOCATION_CONSTRAINT: return createLocationConstraint();
			case LanguagePackage.RESOURCE_CONSTRAINT: return createResourceConstraint();
			case LanguagePackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT: return createRequiredHardwareResourceInstanceConstraint();
			case LanguagePackage.LOCATION_TUPLE_DESCRIPTOR: return createLocationTupleDescriptor();
			case LanguagePackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR: return createComponentResourceTupleDescriptor();
			case LanguagePackage.VALUE_TUPLE_DESCRIPTOR: return createValueTupleDescriptor();
			case LanguagePackage.MEASURE_FUNCTION: return createMeasureFunction();
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
			case LanguagePackage.LOCATION_CONSTRAINT_TYPES:
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
			case LanguagePackage.LOCATION_CONSTRAINT_TYPES:
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
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
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
	public LocationConstraint createLocationConstraint() {
		LocationConstraintImpl locationConstraint = new LocationConstraintImpl();
		return locationConstraint;
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
	public LocationTupleDescriptor createLocationTupleDescriptor() {
		LocationTupleDescriptorImpl locationTupleDescriptor = new LocationTupleDescriptorImpl();
		return locationTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResourceTupleDescriptor createComponentResourceTupleDescriptor() {
		ComponentResourceTupleDescriptorImpl componentResourceTupleDescriptor = new ComponentResourceTupleDescriptorImpl();
		return componentResourceTupleDescriptor;
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
	public LanguagePackage getLanguagePackage() {
		return (LanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LanguagePackage getPackage() {
		return LanguagePackage.eINSTANCE;
	}

} //LanguageFactoryImpl
