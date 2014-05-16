/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor;

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
import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.ocl.examples.xtext.base.basecs.impl.NamedElementCSImpl;

import org.eclipse.ocl.examples.xtext.base.basecs.util.BaseCSVisitor;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimension CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSDimensionCSImpl extends NamedElementCSImpl implements QoSDimensionCS {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected ContextCS metric;

	/**
	 * The cached value of the '{@link #getTupleDescriptors() <em>Tuple Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentResourceTupleDescriptorCS> tupleDescriptors;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptorCS value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSDimensionCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.QO_SDIMENSION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCS getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(ContextCS newMetric, NotificationChain msgs) {
		ContextCS oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__METRIC, oldMetric, newMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(ContextCS newMetric) {
		if (newMetric != metric) {
			NotificationChain msgs = null;
			if (metric != null)
				msgs = ((InternalEObject)metric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__METRIC, null, msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__METRIC, null, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentResourceTupleDescriptorCS> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptorCS>(ComponentResourceTupleDescriptorCS.class, this, CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptorCS getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueTupleDescriptorCS newValue, NotificationChain msgs) {
		ValueTupleDescriptorCS oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueTupleDescriptorCS newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.QO_SDIMENSION_CS__METRIC:
				return basicSetMetric(null, msgs);
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case CsPackage.QO_SDIMENSION_CS__VALUE:
				return basicSetValue(null, msgs);
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
			case CsPackage.QO_SDIMENSION_CS__METRIC:
				return getMetric();
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case CsPackage.QO_SDIMENSION_CS__VALUE:
				return getValue();
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
			case CsPackage.QO_SDIMENSION_CS__METRIC:
				setMetric((ContextCS)newValue);
				return;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptorCS>)newValue);
				return;
			case CsPackage.QO_SDIMENSION_CS__VALUE:
				setValue((ValueTupleDescriptorCS)newValue);
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
			case CsPackage.QO_SDIMENSION_CS__METRIC:
				setMetric((ContextCS)null);
				return;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case CsPackage.QO_SDIMENSION_CS__VALUE:
				setValue((ValueTupleDescriptorCS)null);
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
			case CsPackage.QO_SDIMENSION_CS__METRIC:
				return metric != null;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case CsPackage.QO_SDIMENSION_CS__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public @Nullable <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitQoSDimensionCS(this);
	}

} //QoSDimensionCSImpl
