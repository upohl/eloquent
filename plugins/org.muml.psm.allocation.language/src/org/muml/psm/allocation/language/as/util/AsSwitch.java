/**
 */
package org.muml.psm.allocation.language.as.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.TypedElement;

import org.eclipse.ocl.pivot.util.Visitable;

import org.eclipse.ocl.pivot.utilities.Nameable;

import org.muml.psm.allocation.language.as.*;

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
 * @see org.muml.psm.allocation.language.as.AsPackage
 * @generated
 */
public class AsSwitch<@Nullable T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsSwitch() {
		if (modelPackage == null) {
			modelPackage = AsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case AsPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseModel(specification);
				if (result == null) result = caseNamespace(specification);
				if (result == null) result = caseNamedElement(specification);
				if (result == null) result = caseElement(specification);
				if (result == null) result = caseNameable(specification);
				if (result == null) result = caseVisitable(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.EVALUATABLE_ELEMENT: {
				EvaluatableElement evaluatableElement = (EvaluatableElement)theEObject;
				T result = caseEvaluatableElement(evaluatableElement);
				if (result == null) result = caseElement(evaluatableElement);
				if (result == null) result = caseVisitable(evaluatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseNamedElement(relation);
				if (result == null) result = caseEvaluatableElement(relation);
				if (result == null) result = caseElement(relation);
				if (result == null) result = caseNameable(relation);
				if (result == null) result = caseVisitable(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.BOUND: {
				Bound bound = (Bound)theEObject;
				T result = caseBound(bound);
				if (result == null) result = caseEvaluatableElement(bound);
				if (result == null) result = caseElement(bound);
				if (result == null) result = caseVisitable(bound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseEvaluatableElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = caseNameable(constraint);
				if (result == null) result = caseVisitable(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.COHERENCE_CONSTRAINT: {
				CoherenceConstraint coherenceConstraint = (CoherenceConstraint)theEObject;
				T result = caseCoherenceConstraint(coherenceConstraint);
				if (result == null) result = caseConstraint(coherenceConstraint);
				if (result == null) result = caseNamedElement(coherenceConstraint);
				if (result == null) result = caseEvaluatableElement(coherenceConstraint);
				if (result == null) result = caseElement(coherenceConstraint);
				if (result == null) result = caseNameable(coherenceConstraint);
				if (result == null) result = caseVisitable(coherenceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.RESOURCE_CONSTRAINT: {
				ResourceConstraint resourceConstraint = (ResourceConstraint)theEObject;
				T result = caseResourceConstraint(resourceConstraint);
				if (result == null) result = caseConstraint(resourceConstraint);
				if (result == null) result = caseNamedElement(resourceConstraint);
				if (result == null) result = caseEvaluatableElement(resourceConstraint);
				if (result == null) result = caseElement(resourceConstraint);
				if (result == null) result = caseNameable(resourceConstraint);
				if (result == null) result = caseVisitable(resourceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT: {
				RequiredHardwareResourceInstanceConstraint requiredHardwareResourceInstanceConstraint = (RequiredHardwareResourceInstanceConstraint)theEObject;
				T result = caseRequiredHardwareResourceInstanceConstraint(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseConstraint(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseNamedElement(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseEvaluatableElement(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseElement(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseNameable(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = caseVisitable(requiredHardwareResourceInstanceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.TUPLE_DESCRIPTOR: {
				TupleDescriptor tupleDescriptor = (TupleDescriptor)theEObject;
				T result = caseTupleDescriptor(tupleDescriptor);
				if (result == null) result = caseElement(tupleDescriptor);
				if (result == null) result = caseVisitable(tupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.WEIGHT_TUPLE_DESCRIPTOR: {
				WeightTupleDescriptor weightTupleDescriptor = (WeightTupleDescriptor)theEObject;
				T result = caseWeightTupleDescriptor(weightTupleDescriptor);
				if (result == null) result = caseTupleDescriptor(weightTupleDescriptor);
				if (result == null) result = caseElement(weightTupleDescriptor);
				if (result == null) result = caseVisitable(weightTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR: {
				BoundWeightTupleDescriptor boundWeightTupleDescriptor = (BoundWeightTupleDescriptor)theEObject;
				T result = caseBoundWeightTupleDescriptor(boundWeightTupleDescriptor);
				if (result == null) result = caseWeightTupleDescriptor(boundWeightTupleDescriptor);
				if (result == null) result = caseTupleDescriptor(boundWeightTupleDescriptor);
				if (result == null) result = caseElement(boundWeightTupleDescriptor);
				if (result == null) result = caseVisitable(boundWeightTupleDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.TYPED_NAMED_PART: {
				TypedNamedPart typedNamedPart = (TypedNamedPart)theEObject;
				T result = caseTypedNamedPart(typedNamedPart);
				if (result == null) result = caseTypedElement(typedNamedPart);
				if (result == null) result = caseNamedElement(typedNamedPart);
				if (result == null) result = caseElement(typedNamedPart);
				if (result == null) result = caseNameable(typedNamedPart);
				if (result == null) result = caseVisitable(typedNamedPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.TYPED_PAIR: {
				TypedPair typedPair = (TypedPair)theEObject;
				T result = caseTypedPair(typedPair);
				if (result == null) result = caseElement(typedPair);
				if (result == null) result = caseVisitable(typedPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.MEASURE_FUNCTION: {
				MeasureFunction measureFunction = (MeasureFunction)theEObject;
				T result = caseMeasureFunction(measureFunction);
				if (result == null) result = caseElement(measureFunction);
				if (result == null) result = caseVisitable(measureFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseElement(service);
				if (result == null) result = caseNameable(service);
				if (result == null) result = caseVisitable(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.QO_SDIMENSION: {
				QoSDimension qoSDimension = (QoSDimension)theEObject;
				T result = caseQoSDimension(qoSDimension);
				if (result == null) result = caseNamedElement(qoSDimension);
				if (result == null) result = caseEvaluatableElement(qoSDimension);
				if (result == null) result = caseElement(qoSDimension);
				if (result == null) result = caseNameable(qoSDimension);
				if (result == null) result = caseVisitable(qoSDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.JAVA_IMPLEMENTATION_PROVIDER: {
				JavaImplementationProvider javaImplementationProvider = (JavaImplementationProvider)theEObject;
				T result = caseJavaImplementationProvider(javaImplementationProvider);
				if (result == null) result = caseElement(javaImplementationProvider);
				if (result == null) result = caseVisitable(javaImplementationProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.NAME_PROVIDER: {
				NameProvider nameProvider = (NameProvider)theEObject;
				T result = caseNameProvider(nameProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.STORAGE_PROVIDER: {
				StorageProvider storageProvider = (StorageProvider)theEObject;
				T result = caseStorageProvider(storageProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsPackage.OCL_CONTEXT: {
				OCLContext oclContext = (OCLContext)theEObject;
				T result = caseOCLContext(oclContext);
				if (result == null) result = caseTypedElement(oclContext);
				if (result == null) result = caseNamedElement(oclContext);
				if (result == null) result = caseElement(oclContext);
				if (result == null) result = caseNameable(oclContext);
				if (result == null) result = caseVisitable(oclContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Evaluatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluatableElement(EvaluatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBound(Bound object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coherence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coherence Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoherenceConstraint(CoherenceConstraint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Weight Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightTupleDescriptor(WeightTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Weight Tuple Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Weight Tuple Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundWeightTupleDescriptor(BoundWeightTupleDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Named Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Named Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedNamedPart(TypedNamedPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedPair(TypedPair object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Java Implementation Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Implementation Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaImplementationProvider(JavaImplementationProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameProvider(NameProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageProvider(StorageProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLContext(OCLContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitable(Visitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
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

} //AsSwitch
