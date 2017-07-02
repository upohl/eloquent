/**
 */
package org.muml.eloquent.example.drwahnsinn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame;
import org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage;
import org.muml.eloquent.example.drwahnsinn.Position;
import org.muml.eloquent.example.drwahnsinn.Tile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dr Wahnsinn Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link org.muml.eloquent.example.drwahnsinn.impl.DrWahnsinnGameImpl#getTiles <em>Tiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrWahnsinnGameImpl extends MinimalEObjectImpl.Container implements DrWahnsinnGame {
	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> positions;

	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrWahnsinnGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrwahnsinnPackage.Literals.DR_WAHNSINN_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList<Position>(Position.class, this, DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getTiles() {
		if (tiles == null) {
			tiles = new EObjectContainmentEList<Tile>(Tile.class, this, DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES);
		}
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS:
				return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES:
				return ((InternalEList<?>)getTiles()).basicRemove(otherEnd, msgs);
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
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS:
				return getPositions();
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES:
				return getTiles();
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
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Position>)newValue);
				return;
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES:
				getTiles().clear();
				getTiles().addAll((Collection<? extends Tile>)newValue);
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
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS:
				getPositions().clear();
				return;
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES:
				getTiles().clear();
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
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__POSITIONS:
				return positions != null && !positions.isEmpty();
			case DrwahnsinnPackage.DR_WAHNSINN_GAME__TILES:
				return tiles != null && !tiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DrWahnsinnGameImpl
