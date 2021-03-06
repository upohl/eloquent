/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Pair CS</b></em>'.
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
 *   <li>{@link org.muml.psm.allocation.language.cs.TypedPairCS#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.TypedPairCS#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getTypedPairCS()
 * @model
 * @generated
 */
public interface TypedPairCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The named part that is defined by this typed pair represents the "source".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(TypedNamedPartCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getTypedPairCS_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypedNamedPartCS getFirst();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.TypedPairCS#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(TypedNamedPartCS value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The named part that is defined by this typed pair represents the "target".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(TypedNamedPartCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getTypedPairCS_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypedNamedPartCS getSecond();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.TypedPairCS#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(TypedNamedPartCS value);

} // TypedPairCS
