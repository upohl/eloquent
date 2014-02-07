/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.impl;

import de.uni_paderborn.fujaba.muml.allocation.ilp.ConstraintExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage;

import org.eclipse.emf.ecore.EClass;

import org.storydriven.core.expressions.common.impl.ComparisonExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
