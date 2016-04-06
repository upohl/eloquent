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
import org.muml.psm.allocation.language.as.AsFactory;
import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor;
import org.muml.psm.allocation.language.as.Goal;
import org.muml.psm.allocation.language.as.LocationConstraint;
import org.muml.psm.allocation.language.as.LocationConstraintTypes;
import org.muml.psm.allocation.language.as.LocationTupleDescriptor;
import org.muml.psm.allocation.language.as.MeasureFunction;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint;
import org.muml.psm.allocation.language.as.ResourceConstraint;
import org.muml.psm.allocation.language.as.Service;
import org.muml.psm.allocation.language.as.Specification;
import org.muml.psm.allocation.language.as.ValueTupleDescriptor;

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
			case AsPackage.SERVICE: return createService();
			case AsPackage.QO_SDIMENSION: return createQoSDimension();
			case AsPackage.LOCATION_CONSTRAINT: return createLocationConstraint();
			case AsPackage.RESOURCE_CONSTRAINT: return createResourceConstraint();
			case AsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT: return createRequiredHardwareResourceInstanceConstraint();
			case AsPackage.LOCATION_TUPLE_DESCRIPTOR: return createLocationTupleDescriptor();
			case AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR: return createComponentResourceTupleDescriptor();
			case AsPackage.VALUE_TUPLE_DESCRIPTOR: return createValueTupleDescriptor();
			case AsPackage.MEASURE_FUNCTION: return createMeasureFunction();
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
			case AsPackage.LOCATION_CONSTRAINT_TYPES:
				return createLocationConstraintTypesFromString(eDataType, initialValue);
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
			case AsPackage.LOCATION_CONSTRAINT_TYPES:
				return convertLocationConstraintTypesToString(eDataType, instanceValue);
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
