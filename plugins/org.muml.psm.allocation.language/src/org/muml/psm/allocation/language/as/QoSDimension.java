/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.ocl.pivot.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimension</b></em>'.
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
 *   <li>{@link org.muml.psm.allocation.language.as.QoSDimension#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getQoSDimension()
 * @model
 * @generated
 */
public interface QoSDimension extends NamedElement, EvaluableElement {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Descriptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(WeightTupleDescriptor)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getQoSDimension_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WeightTupleDescriptor getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.QoSDimension#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(WeightTupleDescriptor value);

} // QoSDimension
