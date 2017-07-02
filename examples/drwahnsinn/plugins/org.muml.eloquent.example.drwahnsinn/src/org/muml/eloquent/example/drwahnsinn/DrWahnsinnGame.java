/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dr Wahnsinn Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getPositions <em>Positions</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getTiles <em>Tiles</em>}</li>
 * </ul>
 *
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getDrWahnsinnGame()
 * @model
 * @generated
 */
public interface DrWahnsinnGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.eloquent.example.drwahnsinn.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getDrWahnsinnGame_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getPositions();

	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.eloquent.example.drwahnsinn.Tile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getDrWahnsinnGame_Tiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tile> getTiles();

} // DrWahnsinnGame
