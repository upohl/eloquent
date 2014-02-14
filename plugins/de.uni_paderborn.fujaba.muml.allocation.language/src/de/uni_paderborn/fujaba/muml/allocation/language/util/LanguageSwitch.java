/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.util;

import de.uni_paderborn.fujaba.muml.allocation.language.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage
 * @generated
 */
public class LanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = LanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LanguagePackage.OPTIONAL_NAMED_ELEMENT: {
				OptionalNamedElement optionalNamedElement = (OptionalNamedElement)theEObject;
				T result = caseOptionalNamedElement(optionalNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseNamedElement(specification);
				if (result == null) result = caseExtendableElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseExtendableElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.QO_SDIMENSION: {
				QoSDimension qoSDimension = (QoSDimension)theEObject;
				T result = caseQoSDimension(qoSDimension);
				if (result == null) result = caseNamedElement(qoSDimension);
				if (result == null) result = caseExtendableElement(qoSDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseOptionalNamedElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.LOCATION_CONSTRAINT: {
				LocationConstraint locationConstraint = (LocationConstraint)theEObject;
				T result = caseLocationConstraint(locationConstraint);
				if (result == null) result = caseConstraint(locationConstraint);
				if (result == null) result = caseOptionalNamedElement(locationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.RESOURCE_CONSTRAINT: {
				ResourceConstraint resourceConstraint = (ResourceConstraint)theEObject;
				T result = caseResourceConstraint(resourceConstraint);
				if (result == null) result = caseConstraint(resourceConstraint);
				if (result == null) result = caseOptionalNamedElement(resourceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT: {
				RequiredHardwareResourceInstanceConstraint requiredHardwareResourceInstanceConstraint = (RequiredHardwareResourceInstanceConstraint)theEObject;
				T result = caseRequiredHardwareResourceInstanceConstraint(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseConstraint(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseOptionalNamedElement(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.TUPLE_DESCRIPTOR: {
				TupleDescriptor tupleDescriptor = (TupleDescriptor)theEObject;
				T result = caseTupleDescriptor(tupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.INSTANCE_TUPLE_DESCRIPTOR: {
				InstanceTupleDescriptor instanceTupleDescriptor = (InstanceTupleDescriptor)theEObject;
				T result = caseInstanceTupleDescriptor(instanceTupleDescriptor);
				if (result == null) result = caseTupleDescriptor(instanceTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.LOCATION_TUPLE_DESCRIPTOR: {
				LocationTupleDescriptor locationTupleDescriptor = (LocationTupleDescriptor)theEObject;
				T result = caseLocationTupleDescriptor(locationTupleDescriptor);
				if (result == null) result = caseInstanceTupleDescriptor(locationTupleDescriptor);
				if (result == null) result = caseTupleDescriptor(locationTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR: {
				ComponentResourceTupleDescriptor componentResourceTupleDescriptor = (ComponentResourceTupleDescriptor)theEObject;
				T result = caseComponentResourceTupleDescriptor(componentResourceTupleDescriptor);
				if (result == null) result = caseInstanceTupleDescriptor(componentResourceTupleDescriptor);
				if (result == null) result = caseTupleDescriptor(componentResourceTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.VALUE_TUPLE_DESCRIPTOR: {
				ValueTupleDescriptor valueTupleDescriptor = (ValueTupleDescriptor)theEObject;
				T result = caseValueTupleDescriptor(valueTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LanguagePackage.MEASURE_FUNCTION: {
				MeasureFunction measureFunction = (MeasureFunction)theEObject;
				T result = caseMeasureFunction(measureFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalNamedElement(OptionalNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SDimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SDimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSDimension(QoSDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationConstraint(LocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConstraint(ResourceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Hardware Resource Instance Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Hardware Resource Instance Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredHardwareResourceInstanceConstraint(RequiredHardwareResourceInstanceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleDescriptor(TupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceTupleDescriptor(InstanceTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationTupleDescriptor(LocationTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Resource Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Resource Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentResourceTupleDescriptor(ComponentResourceTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTupleDescriptor(ValueTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureFunction(MeasureFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LanguageSwitch
