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
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.internal.NamedElementImpl;
import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor;
import org.muml.psm.allocation.language.as.EvaluatableElement;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.ValueTupleDescriptor;
import org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SDimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.QoSDimensionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.QoSDimensionImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.QoSDimensionImpl#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QoSDimensionImpl extends NamedElementImpl implements QoSDimension {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL expression;

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
	 * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptor weighting;

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
		return AsPackage.Literals.QO_SDIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionInOCL newExpression, NotificationChain msgs) {
		ExpressionInOCL oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.QO_SDIMENSION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ExpressionInOCL newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.QO_SDIMENSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.QO_SDIMENSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.QO_SDIMENSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentResourceTupleDescriptor> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptor>(ComponentResourceTupleDescriptor.class, this, AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor getWeighting() {
		return weighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighting(ValueTupleDescriptor newWeighting, NotificationChain msgs) {
		ValueTupleDescriptor oldWeighting = weighting;
		weighting = newWeighting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.QO_SDIMENSION__WEIGHTING, oldWeighting, newWeighting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighting(ValueTupleDescriptor newWeighting) {
		if (newWeighting != weighting) {
			NotificationChain msgs = null;
			if (weighting != null)
				msgs = ((InternalEObject)weighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.QO_SDIMENSION__WEIGHTING, null, msgs);
			if (newWeighting != null)
				msgs = ((InternalEObject)newWeighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.QO_SDIMENSION__WEIGHTING, null, msgs);
			msgs = basicSetWeighting(newWeighting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.QO_SDIMENSION__WEIGHTING, newWeighting, newWeighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.QO_SDIMENSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case AsPackage.QO_SDIMENSION__WEIGHTING:
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
			case AsPackage.QO_SDIMENSION__EXPRESSION:
				return getExpression();
			case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case AsPackage.QO_SDIMENSION__WEIGHTING:
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
			case AsPackage.QO_SDIMENSION__EXPRESSION:
				setExpression((ExpressionInOCL)newValue);
				return;
			case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptor>)newValue);
				return;
			case AsPackage.QO_SDIMENSION__WEIGHTING:
				setWeighting((ValueTupleDescriptor)newValue);
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
			case AsPackage.QO_SDIMENSION__EXPRESSION:
				setExpression((ExpressionInOCL)null);
				return;
			case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case AsPackage.QO_SDIMENSION__WEIGHTING:
				setWeighting((ValueTupleDescriptor)null);
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
			case AsPackage.QO_SDIMENSION__EXPRESSION:
				return expression != null;
			case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case AsPackage.QO_SDIMENSION__WEIGHTING:
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
		if (baseClass == EvaluatableElement.class) {
			switch (derivedFeatureID) {
				case AsPackage.QO_SDIMENSION__EXPRESSION: return AsPackage.EVALUATABLE_ELEMENT__EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == WeightingComponentResourceTupleElement.class) {
			switch (derivedFeatureID) {
				case AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS: return AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS;
				case AsPackage.QO_SDIMENSION__WEIGHTING: return AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING;
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
		if (baseClass == EvaluatableElement.class) {
			switch (baseFeatureID) {
				case AsPackage.EVALUATABLE_ELEMENT__EXPRESSION: return AsPackage.QO_SDIMENSION__EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == WeightingComponentResourceTupleElement.class) {
			switch (baseFeatureID) {
				case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS: return AsPackage.QO_SDIMENSION__TUPLE_DESCRIPTORS;
				case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING: return AsPackage.QO_SDIMENSION__WEIGHTING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //QoSDimensionImpl
