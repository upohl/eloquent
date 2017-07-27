package org.muml.eloquent.algorithm.ilp.neos.cplex;

import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.m2t.AbstractILPM2T;

public class AMPLM2T extends AbstractILPM2T {
	
	private ILPNameEnvironment nameEnvironment;
	
	public AMPLM2T(ILPNameEnvironment nameEnvironment) {
		this.nameEnvironment = nameEnvironment;
	}

	@Override
	protected void serializeIntegerLinearProgram(IntegerLinearProgram ilp) {
		emitVariables(ilp.getVariables());
		emitObjectiveFunction(ilp.getObjectiveFunction());
		emitConstraintExpressions(ilp.getConstraints());
	}
	
	@Override
	protected void emitConstraintExpression(ConstraintExpression expression) {
		String name = nameEnvironment.getName(expression);
		emit(String.format("subject to %s: ", name));
		super.emitConstraintExpression(expression);
		emit(";\n");
	}

	@Override
	protected void emitObjectiveFunction(ObjectiveFunctionExpression objectiveFunctionExpression) {
		if (objectiveFunctionExpression.getGoal() == ObjectiveGoal.MAX) {
			emit("maximize ");
		} else {
			emit("minimize ");
		}
		emit(nameEnvironment.getName(objectiveFunctionExpression));
		emit(": ");
		emitExpression(objectiveFunctionExpression.getObjectiveFunction());
		emit(";\n\n");
	}

	@Override
	protected void emitVariable(Variable variable) {
		emit("var " + nameEnvironment.getName(variable) + ", >= 0, <= 1, integer;\n");
	}
	
	@Override
	protected String getVariableName(Variable variable) {
		return nameEnvironment.getName(variable);
	}

}
