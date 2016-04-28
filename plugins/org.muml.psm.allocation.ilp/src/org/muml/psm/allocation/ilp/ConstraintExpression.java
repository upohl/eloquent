/**
 */
package org.muml.psm.allocation.ilp;

import org.muml.core.expressions.common.ComparisonExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a constraint of the Integer Linear Program.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getConstraintExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidOperator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidOperator='-- Invalid comparison operator (allowed <, <=, =, >=, >)\nSet{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL, core::expressions::common::ComparingOperator::EQUAL, core::expressions::common::ComparingOperator::GREATER_OR_EQUAL, core::expressions::common::ComparingOperator::GREATER}->includes(operator)'"
 * @generated
 */
public interface ConstraintExpression extends ComparisonExpression {
} // ConstraintExpression
