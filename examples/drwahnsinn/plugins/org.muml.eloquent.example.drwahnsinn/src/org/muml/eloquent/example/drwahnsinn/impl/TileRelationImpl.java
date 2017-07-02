/**
 */
package org.muml.eloquent.example.drwahnsinn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage;
import org.muml.eloquent.example.drwahnsinn.Position;
import org.muml.eloquent.example.drwahnsinn.Tile;
import org.muml.eloquent.example.drwahnsinn.TileRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.TileRelationImpl#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileRelationImpl extends MinimalEObjectImpl.Container implements TileRelation {
	/**
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected Tile tile;

	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> positions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrwahnsinnPackage.Literals.TILE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getTile() {
		if (tile != null && tile.eIsProxy()) {
			InternalEObject oldTile = (InternalEObject)tile;
			tile = (Tile)eResolveProxy(oldTile);
			if (tile != oldTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrwahnsinnPackage.TILE_RELATION__TILE, oldTile, tile));
			}
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetTile() {
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTile(Tile newTile) {
		Tile oldTile = tile;
		tile = newTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrwahnsinnPackage.TILE_RELATION__TILE, oldTile, tile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPositions() {
		if (positions == null) {
			positions = new EObjectResolvingEList<Position>(Position.class, this, DrwahnsinnPackage.TILE_RELATION__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrwahnsinnPackage.TILE_RELATION__TILE:
				if (resolve) return getTile();
				return basicGetTile();
			case DrwahnsinnPackage.TILE_RELATION__POSITIONS:
				return getPositions();
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
			case DrwahnsinnPackage.TILE_RELATION__TILE:
				setTile((Tile)newValue);
				return;
			case DrwahnsinnPackage.TILE_RELATION__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Position>)newValue);
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
			case DrwahnsinnPackage.TILE_RELATION__TILE:
				setTile((Tile)null);
				return;
			case DrwahnsinnPackage.TILE_RELATION__POSITIONS:
				getPositions().clear();
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
			case DrwahnsinnPackage.TILE_RELATION__TILE:
				return tile != null;
			case DrwahnsinnPackage.TILE_RELATION__POSITIONS:
				return positions != null && !positions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TileRelationImpl
