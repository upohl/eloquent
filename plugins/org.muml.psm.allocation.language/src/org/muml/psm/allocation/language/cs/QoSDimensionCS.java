/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.ocl.xtext.basecs.NamedElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimension CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a quality of service dimension. The metric of the
 * quality of service dimension is specified via the inherited "expression"
 * reference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.QoSDimensionCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getQoSDimensionCS()
 * @model
 * @generated
 */
public interface QoSDimensionCS extends NamedElementCS, EvaluableElementCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Descriptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(WeightTupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getQoSDimensionCS_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WeightTupleDescriptorCS getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.QoSDimensionCS#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(WeightTupleDescriptorCS value);

} // QoSDimensionCS
