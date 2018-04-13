/**
 */
package org.muml.psm.allocation.language.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.TupleDescriptorCS;
import org.muml.psm.allocation.language.cs.TypedPairCS;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl#getTypedPairs <em>Typed Pairs</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl#getSequencePart <em>Sequence Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleDescriptorCSImpl extends ModelElementCSImpl implements TupleDescriptorCS {
	/**
	 * The cached value of the '{@link #getTypedPairs() <em>Typed Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedPairCS> typedPairs;

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
	protected TupleDescriptorCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.TUPLE_DESCRIPTOR_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedPairCS> getTypedPairs() {
		if (typedPairs == null) {
			typedPairs = new EObjectContainmentEList<TypedPairCS>(TypedPairCS.class, this, CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.TUPLE_DESCRIPTOR_CS__SEQUENCE_PART, oldSequencePart, sequencePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS:
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
			case CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS:
				return getTypedPairs();
			case CsPackage.TUPLE_DESCRIPTOR_CS__SEQUENCE_PART:
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
			case CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS:
				getTypedPairs().clear();
				getTypedPairs().addAll((Collection<? extends TypedPairCS>)newValue);
				return;
			case CsPackage.TUPLE_DESCRIPTOR_CS__SEQUENCE_PART:
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
			case CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS:
				getTypedPairs().clear();
				return;
			case CsPackage.TUPLE_DESCRIPTOR_CS__SEQUENCE_PART:
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
			case CsPackage.TUPLE_DESCRIPTOR_CS__TYPED_PAIRS:
				return typedPairs != null && !typedPairs.isEmpty();
			case CsPackage.TUPLE_DESCRIPTOR_CS__SEQUENCE_PART:
				return SEQUENCE_PART_EDEFAULT == null ? sequencePart != null : !SEQUENCE_PART_EDEFAULT.equals(sequencePart);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitTupleDescriptorCS(this);
	}

} //TupleDescriptorCSImpl
