/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.RelationCollection#getTileRelations <em>Tile Relations</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.RelationCollection#getGame <em>Game</em>}</li>
 * </ul>
 *
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getRelationCollection()
 * @model
 * @generated
 */
public interface RelationCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.eloquent.example.drwahnsinn.TileRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Relations</em>' containment reference list.
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getRelationCollection_TileRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TileRelation> getTileRelations();

	/**
	 * Returns the value of the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' reference.
	 * @see #setGame(DrWahnsinnGame)
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getRelationCollection_Game()
	 * @model required="true"
	 * @generated
	 */
	DrWahnsinnGame getGame();

	/**
	 * Sets the value of the '{@link org.muml.eloquent.example.drwahnsinn.RelationCollection#getGame <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(DrWahnsinnGame value);

} // RelationCollection
