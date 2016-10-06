/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.ocl.pivot.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.TypedPair#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.TypedPair#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getTypedPair()
 * @model
 * @generated
 */
public interface TypedPair extends Element {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(TypedNamedPart)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getTypedPair_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypedNamedPart getFirst();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.TypedPair#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(TypedNamedPart value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(TypedNamedPart)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getTypedPair_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypedNamedPart getSecond();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.TypedPair#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(TypedNamedPart value);

} // TypedPair
