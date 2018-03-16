/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.TupleDescriptorCS;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Constraint Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicationConstraintTupleDescriptorCSImpl extends ModelElementCSImpl implements ImplicationConstraintTupleDescriptorCS {
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
	protected TupleDescriptorCS premiseTupleDescriptor;

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
	protected TupleDescriptorCS conclusionTupleDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationConstraintTupleDescriptorCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE, oldPremise, premise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptorCS getPremiseTupleDescriptor() {
		return premiseTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseTupleDescriptor(TupleDescriptorCS newPremiseTupleDescriptor, NotificationChain msgs) {
		TupleDescriptorCS oldPremiseTupleDescriptor = premiseTupleDescriptor;
		premiseTupleDescriptor = newPremiseTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR, oldPremiseTupleDescriptor, newPremiseTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseTupleDescriptor(TupleDescriptorCS newPremiseTupleDescriptor) {
		if (newPremiseTupleDescriptor != premiseTupleDescriptor) {
			NotificationChain msgs = null;
			if (premiseTupleDescriptor != null)
				msgs = ((InternalEObject)premiseTupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR, null, msgs);
			if (newPremiseTupleDescriptor != null)
				msgs = ((InternalEObject)newPremiseTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetPremiseTupleDescriptor(newPremiseTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR, newPremiseTupleDescriptor, newPremiseTupleDescriptor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptorCS getConclusionTupleDescriptor() {
		return conclusionTupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusionTupleDescriptor(TupleDescriptorCS newConclusionTupleDescriptor, NotificationChain msgs) {
		TupleDescriptorCS oldConclusionTupleDescriptor = conclusionTupleDescriptor;
		conclusionTupleDescriptor = newConclusionTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR, oldConclusionTupleDescriptor, newConclusionTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusionTupleDescriptor(TupleDescriptorCS newConclusionTupleDescriptor) {
		if (newConclusionTupleDescriptor != conclusionTupleDescriptor) {
			NotificationChain msgs = null;
			if (conclusionTupleDescriptor != null)
				msgs = ((InternalEObject)conclusionTupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR, null, msgs);
			if (newConclusionTupleDescriptor != null)
				msgs = ((InternalEObject)newConclusionTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetConclusionTupleDescriptor(newConclusionTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR, newConclusionTupleDescriptor, newConclusionTupleDescriptor));
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
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR:
				return basicSetPremiseTupleDescriptor(null, msgs);
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR:
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
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE:
				return getPremise();
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR:
				return getPremiseTupleDescriptor();
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION:
				return getConclusion();
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR:
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
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE:
				setPremise((String)newValue);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR:
				setPremiseTupleDescriptor((TupleDescriptorCS)newValue);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION:
				setConclusion((String)newValue);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR:
				setConclusionTupleDescriptor((TupleDescriptorCS)newValue);
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
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE:
				setPremise(PREMISE_EDEFAULT);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR:
				setPremiseTupleDescriptor((TupleDescriptorCS)null);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION:
				setConclusion(CONCLUSION_EDEFAULT);
				return;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR:
				setConclusionTupleDescriptor((TupleDescriptorCS)null);
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
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE:
				return PREMISE_EDEFAULT == null ? premise != null : !PREMISE_EDEFAULT.equals(premise);
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR:
				return premiseTupleDescriptor != null;
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION:
				return CONCLUSION_EDEFAULT == null ? conclusion != null : !CONCLUSION_EDEFAULT.equals(conclusion);
			case CsPackage.IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR:
				return conclusionTupleDescriptor != null;
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
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitImplicationConstraintTupleDescriptorCS(this);
	}

} //ImplicationConstraintTupleDescriptorCSImpl
