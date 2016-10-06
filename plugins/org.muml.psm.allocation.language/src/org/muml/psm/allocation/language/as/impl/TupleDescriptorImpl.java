/**
 */
package org.muml.psm.allocation.language.as.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.internal.ElementImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.TupleDescriptor;
import org.muml.psm.allocation.language.as.TypedPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl#getTypedPairs <em>Typed Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleDescriptorImpl extends ElementImpl implements TupleDescriptor {
	/**
	 * The cached value of the '{@link #getTypedPairs() <em>Typed Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedPair> typedPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.TUPLE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedPair> getTypedPairs() {
		if (typedPairs == null) {
			typedPairs = new EObjectContainmentEList<TypedPair>(TypedPair.class, this, AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS);
		}
		return typedPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS:
				return ((InternalEList<?>)getTypedPairs()).basicRemove(otherEnd, msgs);
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
			case AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS:
				return getTypedPairs();
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
			case AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS:
				getTypedPairs().clear();
				getTypedPairs().addAll((Collection<? extends TypedPair>)newValue);
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
			case AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS:
				getTypedPairs().clear();
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
			case AsPackage.TUPLE_DESCRIPTOR__TYPED_PAIRS:
				return typedPairs != null && !typedPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}


} //TupleDescriptorImpl
