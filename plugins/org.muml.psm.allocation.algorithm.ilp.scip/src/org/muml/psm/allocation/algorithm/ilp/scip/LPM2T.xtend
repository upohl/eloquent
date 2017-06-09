package org.muml.psm.allocation.algorithm.ilp.scip

import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import org.eclipse.core.runtime.Status
import org.muml.psm.allocation.ilp.ArithmeticExpression
import org.muml.psm.allocation.ilp.ConstraintExpression
import org.muml.psm.allocation.ilp.Expression
import org.muml.psm.allocation.ilp.ILPDataType
import org.muml.psm.allocation.ilp.IlpPackage
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.muml.psm.allocation.ilp.LiteralExpression
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression
import org.muml.psm.allocation.ilp.ObjectiveGoal
import org.muml.psm.allocation.ilp.Operator
import org.muml.psm.allocation.ilp.Variable
import org.muml.psm.allocation.ilp.VariableExpression

class LPM2T {
	private static final String illegalExpression = "unexpected Expression: %s"
	private static final String illegalILPDataType = "unexpected ILP Data Type: %s"
	
	private OutputStream out
	private OutputStream fileOut
	public File myFile
	
	private long startTime1;
	private Double finalTime;
	private Status logTransformationTime;
	
	def public Double getFinalTime()
	{
		finalTime
	}
	
	def protected void emit(String data) {
		print(data)
	//	out.write(data.bytes)
		fileOut.write(data.bytes)
	}
	
	def serialize(IntegerLinearProgram ilp, String path) {
		
	//	out = new BufferedOutputStream(os)

		fileOut = new BufferedOutputStream(new FileOutputStream(myFile = new File(path+"\\ilp2.lp")))
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

		
	//	out.flush
		fileOut.flush
	//	fileOut.close
		
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
		if (expression.operator == Operator.PLUS) {
			emit(' + ')
		} else if (expression.operator == Operator.MINUS) {
			emit(' - ')
		} else if (expression.operator == Operator.TIMES) {
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
	
	def dispatch protected void emitExpression(ConstraintExpression expression) {
		if (expression.comment != IlpPackage.Literals.EXPRESSION__COMMENT.defaultValue
			&& expression.comment != null && !"".equals(expression.comment)
		) {
			emit(expression.comment)
			emit(': ')
		}
		emitExpression(expression.leftExpression)
		// syntactic sugar: use switch...
		if (expression.operator == Operator.LESS_THAN_OR_EQUAL_TO) {
			emit(' <= ')
		} else if (expression.operator == Operator.GREATER_THAN_OR_EQUAL_TO) {
			emit(' >= ')
		} else if (expression.operator == Operator.EQUAL_TO) {
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
