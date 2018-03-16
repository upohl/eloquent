/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ImplicationConstraint can be used to model implications. For instance,
 * it can be used to model the following relationship:
 * 
 * "If A is related to B and Z1 is related to Z2, then (B is related to C and
 * E is related to G) or (B is related to D and F is related to H)".
 * 
 * That is, if all "relations" of the premise set hold, then at least one
 * "relation" of the conclusion set holds (in the previous example, the
 * premise set consists of the tuples (A, B), (Z1, Z2) and the conclusion set
 * consists of the tuples (B, C, E, G), (B, D, F, H)) (implicit assumption:
 * all objects have the "correct" types (which a described by the tuple
 * descriptor)).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.ImplicationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintCS()
 * @model
 * @generated
 */
public interface ImplicationConstraintCS extends ConstraintCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple descriptor that describes the implication constraint's tuple type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(ImplicationConstraintTupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintCS_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ImplicationConstraintTupleDescriptorCS getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(ImplicationConstraintTupleDescriptorCS value);

} // ImplicationConstraintCS
