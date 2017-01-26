/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.muml.psm.allocation.language.cs.BoundCS;
import org.muml.psm.allocation.language.cs.CsPackage;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoundCSImpl extends EvaluatableElementCSImpl implements BoundCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.BOUND_CS;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitBoundCS(this);
	}

} //BoundCSImpl
