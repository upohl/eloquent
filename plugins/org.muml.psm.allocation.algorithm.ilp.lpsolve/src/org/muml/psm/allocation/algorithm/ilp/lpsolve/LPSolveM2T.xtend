package org.muml.psm.allocation.algorithm.ilp.lpsolve

import org.muml.psm.allocation.ilp.ConstraintExpression
import org.muml.psm.allocation.ilp.ILPDataType
import org.muml.psm.allocation.ilp.IlpPackage
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression
import org.muml.psm.allocation.ilp.ObjectiveGoal
import org.muml.psm.allocation.ilp.Variable
import org.muml.psm.allocation.ilp.m2t.AbstractILPM2T

class LPSolveM2T extends AbstractILPM2T {
	
	override protected serializeIntegerLinearProgram(IntegerLinearProgram ilp) {
		emitObjectiveFunction(ilp.objectiveFunction)
		emitConstraintExpressions(ilp.constraints)
		emitVariables(ilp.variables)
	}
	
	override protected emitObjectiveFunction(ObjectiveFunctionExpression objectiveFunctionExpression) {
		if (objectiveFunctionExpression === null) {
			return
		}
		if (objectiveFunctionExpression.goal === ObjectiveGoal.MAX) {
			emit('max: ')
		} else {
			emit('min: ')
		}
		emitExpression(objectiveFunctionExpression.objectiveFunction)
		emit(";\n")
	}
	
	override protected emitConstraintExpression(ConstraintExpression expression) {
		if (expression.comment !== IlpPackage.Literals.EXPRESSION__COMMENT.defaultValue
			&& expression.comment !== null && !"".equals(expression.comment)
		) {
			emit(expression.comment)
			emit(': ')
		}
		super.emitConstraintExpression(expression)
		emit(";\n")
	}
	
	override protected void emitVariable(Variable variable) {
		if (variable.dataType != ILPDataType.BINARY) {
			bail(variable.dataType)
		}
		emit('bin ' + variable.name + ";\n");
	}
	
}