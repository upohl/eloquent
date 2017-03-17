/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WeightTupleDescriptor defines the expected tuple type of a
 * QoSDimension's ocl expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getWeightTupleDescriptorCS()
 * @model
 * @generated
 */
public interface WeightTupleDescriptorCS extends TupleDescriptorCS {
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
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getWeightTupleDescriptorCS_Weight()
	 * @model required="true"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

} // WeightTupleDescriptorCS
