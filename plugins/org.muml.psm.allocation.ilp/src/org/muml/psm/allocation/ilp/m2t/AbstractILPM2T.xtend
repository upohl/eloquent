package org.muml.psm.allocation.ilp.m2t

import java.io.BufferedOutputStream
import java.io.OutputStream
import java.util.List
import org.muml.psm.allocation.ilp.BinaryExpression
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
	private static final String illegalObject = "unexpected Object: %s"
	private static final String illegalILPDataType = "unexpected ILP Data Type: %s"
	private static final String illegalOperator = "unexpected Operator: %s"
	
	private OutputStream out
	
	def protected void emit(String data) {
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
	
	def protected void emitExpression(Expression expression) {
		val List<Object> todo = newArrayList()
		todo.add(expression)
		while (!todo.empty) {
			val Object current = todo.remove(todo.size - 1) 
			if (isLeaf(current)) {
				emitLeaf(current)
			} else if (current instanceof BinaryExpression) {
				todo.addAll(getChildren(current as BinaryExpression))
			} else {
				bail(current)
			}
		}
	}
	
	def dispatch protected void emitLeaf(Object object) {
		bail(object)
	}
	
	def dispatch protected void emitLeaf(VariableExpression variableExpression) {
		emit(getVariableName(variableExpression.variable))
	}
	
	def dispatch protected void emitLeaf(LiteralExpression literalExpression) {
		emit(literalExpression.value)
	}
	
	def dispatch protected void emitLeaf(Operator operator) {
		val String opString = switch (operator) {
			case PLUS: ' + '
			case MINUS: ' - '
			case TIMES: '*'
			case EQUAL_TO: ' = '
			case LESS_THAN_OR_EQUAL_TO: ' <= '
			case GREATER_THAN_OR_EQUAL_TO: ' >= '
		}
		if (opString === null) {
			bail(operator)
		}
		emit(opString)
	}
	
	def protected abstract void emitVariable(Variable varialbe)
	
	def protected getVariableName(Variable variable) {
		variable.name
	}
	
	def protected boolean isLeaf(Object object) {
		object instanceof VariableExpression
			|| object instanceof LiteralExpression
			|| object instanceof Operator
	}
	
	def protected List<Object> getChildren(BinaryExpression expression) {
		#[
			expression.rightExpression,
			expression.operator,
			expression.leftExpression
		]
	}
	
	def protected void bail(Object object) {
		throw new IllegalArgumentException(
			String.format(illegalObject, object)
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
	
}