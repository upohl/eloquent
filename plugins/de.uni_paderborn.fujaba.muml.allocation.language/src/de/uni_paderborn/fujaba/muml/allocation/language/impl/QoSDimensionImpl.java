/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage;
import de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension;
import de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSDimensionImpl extends NamedElementImpl implements QoSDimension {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected String metric = METRIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTupleDescriptors() <em>Tuple Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentResourceTupleDescriptor> tupleDescriptors;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptor value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.QO_SDIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(String newMetric) {
		String oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.QO_SDIMENSION__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentResourceTupleDescriptor> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptor>(ComponentResourceTupleDescriptor.class, this, LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueTupleDescriptor newValue, NotificationChain msgs) {
		ValueTupleDescriptor oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LanguagePackage.QO_SDIMENSION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueTupleDescriptor newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.QO_SDIMENSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LanguagePackage.QO_SDIMENSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.QO_SDIMENSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case LanguagePackage.QO_SDIMENSION__VALUE:
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
			case LanguagePackage.QO_SDIMENSION__METRIC:
				return getMetric();
			case LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case LanguagePackage.QO_SDIMENSION__VALUE:
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
			case LanguagePackage.QO_SDIMENSION__METRIC:
				setMetric((String)newValue);
				return;
			case LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptor>)newValue);
				return;
			case LanguagePackage.QO_SDIMENSION__VALUE:
				setValue((ValueTupleDescriptor)newValue);
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
			case LanguagePackage.QO_SDIMENSION__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case LanguagePackage.QO_SDIMENSION__VALUE:
				setValue((ValueTupleDescriptor)null);
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
			case LanguagePackage.QO_SDIMENSION__METRIC:
				return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
			case LanguagePackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case LanguagePackage.QO_SDIMENSION__VALUE:
				return value != null;
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //QoSDimensionImpl
