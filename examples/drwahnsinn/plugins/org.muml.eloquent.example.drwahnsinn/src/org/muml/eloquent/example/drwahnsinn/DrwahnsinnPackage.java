/**
 */
package org.muml.eloquent.example.drwahnsinn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnFactory
 * @model kind="package"
 * @generated
 */
public interface DrwahnsinnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drwahnsinn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/eloquent/example/drwahnsinn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "drwahnsinn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrwahnsinnPackage eINSTANCE = org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl <em>Dr Wahnsinn Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getDrWahnsinnGame()
	 * @generated
	 */
	int DR_WAHNSINN_GAME = 0;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DR_WAHNSINN_GAME__POSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DR_WAHNSINN_GAME__TILES = 1;

	/**
	 * The number of structural features of the '<em>Dr Wahnsinn Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DR_WAHNSINN_GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dr Wahnsinn Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DR_WAHNSINN_GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.impl.PositionImpl
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Z = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.impl.TileImpl
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl <em>Relation Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getRelationCollection()
	 * @generated
	 */
	int RELATION_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Tile Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COLLECTION__TILE_RELATIONS = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COLLECTION__GAME = 1;

	/**
	 * The number of structural features of the '<em>Relation Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl <em>Tile Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTileRelation()
	 * @generated
	 */
	int TILE_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RELATION__TILE = 0;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RELATION__POSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Tile Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tile Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.eloquent.example.drwahnsinn.TileType <em>Tile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.eloquent.example.drwahnsinn.TileType
	 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTileType()
	 * @generated
	 */
	int TILE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame <em>Dr Wahnsinn Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dr Wahnsinn Game</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame
	 * @generated
	 */
	EClass getDrWahnsinnGame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getPositions()
	 * @see #getDrWahnsinnGame()
	 * @generated
	 */
	EReference getDrWahnsinnGame_Positions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame#getTiles()
	 * @see #getDrWahnsinnGame()
	 * @generated
	 */
	EReference getDrWahnsinnGame_Tiles();

	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.example.drwahnsinn.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.eloquent.example.drwahnsinn.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.eloquent.example.drwahnsinn.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.eloquent.example.drwahnsinn.Position#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Position#getZ()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Z();

	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.example.drwahnsinn.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.eloquent.example.drwahnsinn.Tile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.Tile#getType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.example.drwahnsinn.RelationCollection <em>Relation Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Collection</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.RelationCollection
	 * @generated
	 */
	EClass getRelationCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.eloquent.example.drwahnsinn.RelationCollection#getTileRelations <em>Tile Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile Relations</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.RelationCollection#getTileRelations()
	 * @see #getRelationCollection()
	 * @generated
	 */
	EReference getRelationCollection_TileRelations();

	/**
	 * Returns the meta object for the reference '{@link org.muml.eloquent.example.drwahnsinn.RelationCollection#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.RelationCollection#getGame()
	 * @see #getRelationCollection()
	 * @generated
	 */
	EReference getRelationCollection_Game();

	/**
	 * Returns the meta object for class '{@link org.muml.eloquent.example.drwahnsinn.TileRelation <em>Tile Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Relation</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.TileRelation
	 * @generated
	 */
	EClass getTileRelation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.eloquent.example.drwahnsinn.TileRelation#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tile</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.TileRelation#getTile()
	 * @see #getTileRelation()
	 * @generated
	 */
	EReference getTileRelation_Tile();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.eloquent.example.drwahnsinn.TileRelation#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positions</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.TileRelation#getPositions()
	 * @see #getTileRelation()
	 * @generated
	 */
	EReference getTileRelation_Positions();

	/**
	 * Returns the meta object for enum '{@link org.muml.eloquent.example.drwahnsinn.TileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tile Type</em>'.
	 * @see org.muml.eloquent.example.drwahnsinn.TileType
	 * @generated
	 */
	EEnum getTileType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DrwahnsinnFactory getDrwahnsinnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl <em>Dr Wahnsinn Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getDrWahnsinnGame()
		 * @generated
		 */
		EClass DR_WAHNSINN_GAME = eINSTANCE.getDrWahnsinnGame();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DR_WAHNSINN_GAME__POSITIONS = eINSTANCE.getDrWahnsinnGame_Positions();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DR_WAHNSINN_GAME__TILES = eINSTANCE.getDrWahnsinnGame_Tiles();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.impl.PositionImpl
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Z = eINSTANCE.getPosition_Z();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.impl.TileImpl
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TYPE = eINSTANCE.getTile_Type();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl <em>Relation Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getRelationCollection()
		 * @generated
		 */
		EClass RELATION_COLLECTION = eINSTANCE.getRelationCollection();

		/**
		 * The meta object literal for the '<em><b>Tile Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_COLLECTION__TILE_RELATIONS = eINSTANCE.getRelationCollection_TileRelations();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_COLLECTION__GAME = eINSTANCE.getRelationCollection_Game();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl <em>Tile Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTileRelation()
		 * @generated
		 */
		EClass TILE_RELATION = eINSTANCE.getTileRelation();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_RELATION__TILE = eINSTANCE.getTileRelation_Tile();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_RELATION__POSITIONS = eINSTANCE.getTileRelation_Positions();

		/**
		 * The meta object literal for the '{@link org.muml.eloquent.example.drwahnsinn.TileType <em>Tile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.eloquent.example.drwahnsinn.TileType
		 * @see org.muml.eloquent.example.drwahnsinn.impl.DrwahnsinnPackageImpl#getTileType()
		 * @generated
		 */
		EEnum TILE_TYPE = eINSTANCE.getTileType();

	}

} //DrwahnsinnPackage
