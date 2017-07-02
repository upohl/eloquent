/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage
 * @generated
 */
public interface DrwahnsinnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrwahnsinnFactory eINSTANCE = org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dr Wahnsinn Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dr Wahnsinn Game</em>'.
	 * @generated
	 */
	DrWahnsinnGame createDrWahnsinnGame();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile</em>'.
	 * @generated
	 */
	Tile createTile();

	/**
	 * Returns a new object of class '<em>Relation Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Collection</em>'.
	 * @generated
	 */
	RelationCollection createRelationCollection();

	/**
	 * Returns a new object of class '<em>Tile Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile Relation</em>'.
	 * @generated
	 */
	TileRelation createTileRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DrwahnsinnPackage getDrwahnsinnPackage();

} //DrwahnsinnFactory
