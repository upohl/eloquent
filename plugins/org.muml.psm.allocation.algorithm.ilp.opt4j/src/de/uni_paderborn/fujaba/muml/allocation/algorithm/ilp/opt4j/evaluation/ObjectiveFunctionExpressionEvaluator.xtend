package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.evaluation

import org.storydriven.core.expressions.Expression
import java.util.Map
import org.storydriven.core.expressions.common.LiteralExpression
import org.storydriven.core.expressions.common.ArithmeticExpression
import org.storydriven.core.expressions.common.ArithmeticOperator
import de.uni_paderborn.fujaba.muml.allocation.ilp.VariableExpression
import de.uni_paderborn.fujaba.muml.allocation.ilp.Variable

class ObjectiveFunctionExpressionEvaluator {
	
	static class Environment {
		val Map<String, Boolean> allocation
		
		new(Map<String, Boolean> allocation) {
			this.allocation = allocation
		}
		
		def double lookup(Variable variable) {
			val Boolean value = allocation.get(variable.name)
			if (value == null) {
				throw new IllegalArgumentException("env has no variable: " + variable.name)
			}
			if (value) 1 else 0
		}
	}
	
	val Environment environment
	
	new(Map<String, Boolean> allocation) {
		environment = new Environment(allocation)
	}
	
	def static double evaluate(Expression expression, Map<String, Boolean> allocation) {
		new ObjectiveFunctionExpressionEvaluator(allocation).evaluate(
			expression
		)
	}
	
	public def dispatch double evaluate(Expression expression) {
		throw new IllegalArgumentException("unsupported expression: " + expression)
	}
	
	public def dispatch double evaluate(ArithmeticExpression expression) {
		val left = evaluate(expression.leftExpression)
		val right = evaluate(expression.rightExpression)
		return switch (expression.operator) {
			case ArithmeticOperator.PLUS: left + right
			case ArithmeticOperator.TIMES: left * right
			default: throw new IllegalArgumentException("unexpected operator " + expression.operator)
		}
	}
	
	public def dispatch double evaluate(LiteralExpression expression) {
		Double.parseDouble(expression.value)
	}
	
	public def dispatch double evaluate(VariableExpression expression) {
		environment.lookup(expression.variable)
	}
}