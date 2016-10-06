/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Weight Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getBoundWeightTupleDescriptorCS()
 * @model
 * @generated
 */
public interface BoundWeightTupleDescriptorCS extends WeightTupleDescriptorCS {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(String)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getBoundWeightTupleDescriptorCS_Bound()
	 * @model required="true"
	 * @generated
	 */
	String getBound();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(String value);

} // BoundWeightTupleDescriptorCS
