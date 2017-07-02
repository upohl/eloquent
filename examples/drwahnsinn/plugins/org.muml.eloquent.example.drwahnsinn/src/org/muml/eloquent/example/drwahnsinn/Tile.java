/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.Tile#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.eloquent.example.drwahnsinn.TileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.eloquent.example.drwahnsinn.TileType
	 * @see #setType(TileType)
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTile_Type()
	 * @model required="true"
	 * @generated
	 */
	TileType getType();

	/**
	 * Sets the value of the '{@link org.muml.eloquent.example.drwahnsinn.Tile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.eloquent.example.drwahnsinn.TileType
	 * @see #getType()
	 * @generated
	 */
	void setType(TileType value);

} // Tile
