/**
 */
package org.muml.psm.allocation.ilp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an arithmetic expression. That is, the leftExpression
 * and rightExpression can be combined by an arithmetic operator (for
 * instance, + (PLUS), - (MINUS), and, * (TIMES)).
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getArithmeticExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidOperator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidOperator='-- Invalid arithmetic operator (allowed +, -, *)\nSet{Operator::PLUS, Operator::MINUS, Operator::TIMES}->includes(operator)'"
 * @generated
 */
public interface ArithmeticExpression extends BinaryExpression {
} // ArithmeticExpression
