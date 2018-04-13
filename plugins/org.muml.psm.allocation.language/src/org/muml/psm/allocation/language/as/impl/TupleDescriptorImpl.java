/**
 */
package org.muml.psm.allocation.language.as.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl#getSequencePart <em>Sequence Part</em>}</li>
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
	 * The default value of the '{@link #getSequencePart() <em>Sequence Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencePart()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_PART_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSequencePart() <em>Sequence Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencePart()
	 * @generated
	 * @ordered
	 */
	protected String sequencePart = SEQUENCE_PART_EDEFAULT;

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
	public String getSequencePart() {
		return sequencePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequencePart(String newSequencePart) {
		String oldSequencePart = sequencePart;
		sequencePart = newSequencePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.TUPLE_DESCRIPTOR__SEQUENCE_PART, oldSequencePart, sequencePart));
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
			case AsPackage.TUPLE_DESCRIPTOR__SEQUENCE_PART:
				return getSequencePart();
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
			case AsPackage.TUPLE_DESCRIPTOR__SEQUENCE_PART:
				setSequencePart((String)newValue);
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
			case AsPackage.TUPLE_DESCRIPTOR__SEQUENCE_PART:
				setSequencePart(SEQUENCE_PART_EDEFAULT);
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
			case AsPackage.TUPLE_DESCRIPTOR__SEQUENCE_PART:
				return SEQUENCE_PART_EDEFAULT == null ? sequencePart != null : !SEQUENCE_PART_EDEFAULT.equals(sequencePart);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sequencePart: ");
		result.append(sequencePart);
		result.append(')');
		return result.toString();
	}


} //TupleDescriptorImpl
