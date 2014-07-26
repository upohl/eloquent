/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.examples.pivot.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weighting Component Resource Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an element that attaches a weighting to the allocation of
 * component instances to hardware resources. Examples for a "weighting" are
 * memory consumption or communication latency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.WeightingComponentResourceTupleElement#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.WeightingComponentResourceTupleElement#getWeighting <em>Weighting</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getWeightingComponentResourceTupleElement()
 * @model abstract="true"
 * @generated
 */
public interface WeightingComponentResourceTupleElement extends EObject, Element {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getWeightingComponentResourceTupleElement_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptor> getTupleDescriptors();

	/**
	 * Returns the value of the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the weighting of the component instances
	 * to hardware resources allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weighting</em>' containment reference.
	 * @see #setWeighting(ValueTupleDescriptor)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getWeightingComponentResourceTupleElement_Weighting()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptor getWeighting();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.as.WeightingComponentResourceTupleElement#getWeighting <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' containment reference.
	 * @see #getWeighting()
	 * @generated
	 */
	void setWeighting(ValueTupleDescriptor value);

} // WeightingComponentResourceTupleElement
