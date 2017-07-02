/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.TileRelation#getTile <em>Tile</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.TileRelation#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTileRelation()
 * @model
 * @generated
 */
public interface TileRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' reference.
	 * @see #setTile(Tile)
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTileRelation_Tile()
	 * @model required="true"
	 * @generated
	 */
	Tile getTile();

	/**
	 * Sets the value of the '{@link org.muml.eloquent.example.drwahnsinn.TileRelation#getTile <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile</em>' reference.
	 * @see #getTile()
	 * @generated
	 */
	void setTile(Tile value);

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' reference list.
	 * The list contents are of type {@link org.muml.eloquent.example.drwahnsinn.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' reference list.
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTileRelation_Positions()
	 * @model required="true"
	 * @generated
	 */
	EList<Position> getPositions();

} // TileRelation
