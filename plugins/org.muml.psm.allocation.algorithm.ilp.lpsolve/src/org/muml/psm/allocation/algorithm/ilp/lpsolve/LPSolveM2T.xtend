package org.muml.psm.allocation.algorithm.ilp.lpsolve

import java.io.BufferedOutputStream
import java.io.OutputStream
import org.muml.core.CorePackage
import org.muml.core.expressions.Expression
import org.muml.core.expressions.common.ArithmeticExpression
import org.muml.core.expressions.common.ArithmeticOperator
import org.muml.core.expressions.common.ComparingOperator
import org.muml.core.expressions.common.ComparisonExpression
import org.muml.core.expressions.common.LiteralExpression
import org.muml.psm.allocation.ilp.ConstraintExpression
import org.muml.psm.allocation.ilp.ILPDataType
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression
import org.muml.psm.allocation.ilp.ObjectiveGoal
import org.muml.psm.allocation.ilp.Variable
import org.muml.psm.allocation.ilp.VariableExpression
import org.eclipse.core.runtime.Status

class LPSolveM2T {
	private static final String illegalExpression = "unexpected Expression: %s"
	private static final String illegalILPDataType = "unexpected ILP Data Type: %s"
	
	private OutputStream out
	
	private long startTime1;
	private Double finalTime;
	private Status logTransformationTime;
	
	def public Double getFinalTime()
	{
		finalTime
	}
	
	def protected void emit(String data) {
		print(data)
		out.write(data.bytes)
	}
	
	def serialize(IntegerLinearProgram ilp, OutputStream os) {
		startTime1 = System.currentTimeMillis();
		out = new BufferedOutputStream(os)
		if (ilp.objectiveFunction != null) {
			emitObjectiveFunction(ilp.objectiveFunction)
		}
		for (ConstraintExpression expression : ilp.constraints) {
			emitExpression(expression)
		}
		for (Variable variable : ilp.variables) {
			emitVariable(variable)
		}
		// we explicitly do not call close, because this would also close
		// the underlying stream (which would be OK in our case but...)
		finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime1)
					.doubleValue() / 1000d);
			
			logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as LPSolveInput: "+finalTime+" seconds")
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime)
		
		out.flush
		
	}
	
	def protected emitObjectiveFunction(ObjectiveFunctionExpression objectiveFunctionExpression) {
		if (objectiveFunctionExpression.goal == ObjectiveGoal.MAX) {
			emit('max: ')
		} else {
			emit('min: ')
		}
		emitExpression(objectiveFunctionExpression.objectiveFunction)
		emit(";\n")
	}
	
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
	
	def dispatch protected void emitExpression(Expression expression) {
		bail(expression)
	}
	
	def dispatch protected void emitExpression(ArithmeticExpression expression) {
		emitExpression(expression.leftExpression)
		// syntactic sugar: use switch...
		if (expression.operator == ArithmeticOperator.PLUS) {
			emit(' + ')
		} else if (expression.operator == ArithmeticOperator.MINUS) {
			emit(' - ')
		} else if (expression.operator == ArithmeticOperator.TIMES) {
			emit('*')
		} else {
			bail(expression)
		}
		emitExpression(expression.rightExpression)
	}
	
	def dispatch protected void emitExpression(LiteralExpression expression) {
		emit(expression.value)
	}
	
	def dispatch protected void emitExpression(VariableExpression expression) {
		emit(expression.variable.name)
	}
	
	def dispatch protected void emitExpression(ComparisonExpression expression) {
		if (expression.comment != CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT.defaultValue
			&& expression.comment != null && !"".equals(expression.comment)
		) {
			emit(expression.comment)
			emit(': ')
		}
		emitExpression(expression.leftExpression)
		// syntactic sugar: use switch...
		if (expression.operator == ComparingOperator.LESS_OR_EQUAL) {
			emit(' <= ')
		} else if (expression.operator == ComparingOperator.GREATER_OR_EQUAL) {
			emit(' >= ')
		} else if (expression.operator == ComparingOperator.EQUAL) {
			emit(' = ')
		} else {
			bail(expression)
		}
		emitExpression(expression.rightExpression)
		emit(";\n")
	}
	
	def protected void emitVariable(Variable variable) {
		if (variable.dataType != ILPDataType.BINARY) {
			bail(variable.dataType)
		}
		emit('bin ' + variable.name + ";\n");
	}
	
}