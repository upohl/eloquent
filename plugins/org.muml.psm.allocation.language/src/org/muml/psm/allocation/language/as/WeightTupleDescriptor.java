/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.WeightTupleDescriptor#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getWeightTupleDescriptor()
 * @model
 * @generated
 */
public interface WeightTupleDescriptor extends TupleDescriptor {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getWeightTupleDescriptor_Weight()
	 * @model
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.WeightTupleDescriptor#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

} // WeightTupleDescriptor
