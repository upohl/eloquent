/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weighting Component Resource Tuple Element CS</b></em>'.
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
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getWeightingComponentResourceTupleElementCS()
 * @model abstract="true"
 * @generated
 */
public interface WeightingComponentResourceTupleElementCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getWeightingComponentResourceTupleElementCS_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptorCS> getTupleDescriptors();

	/**
	 * Returns the value of the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the weighting of the component instances
	 * to hardware resources allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weighting</em>' containment reference.
	 * @see #setWeighting(ValueTupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getWeightingComponentResourceTupleElementCS_Weighting()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptorCS getWeighting();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS#getWeighting <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' containment reference.
	 * @see #getWeighting()
	 * @generated
	 */
	void setWeighting(ValueTupleDescriptorCS value);

} // WeightingComponentResourceTupleElementCS
