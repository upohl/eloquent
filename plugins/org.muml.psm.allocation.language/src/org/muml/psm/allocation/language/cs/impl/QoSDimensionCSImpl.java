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
import org.eclipse.ocl.xtext.basecs.impl.NamedElementCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS;
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimension CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSDimensionCSImpl extends NamedElementCSImpl implements QoSDimensionCS {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ContextCS expression;

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
	 * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptorCS weighting;

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
	public ContextCS getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ContextCS newExpression, NotificationChain msgs) {
		ContextCS oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ContextCS newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__EXPRESSION, newExpression, newExpression));
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
	public ValueTupleDescriptorCS getWeighting() {
		return weighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighting(ValueTupleDescriptorCS newWeighting, NotificationChain msgs) {
		ValueTupleDescriptorCS oldWeighting = weighting;
		weighting = newWeighting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__WEIGHTING, oldWeighting, newWeighting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighting(ValueTupleDescriptorCS newWeighting) {
		if (newWeighting != weighting) {
			NotificationChain msgs = null;
			if (weighting != null)
				msgs = ((InternalEObject)weighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__WEIGHTING, null, msgs);
			if (newWeighting != null)
				msgs = ((InternalEObject)newWeighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.QO_SDIMENSION_CS__WEIGHTING, null, msgs);
			msgs = basicSetWeighting(newWeighting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.QO_SDIMENSION_CS__WEIGHTING, newWeighting, newWeighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.QO_SDIMENSION_CS__EXPRESSION:
				return basicSetExpression(null, msgs);
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case CsPackage.QO_SDIMENSION_CS__WEIGHTING:
				return basicSetWeighting(null, msgs);
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
			case CsPackage.QO_SDIMENSION_CS__EXPRESSION:
				return getExpression();
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case CsPackage.QO_SDIMENSION_CS__WEIGHTING:
				return getWeighting();
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
			case CsPackage.QO_SDIMENSION_CS__EXPRESSION:
				setExpression((ContextCS)newValue);
				return;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptorCS>)newValue);
				return;
			case CsPackage.QO_SDIMENSION_CS__WEIGHTING:
				setWeighting((ValueTupleDescriptorCS)newValue);
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
			case CsPackage.QO_SDIMENSION_CS__EXPRESSION:
				setExpression((ContextCS)null);
				return;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case CsPackage.QO_SDIMENSION_CS__WEIGHTING:
				setWeighting((ValueTupleDescriptorCS)null);
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
			case CsPackage.QO_SDIMENSION_CS__EXPRESSION:
				return expression != null;
			case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case CsPackage.QO_SDIMENSION_CS__WEIGHTING:
				return weighting != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EvaluatableElementCS.class) {
			switch (derivedFeatureID) {
				case CsPackage.QO_SDIMENSION_CS__EXPRESSION: return CsPackage.EVALUATABLE_ELEMENT_CS__EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == WeightingComponentResourceTupleElementCS.class) {
			switch (derivedFeatureID) {
				case CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS: return CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS;
				case CsPackage.QO_SDIMENSION_CS__WEIGHTING: return CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EvaluatableElementCS.class) {
			switch (baseFeatureID) {
				case CsPackage.EVALUATABLE_ELEMENT_CS__EXPRESSION: return CsPackage.QO_SDIMENSION_CS__EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == WeightingComponentResourceTupleElementCS.class) {
			switch (baseFeatureID) {
				case CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS: return CsPackage.QO_SDIMENSION_CS__TUPLE_DESCRIPTORS;
				case CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING: return CsPackage.QO_SDIMENSION_CS__WEIGHTING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitQoSDimensionCS(this);
	}

} //QoSDimensionCSImpl
