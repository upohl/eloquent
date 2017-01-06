/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.impl.TypedElementCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.OCLContextCS;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Context CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OCLContextCSImpl extends TypedElementCSImpl implements OCLContextCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLContextCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.OCL_CONTEXT_CS;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitOCLContextCS(this);
	}

} //OCLContextCSImpl
