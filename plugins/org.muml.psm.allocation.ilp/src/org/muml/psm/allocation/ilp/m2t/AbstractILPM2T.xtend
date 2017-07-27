package org.muml.psm.allocation.ilp.m2t

import java.io.BufferedOutputStream
import java.io.OutputStream
import java.util.List
import org.muml.psm.allocation.ilp.ArithmeticExpression
import org.muml.psm.allocation.ilp.ConstraintExpression
import org.muml.psm.allocation.ilp.Expression
import org.muml.psm.allocation.ilp.ILPDataType
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.muml.psm.allocation.ilp.LiteralExpression
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression
import org.muml.psm.allocation.ilp.Operator
import org.muml.psm.allocation.ilp.Variable
import org.muml.psm.allocation.ilp.VariableExpression

abstract class AbstractILPM2T {
	private static final String illegalExpression = "unexpected Expression: %s"
	private static final String illegalILPDataType = "unexpected ILP Data Type: %s"
	private static final String illegalOperator = "unexpected Operator: %s"
	
	private OutputStream out
	
	def protected void emit(String data) {
		print(data)
		out.write(data.bytes)
	}
	
	def serialize(IntegerLinearProgram ilp, OutputStream os) {
		out = new BufferedOutputStream(os)
		serializeIntegerLinearProgram(ilp)
		// we explicitly do not call close, because this would also close
		// the underlying stream (which would be OK in our case but...)
		out.flush
	}
	
	def protected abstract void serializeIntegerLinearProgram(IntegerLinearProgram ilp)
	
	def protected emitVariables(List<Variable> variableList) {
		for (Variable variable : variableList) {
			emitVariable(variable)
		}
	}
	
	def protected emitConstraintExpressions(List<ConstraintExpression> constraintExpressionList) {
		for (ConstraintExpression constraintExpression : constraintExpressionList) {
			emitConstraintExpression(constraintExpression)
		}
	}
	
	def protected emitConstraintExpression(ConstraintExpression constraintExpression) {
		emitExpression(constraintExpression)
	}
	
	def protected abstract void emitObjectiveFunction(ObjectiveFunctionExpression objectiveFunctionExpression)
	
	def protected void bail(Expression expression) {
		throw new IllegalArgumentException(
			String.format(illegalExpression, expression)
		)
	}
	
	def protected void bail(ILPDataType ilpDataType) {
		throw new IllegalArgumentException(
			String.format(illegalILPDataType, ilpDataType)
		)
	}
	
	def protected void bail(Operator operator) {
		throw new IllegalArgumentException(
			String.format(illegalOperator, operator)
		)
	}
	
	def dispatch protected void emitExpression(Expression expression) {
		bail(expression)
	}
	
	def dispatch protected void emitExpression(ArithmeticExpression expression) {
		emitExpression(expression.leftExpression)
		emit(getArithmeticOperatorLiteral(expression.operator))
		emitExpression(expression.rightExpression)
	}
	
	def protected getArithmeticOperatorLiteral(Operator operator) {
		switch (operator) {
			case PLUS: ' + '
			case MINUS: ' - '
			case TIMES: '*'
			default: bail(operator)
		}
	}
	
	def dispatch protected void emitExpression(LiteralExpression expression) {
		emit(expression.value)
	}
	
	def dispatch protected void emitExpression(VariableExpression expression) {
		emit(getVariableName(expression.variable))
	}
	
	def dispatch protected void emitExpression(ConstraintExpression expression) {
		emitExpression(expression.leftExpression)
		emit(getRelationalOperatorLiteral(expression.operator))
		emitExpression(expression.rightExpression)
	}
	
	def protected getRelationalOperatorLiteral(Operator operator) {
		switch (operator) {
			case EQUAL_TO: ' = '
			case LESS_THAN_OR_EQUAL_TO: ' <= '
			case GREATER_THAN_OR_EQUAL_TO: ' >= '
			default: bail(operator)
		}
	}
	
	def protected abstract void emitVariable(Variable varialbe)
	
	def protected getVariableName(Variable variable) {
		variable.name
	}
	
}