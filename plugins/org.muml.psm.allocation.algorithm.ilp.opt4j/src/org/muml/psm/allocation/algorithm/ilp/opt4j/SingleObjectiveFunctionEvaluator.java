package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.psm.allocation.algorithm.ilp.opt4j.evaluation.ObjectiveFunctionExpressionEvaluator;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.opt4j.core.Objective;
import org.opt4j.core.Objectives;

import com.google.inject.Inject;

/**
 * Evaluates a solution against a single objective (as defined in the
 * allocation problem). That is, the archive will only contain
 * at most one solution.
 * 
 */
public class SingleObjectiveFunctionEvaluator extends AbstractObjectiveFunctionEvaluator {

	private Objective objective;
	
	@Inject
	public SingleObjectiveFunctionEvaluator(@NonNull AllocationProblem problem) {
		super(problem);
	}
	
	@NonNull
	private Objective getObjective() {
		if (objective == null) {
			Objective.Sign sign = Objective.Sign.MAX;
			ObjectiveGoal goal = getProblem().getILP()
					.getObjectiveFunction().getGoal();
			if (goal == ObjectiveGoal.MIN) {
				sign = Objective.Sign.MIN;
			}
			objective = new Objective("objectiveFunction", sign);
			System.out.println("new objective");
		}
		return objective;
	}
	
	@NonNull
	private Expression getObjectiveFunctionExpression() {
		Expression expression = getProblem().getILP()
				.getObjectiveFunction().getObjectiveFunction();
		if (expression == null) {
			LiteralExpression lit = CommonExpressionsFactory
					.eINSTANCE.createLiteralExpression();
			lit.setValue("1");
			expression = lit;
		}
		return expression;
	}

	@Override
	public Objectives evaluate(Map<String, Boolean> allocation) {
		double value = ObjectiveFunctionExpressionEvaluator.evaluate(
				getObjectiveFunctionExpression(),
				allocation);
		Objectives objectives = new Objectives();
		objectives.add(getObjective(), value);
		return objectives;
	}

}
