package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import java.util.Map;

import org.opt4j.core.Objective;
import org.opt4j.core.Objectives;
import org.opt4j.core.problem.Evaluator;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.evaluation.ObjectiveFunctionExpressionEvaluator;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveGoal;

public class ObjectiveFunctionEvaluator implements Evaluator<Map<String, Boolean>> {
	private AllocationProblem problem;
	private Objective objective;
	
	@Inject
	public ObjectiveFunctionEvaluator(AllocationProblem problem) {
		this.problem = problem;
	}
	
	private Objective getObjective() {
		if (objective == null) {
			Objective.Sign sign = Objective.Sign.MAX;
			ObjectiveGoal goal = problem.getILP()
					.getObjectiveFunction().getGoal();
			if (goal == ObjectiveGoal.MIN) {
				sign = Objective.Sign.MIN;
			}
			objective = new Objective("objectiveFunction", sign);
		}
		return objective;
	}
	
	private Expression getObjectiveFunctionExpression() {
		Expression expression = problem.getILP()
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
		System.out.println("evaluate: " + value);
		Objectives objectives = new Objectives();
		objectives.add(getObjective(), value);
		return objectives;
	}

}
