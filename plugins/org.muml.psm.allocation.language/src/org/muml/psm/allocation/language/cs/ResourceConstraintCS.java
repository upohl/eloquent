/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a "resource" constraint, which can be used
 * to specify resource limits (like the maximum amount of available memory)
 * for a hardware resource instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.ResourceConstraintCS#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getResourceConstraintCS()
 * @model
 * @generated
 */
public interface ResourceConstraintCS extends ConstraintCS, WeightingComponentResourceTupleElementCS {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the right-hand side of the inequality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ValueTupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getResourceConstraintCS_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptorCS getRhs();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ResourceConstraintCS#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ValueTupleDescriptorCS value);

} // ResourceConstraintCS
