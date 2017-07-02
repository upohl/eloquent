/**
 */
package org.muml.eloquent.example.drwahnsinn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame;
import org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage;
import org.muml.eloquent.example.drwahnsinn.RelationCollection;
import org.muml.eloquent.example.drwahnsinn.TileRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl#getTileRelations <em>Tile Relations</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.RelationCollectionImpl#getGame <em>Game</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationCollectionImpl extends MinimalEObjectImpl.Container implements RelationCollection {
	/**
	 * The cached value of the '{@link #getTileRelations() <em>Tile Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<TileRelation> tileRelations;

	/**
	 * The cached value of the '{@link #getGame() <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame()
	 * @generated
	 * @ordered
	 */
	protected DrWahnsinnGame game;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrwahnsinnPackage.Literals.RELATION_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TileRelation> getTileRelations() {
		if (tileRelations == null) {
			tileRelations = new EObjectContainmentEList<TileRelation>(TileRelation.class, this, DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS);
		}
		return tileRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrWahnsinnGame getGame() {
		if (game != null && game.eIsProxy()) {
			InternalEObject oldGame = (InternalEObject)game;
			game = (DrWahnsinnGame)eResolveProxy(oldGame);
			if (game != oldGame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrwahnsinnPackage.RELATION_COLLECTION__GAME, oldGame, game));
			}
		}
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrWahnsinnGame basicGetGame() {
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGame(DrWahnsinnGame newGame) {
		DrWahnsinnGame oldGame = game;
		game = newGame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrwahnsinnPackage.RELATION_COLLECTION__GAME, oldGame, game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS:
				return ((InternalEList<?>)getTileRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS:
				return getTileRelations();
			case DrwahnsinnPackage.RELATION_COLLECTION__GAME:
				if (resolve) return getGame();
				return basicGetGame();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS:
				getTileRelations().clear();
				getTileRelations().addAll((Collection<? extends TileRelation>)newValue);
				return;
			case DrwahnsinnPackage.RELATION_COLLECTION__GAME:
				setGame((DrWahnsinnGame)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS:
				getTileRelations().clear();
				return;
			case DrwahnsinnPackage.RELATION_COLLECTION__GAME:
				setGame((DrWahnsinnGame)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DrwahnsinnPackage.RELATION_COLLECTION__TILE_RELATIONS:
				return tileRelations != null && !tileRelations.isEmpty();
			case DrwahnsinnPackage.RELATION_COLLECTION__GAME:
				return game != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationCollectionImpl
