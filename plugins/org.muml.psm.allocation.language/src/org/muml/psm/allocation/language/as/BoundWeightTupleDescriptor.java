/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Weight Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BoundWeightTupleDescriptor defines the expected tuple type of a
 * ResourceConstraint's ocl expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getBoundWeightTupleDescriptor()
 * @model
 * @generated
 */
public interface BoundWeightTupleDescriptor extends WeightTupleDescriptor {
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
	 * @see org.muml.psm.allocation.language.as.AsPackage#getBoundWeightTupleDescriptor_Bound()
	 * @model
	 * @generated
	 */
	String getBound();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(String value);

} // BoundWeightTupleDescriptor
