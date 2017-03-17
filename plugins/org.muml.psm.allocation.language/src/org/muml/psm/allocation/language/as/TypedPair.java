/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.ocl.pivot.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the source-target relationship of two distinct
 * named parts that belong to the same tuple type.
 * <!-- end-model-doc -->
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The named part that is defined by this typed pair represents the "source".
	 * <!-- end-model-doc -->
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The named part that is defined by this typed pair represents the "target".
	 * <!-- end-model-doc -->
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
