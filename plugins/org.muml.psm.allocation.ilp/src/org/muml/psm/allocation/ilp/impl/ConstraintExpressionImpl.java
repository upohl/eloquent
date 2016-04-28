/**
 */
package org.muml.psm.allocation.ilp.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.mumlcore.expressions.common.impl.ComparisonExpressionImpl;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IlpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstraintExpressionImpl extends ComparisonExpressionImpl implements ConstraintExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlpPackage.Literals.CONSTRAINT_EXPRESSION;
	}

} //ConstraintExpressionImpl
