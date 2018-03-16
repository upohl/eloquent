/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.internal.ElementImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor;
import org.muml.psm.allocation.language.as.TupleDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Constraint Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicationConstraintTupleDescriptorImpl extends ElementImpl implements ImplicationConstraintTupleDescriptor {
	/**
	 * The default value of the '{@link #getPremise() <em>Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremise()
	 * @generated
	 * @ordered
	 */
	protected static final String PREMISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremise() <em>Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremise()
	 * @generated
	 * @ordered
	 */
	protected String premise = PREMISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPremiseTupleDescriptor() <em>Premise Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseTupleDescriptor()
	 * @generated
	 * @ordered
	 */
	protected TupleDescriptor premiseTupleDescriptor;

	/**
	 * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected String conclusion = CONCLUSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConclusionTupleDescriptor() <em>Conclusion Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionTupleDescriptor()
	 * @generated
	 * @ordered
	 */
	protected TupleDescriptor conclusionTupleDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationConstraintTupleDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPremise() {
		return premise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremise(String newPremise) {
		String oldPremise = premise;
		premise = newPremise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE, oldPremise, premise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptor getPremiseTupleDescriptor() {
		return premiseTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseTupleDescriptor(TupleDescriptor newPremiseTupleDescriptor, NotificationChain msgs) {
		TupleDescriptor oldPremiseTupleDescriptor = premiseTupleDescriptor;
		premiseTupleDescriptor = newPremiseTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR, oldPremiseTupleDescriptor, newPremiseTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseTupleDescriptor(TupleDescriptor newPremiseTupleDescriptor) {
		if (newPremiseTupleDescriptor != premiseTupleDescriptor) {
			NotificationChain msgs = null;
			if (premiseTupleDescriptor != null)
				msgs = ((InternalEObject)premiseTupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR, null, msgs);
			if (newPremiseTupleDescriptor != null)
				msgs = ((InternalEObject)newPremiseTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetPremiseTupleDescriptor(newPremiseTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR, newPremiseTupleDescriptor, newPremiseTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(String newConclusion) {
		String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptor getConclusionTupleDescriptor() {
		return conclusionTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusionTupleDescriptor(TupleDescriptor newConclusionTupleDescriptor, NotificationChain msgs) {
		TupleDescriptor oldConclusionTupleDescriptor = conclusionTupleDescriptor;
		conclusionTupleDescriptor = newConclusionTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR, oldConclusionTupleDescriptor, newConclusionTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusionTupleDescriptor(TupleDescriptor newConclusionTupleDescriptor) {
		if (newConclusionTupleDescriptor != conclusionTupleDescriptor) {
			NotificationChain msgs = null;
			if (conclusionTupleDescriptor != null)
				msgs = ((InternalEObject)conclusionTupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR, null, msgs);
			if (newConclusionTupleDescriptor != null)
				msgs = ((InternalEObject)newConclusionTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetConclusionTupleDescriptor(newConclusionTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR, newConclusionTupleDescriptor, newConclusionTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR:
				return basicSetPremiseTupleDescriptor(null, msgs);
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR:
				return basicSetConclusionTupleDescriptor(null, msgs);
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
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE:
				return getPremise();
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR:
				return getPremiseTupleDescriptor();
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION:
				return getConclusion();
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR:
				return getConclusionTupleDescriptor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE:
				setPremise((String)newValue);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR:
				setPremiseTupleDescriptor((TupleDescriptor)newValue);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION:
				setConclusion((String)newValue);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR:
				setConclusionTupleDescriptor((TupleDescriptor)newValue);
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
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE:
				setPremise(PREMISE_EDEFAULT);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR:
				setPremiseTupleDescriptor((TupleDescriptor)null);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION:
				setConclusion(CONCLUSION_EDEFAULT);
				return;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR:
				setConclusionTupleDescriptor((TupleDescriptor)null);
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
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE:
				return PREMISE_EDEFAULT == null ? premise != null : !PREMISE_EDEFAULT.equals(premise);
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR:
				return premiseTupleDescriptor != null;
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION:
				return CONCLUSION_EDEFAULT == null ? conclusion != null : !CONCLUSION_EDEFAULT.equals(conclusion);
			case AsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR:
				return conclusionTupleDescriptor != null;
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
		result.append(" (premise: ");
		result.append(premise);
		result.append(", conclusion: ");
		result.append(conclusion);
		result.append(')');
		return result.toString();
	}


} //ImplicationConstraintTupleDescriptorImpl
