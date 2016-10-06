/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.pivot.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.TupleDescriptor#getTypedPairs <em>Typed Pairs</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getTupleDescriptor()
 * @model
 * @generated
 */
public interface TupleDescriptor extends Element {
	/**
	 * Returns the value of the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.TypedPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Pairs</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getTupleDescriptor_TypedPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TypedPair> getTypedPairs();

} // TupleDescriptor
