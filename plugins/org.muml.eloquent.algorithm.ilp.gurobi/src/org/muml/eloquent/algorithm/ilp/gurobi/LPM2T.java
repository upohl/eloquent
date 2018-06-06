package org.muml.eloquent.algorithm.ilp.gurobi;

import java.math.BigDecimal;
import java.util.List;

import org.muml.psm.allocation.ilp.ArithmeticExpression;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.LiteralExpression;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.muml.psm.allocation.ilp.Operator;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;
import org.muml.psm.allocation.ilp.m2t.AbstractILPM2T;

/*
 * Note: this code assumes a specific ILP structured... The current code
 * needs more love (aka it is a real mess...)
 * 
 */
public class LPM2T extends AbstractILPM2T {
	private static final String unsupportedOperator = "Unsupported operator: %s";
	
	private boolean inLHS = true;
	private boolean isFirstSummand = true;
	private double rhsValue = 0.0;

	@Override
	protected void serializeIntegerLinearProgram(IntegerLinearProgram ilp) {
		emitObjectiveFunction(ilp.getObjectiveFunction());
		emitConstraintExpressions(ilp.getConstraints());
		emitVariables(ilp.getVariables());
	}

	@Override
	protected void emitObjectiveFunction(ObjectiveFunctionExpression objectiveFunctionExpression) {
		if (objectiveFunctionExpression.getGoal() == ObjectiveGoal.MAX) {
			emit("Maximize\n");
		} else {
			emit("Minimize\n");
		}
		emitExpression(objectiveFunctionExpression.getObjectiveFunction());
		// we ignore constants in the objective function
		rhsValue = 0.0;
		emit("\n");
	}
	
	@Override
	protected void emitConstraintExpressions(List<ConstraintExpression> constraintExpressionList) {
		emit("Subject To\n");
		super.emitConstraintExpressions(constraintExpressionList);
	}
	
	@Override
	protected void emitVariables(List<Variable> variableList) {
		emit("Binary\n");
		super.emitVariables(variableList);
	}
	
	@Override
	protected void emitConstraintExpression(ConstraintExpression constraintExpression) {
		isFirstSummand = true;
		if (!inLHS) {
			throw new IllegalStateException("XXX");
		}
		emitExpression(constraintExpression.getLeftExpression());
		inLHS = false;
		emitExpression(constraintExpression.getRightExpression());
		emitLeaf(constraintExpression.getOperator());
		emit(convertDoubleToString(rhsValue));
		emit("\n");
		inLHS = true;
		rhsValue = 0.0;
	}
		
	@Override
	protected boolean isLeaf(Object object) {
		if (object instanceof ArithmeticExpression
				&& ((ArithmeticExpression) object).getOperator() == Operator.TIMES) {
			return true;
		}
		return super.isLeaf(object);
	}
	
	@Override
	protected void emitLeaf(Object object) {
		if (object instanceof VariableExpression) {
			emitLeaf((VariableExpression) object, false);
			return;
		} else if (object instanceof LiteralExpression) {
			emitLeaf((LiteralExpression) object, false);
			return;
		} else if (object instanceof ArithmeticExpression) {
			emitLeaf((ArithmeticExpression) object);
			return;
		} else if (object == Operator.TIMES) {
				emit(" ");
				return;
		} else if (object instanceof Operator) {
			if (object != Operator.PLUS && object != Operator.EQUAL_TO
					&& object != Operator.GREATER_THAN_OR_EQUAL_TO
					&& object != Operator.LESS_THAN_OR_EQUAL_TO) {
				throw new IllegalArgumentException(
						String.format(unsupportedOperator, object));
			}
			// due to our assumed structure, we emit a plus later
			if (object == Operator.PLUS) {
				return;
			}
			// fall through to the super call...
		}
		super.emitLeaf(object);
	}
	
	protected void handleSummand() {
		if (!isFirstSummand) {
			emit(" + ");
		} else {
			isFirstSummand = false;
		}
	}
	
	protected void emitLeaf(VariableExpression variableExpression, boolean hasCoefficient) {
		if (!hasCoefficient) {
			handleSummand();
		}
		if (!inLHS && !hasCoefficient) {
			emit("-1 ");
		}
		super.emitLeaf(variableExpression);
	}
	
	protected void emitLeaf(LiteralExpression literalExpression, boolean isCoefficient) {
		double value = Double.parseDouble(literalExpression.getValue());
		if (isCoefficient && !inLHS ||
				!isCoefficient && inLHS) {
			value *= -1;
		}
		if (isCoefficient) {
			emit(convertDoubleToString(value));
		} else {
			rhsValue += value;
		}
	}
	
	protected void emitLeaf(ArithmeticExpression expression) {
		handleSummand();
		// we assume a specific ILP structure
		emitLeaf((LiteralExpression) expression.getLeftExpression(), true);
		emitLeaf(Operator.TIMES);
		emitLeaf((VariableExpression) expression.getRightExpression(), true);
	}

	@Override
	protected void emitVariable(Variable variable) {
		emit(getVariableName(variable));
		emit("\n");
	}
	
	protected String convertDoubleToString(double d) {
		return BigDecimal.valueOf(d).stripTrailingZeros().toPlainString();
	}

}
