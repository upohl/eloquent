/**
 */
package org.muml.psm.allocation.language.cs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.NamespaceCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.TypedElementCS;

import org.eclipse.ocl.xtext.basecs.util.VisitableCS;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

import org.eclipse.ocl.xtext.oclstdlibcs.JavaImplementationCS;

import org.muml.core.ExtendableElement;

import org.muml.psm.allocation.language.cs.*;

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
 * @see org.muml.psm.allocation.language.cs.CsPackage
 * @generated
 */
public class CsSwitch<@Nullable T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsSwitch() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
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
			case CsPackage.SPECIFICATION_CS: {
				SpecificationCS specificationCS = (SpecificationCS)theEObject;
				T result = caseSpecificationCS(specificationCS);
				if (result == null) result = caseCompleteOCLDocumentCS(specificationCS);
				if (result == null) result = caseExtendableElement(specificationCS);
				if (result == null) result = caseNamespaceCS(specificationCS);
				if (result == null) result = caseRootCS(specificationCS);
				if (result == null) result = caseNamedElementCS(specificationCS);
				if (result == null) result = caseModelElementCS(specificationCS);
				if (result == null) result = caseNameable(specificationCS);
				if (result == null) result = casePivotableElementCS(specificationCS);
				if (result == null) result = caseElementCS(specificationCS);
				if (result == null) result = casePivotable(specificationCS);
				if (result == null) result = caseVisitableCS(specificationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.EVALUATABLE_ELEMENT_CS: {
				EvaluatableElementCS evaluatableElementCS = (EvaluatableElementCS)theEObject;
				T result = caseEvaluatableElementCS(evaluatableElementCS);
				if (result == null) result = caseModelElementCS(evaluatableElementCS);
				if (result == null) result = casePivotableElementCS(evaluatableElementCS);
				if (result == null) result = caseElementCS(evaluatableElementCS);
				if (result == null) result = casePivotable(evaluatableElementCS);
				if (result == null) result = caseVisitableCS(evaluatableElementCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.RELATION_CS: {
				RelationCS relationCS = (RelationCS)theEObject;
				T result = caseRelationCS(relationCS);
				if (result == null) result = caseNamedElementCS(relationCS);
				if (result == null) result = caseEvaluatableElementCS(relationCS);
				if (result == null) result = caseModelElementCS(relationCS);
				if (result == null) result = caseNameable(relationCS);
				if (result == null) result = casePivotableElementCS(relationCS);
				if (result == null) result = caseElementCS(relationCS);
				if (result == null) result = casePivotable(relationCS);
				if (result == null) result = caseVisitableCS(relationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.BOUND_CS: {
				BoundCS boundCS = (BoundCS)theEObject;
				T result = caseBoundCS(boundCS);
				if (result == null) result = caseEvaluatableElementCS(boundCS);
				if (result == null) result = caseModelElementCS(boundCS);
				if (result == null) result = casePivotableElementCS(boundCS);
				if (result == null) result = caseElementCS(boundCS);
				if (result == null) result = casePivotable(boundCS);
				if (result == null) result = caseVisitableCS(boundCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.CONSTRAINT_CS: {
				ConstraintCS constraintCS = (ConstraintCS)theEObject;
				T result = caseConstraintCS(constraintCS);
				if (result == null) result = caseNamedElementCS(constraintCS);
				if (result == null) result = caseEvaluatableElementCS(constraintCS);
				if (result == null) result = caseModelElementCS(constraintCS);
				if (result == null) result = caseNameable(constraintCS);
				if (result == null) result = casePivotableElementCS(constraintCS);
				if (result == null) result = caseElementCS(constraintCS);
				if (result == null) result = casePivotable(constraintCS);
				if (result == null) result = caseVisitableCS(constraintCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.LOCATION_CONSTRAINT_CS: {
				LocationConstraintCS locationConstraintCS = (LocationConstraintCS)theEObject;
				T result = caseLocationConstraintCS(locationConstraintCS);
				if (result == null) result = caseConstraintCS(locationConstraintCS);
				if (result == null) result = caseNamedElementCS(locationConstraintCS);
				if (result == null) result = caseEvaluatableElementCS(locationConstraintCS);
				if (result == null) result = caseModelElementCS(locationConstraintCS);
				if (result == null) result = caseNameable(locationConstraintCS);
				if (result == null) result = casePivotableElementCS(locationConstraintCS);
				if (result == null) result = caseElementCS(locationConstraintCS);
				if (result == null) result = casePivotable(locationConstraintCS);
				if (result == null) result = caseVisitableCS(locationConstraintCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.RESOURCE_CONSTRAINT_CS: {
				ResourceConstraintCS resourceConstraintCS = (ResourceConstraintCS)theEObject;
				T result = caseResourceConstraintCS(resourceConstraintCS);
				if (result == null) result = caseConstraintCS(resourceConstraintCS);
				if (result == null) result = caseNamedElementCS(resourceConstraintCS);
				if (result == null) result = caseEvaluatableElementCS(resourceConstraintCS);
				if (result == null) result = caseModelElementCS(resourceConstraintCS);
				if (result == null) result = caseNameable(resourceConstraintCS);
				if (result == null) result = casePivotableElementCS(resourceConstraintCS);
				if (result == null) result = caseElementCS(resourceConstraintCS);
				if (result == null) result = casePivotable(resourceConstraintCS);
				if (result == null) result = caseVisitableCS(resourceConstraintCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS: {
				RequiredHardwareResourceInstanceConstraintCS requiredHardwareResourceInstanceConstraintCS = (RequiredHardwareResourceInstanceConstraintCS)theEObject;
				T result = caseRequiredHardwareResourceInstanceConstraintCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseConstraintCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseNamedElementCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseEvaluatableElementCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseModelElementCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseNameable(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = casePivotableElementCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseElementCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = casePivotable(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = caseVisitableCS(requiredHardwareResourceInstanceConstraintCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.TUPLE_DESCRIPTOR_CS: {
				TupleDescriptorCS tupleDescriptorCS = (TupleDescriptorCS)theEObject;
				T result = caseTupleDescriptorCS(tupleDescriptorCS);
				if (result == null) result = caseModelElementCS(tupleDescriptorCS);
				if (result == null) result = casePivotableElementCS(tupleDescriptorCS);
				if (result == null) result = caseElementCS(tupleDescriptorCS);
				if (result == null) result = casePivotable(tupleDescriptorCS);
				if (result == null) result = caseVisitableCS(tupleDescriptorCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.WEIGHT_TUPLE_DESCRIPTOR_CS: {
				WeightTupleDescriptorCS weightTupleDescriptorCS = (WeightTupleDescriptorCS)theEObject;
				T result = caseWeightTupleDescriptorCS(weightTupleDescriptorCS);
				if (result == null) result = caseTupleDescriptorCS(weightTupleDescriptorCS);
				if (result == null) result = caseModelElementCS(weightTupleDescriptorCS);
				if (result == null) result = casePivotableElementCS(weightTupleDescriptorCS);
				if (result == null) result = caseElementCS(weightTupleDescriptorCS);
				if (result == null) result = casePivotable(weightTupleDescriptorCS);
				if (result == null) result = caseVisitableCS(weightTupleDescriptorCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS: {
				BoundWeightTupleDescriptorCS boundWeightTupleDescriptorCS = (BoundWeightTupleDescriptorCS)theEObject;
				T result = caseBoundWeightTupleDescriptorCS(boundWeightTupleDescriptorCS);
				if (result == null) result = caseWeightTupleDescriptorCS(boundWeightTupleDescriptorCS);
				if (result == null) result = caseTupleDescriptorCS(boundWeightTupleDescriptorCS);
				if (result == null) result = caseModelElementCS(boundWeightTupleDescriptorCS);
				if (result == null) result = casePivotableElementCS(boundWeightTupleDescriptorCS);
				if (result == null) result = caseElementCS(boundWeightTupleDescriptorCS);
				if (result == null) result = casePivotable(boundWeightTupleDescriptorCS);
				if (result == null) result = caseVisitableCS(boundWeightTupleDescriptorCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.TYPED_NAMED_PART_CS: {
				TypedNamedPartCS typedNamedPartCS = (TypedNamedPartCS)theEObject;
				T result = caseTypedNamedPartCS(typedNamedPartCS);
				if (result == null) result = caseTypedElementCS(typedNamedPartCS);
				if (result == null) result = caseNamedElementCS(typedNamedPartCS);
				if (result == null) result = caseModelElementCS(typedNamedPartCS);
				if (result == null) result = caseNameable(typedNamedPartCS);
				if (result == null) result = casePivotableElementCS(typedNamedPartCS);
				if (result == null) result = caseElementCS(typedNamedPartCS);
				if (result == null) result = casePivotable(typedNamedPartCS);
				if (result == null) result = caseVisitableCS(typedNamedPartCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.TYPED_PAIR_CS: {
				TypedPairCS typedPairCS = (TypedPairCS)theEObject;
				T result = caseTypedPairCS(typedPairCS);
				if (result == null) result = caseModelElementCS(typedPairCS);
				if (result == null) result = casePivotableElementCS(typedPairCS);
				if (result == null) result = caseElementCS(typedPairCS);
				if (result == null) result = casePivotable(typedPairCS);
				if (result == null) result = caseVisitableCS(typedPairCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.MEASURE_FUNCTION_CS: {
				MeasureFunctionCS measureFunctionCS = (MeasureFunctionCS)theEObject;
				T result = caseMeasureFunctionCS(measureFunctionCS);
				if (result == null) result = caseModelElementCS(measureFunctionCS);
				if (result == null) result = casePivotableElementCS(measureFunctionCS);
				if (result == null) result = caseElementCS(measureFunctionCS);
				if (result == null) result = casePivotable(measureFunctionCS);
				if (result == null) result = caseVisitableCS(measureFunctionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_CS: {
				ServiceCS serviceCS = (ServiceCS)theEObject;
				T result = caseServiceCS(serviceCS);
				if (result == null) result = caseNamedElementCS(serviceCS);
				if (result == null) result = caseModelElementCS(serviceCS);
				if (result == null) result = caseNameable(serviceCS);
				if (result == null) result = casePivotableElementCS(serviceCS);
				if (result == null) result = caseElementCS(serviceCS);
				if (result == null) result = casePivotable(serviceCS);
				if (result == null) result = caseVisitableCS(serviceCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.QO_SDIMENSION_CS: {
				QoSDimensionCS qoSDimensionCS = (QoSDimensionCS)theEObject;
				T result = caseQoSDimensionCS(qoSDimensionCS);
				if (result == null) result = caseNamedElementCS(qoSDimensionCS);
				if (result == null) result = caseEvaluatableElementCS(qoSDimensionCS);
				if (result == null) result = caseModelElementCS(qoSDimensionCS);
				if (result == null) result = caseNameable(qoSDimensionCS);
				if (result == null) result = casePivotableElementCS(qoSDimensionCS);
				if (result == null) result = caseElementCS(qoSDimensionCS);
				if (result == null) result = casePivotable(qoSDimensionCS);
				if (result == null) result = caseVisitableCS(qoSDimensionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.JAVA_IMPLEMENTATION_PROVIDER_CS: {
				JavaImplementationProviderCS javaImplementationProviderCS = (JavaImplementationProviderCS)theEObject;
				T result = caseJavaImplementationProviderCS(javaImplementationProviderCS);
				if (result == null) result = caseModelElementCS(javaImplementationProviderCS);
				if (result == null) result = caseJavaImplementationCS(javaImplementationProviderCS);
				if (result == null) result = casePivotableElementCS(javaImplementationProviderCS);
				if (result == null) result = caseElementCS(javaImplementationProviderCS);
				if (result == null) result = casePivotable(javaImplementationProviderCS);
				if (result == null) result = caseVisitableCS(javaImplementationProviderCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.NAME_PROVIDER_CS: {
				NameProviderCS nameProviderCS = (NameProviderCS)theEObject;
				T result = caseNameProviderCS(nameProviderCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.STORAGE_PROVIDER_CS: {
				StorageProviderCS storageProviderCS = (StorageProviderCS)theEObject;
				T result = caseStorageProviderCS(storageProviderCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.OCL_CONTEXT_CS: {
				OCLContextCS oclContextCS = (OCLContextCS)theEObject;
				T result = caseOCLContextCS(oclContextCS);
				if (result == null) result = caseTypedElementCS(oclContextCS);
				if (result == null) result = caseNamedElementCS(oclContextCS);
				if (result == null) result = caseModelElementCS(oclContextCS);
				if (result == null) result = caseNameable(oclContextCS);
				if (result == null) result = casePivotableElementCS(oclContextCS);
				if (result == null) result = caseElementCS(oclContextCS);
				if (result == null) result = casePivotable(oclContextCS);
				if (result == null) result = caseVisitableCS(oclContextCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationCS(SpecificationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluatable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluatable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluatableElementCS(EvaluatableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationCS(RelationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundCS(BoundCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintCS(ConstraintCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Constraint CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationConstraintCS(LocationConstraintCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Constraint CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConstraintCS(ResourceConstraintCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Hardware Resource Instance Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Hardware Resource Instance Constraint CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredHardwareResourceInstanceConstraintCS(RequiredHardwareResourceInstanceConstraintCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Descriptor CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleDescriptorCS(TupleDescriptorCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight Tuple Descriptor CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightTupleDescriptorCS(WeightTupleDescriptorCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Weight Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Weight Tuple Descriptor CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundWeightTupleDescriptorCS(BoundWeightTupleDescriptorCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Named Part CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Named Part CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedNamedPartCS(TypedNamedPartCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Pair CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Pair CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedPairCS(TypedPairCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Function CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Function CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureFunctionCS(MeasureFunctionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceCS(ServiceCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SDimension CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SDimension CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSDimensionCS(QoSDimensionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Implementation Provider CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Implementation Provider CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaImplementationProviderCS(JavaImplementationProviderCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Provider CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Provider CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameProviderCS(NameProviderCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Provider CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Provider CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageProviderCS(StorageProviderCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Context CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Context CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLContextCS(OCLContextCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitableCS(VisitableCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotable(Pivotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceCS(NamespaceCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootCS(RootCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementCS(TypedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Implementation CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Implementation CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaImplementationCS(JavaImplementationCS object) {
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

} //CsSwitch
