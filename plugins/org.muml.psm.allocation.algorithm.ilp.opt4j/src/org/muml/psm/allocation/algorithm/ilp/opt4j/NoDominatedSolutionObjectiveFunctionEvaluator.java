package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.psm.allocation.ilp.Variable;
import org.opt4j.core.Objective;
import org.opt4j.core.Objectives;

import com.google.inject.Inject;

/**
 * Sets up the objectives in a way such that no solution is
 * (weakly) dominated by another solution. That is, each
 * solution is optimal. Note: the objective function, which
 * is defined in the allocation problem, is ignored.
 * 
 */
public class NoDominatedSolutionObjectiveFunctionEvaluator extends AbstractObjectiveFunctionEvaluator {
	
	private Map<String, Objective> variableObjectiveMap;

	@Inject
	public NoDominatedSolutionObjectiveFunctionEvaluator(@NonNull AllocationProblem problem) {
		super(problem);
	}
	
	private void initObjectives() {
		if (variableObjectiveMap == null) {
			variableObjectiveMap = new HashMap<String, Objective>();
			// note: it would be sufficient to only consider the x_{c_i,e_j}
			// variables instead of all variables
			for (Variable variable : getProblem().getILP().getVariables()) {
				variableObjectiveMap.put(variable.getName(),
						new Objective(variable.getName(), Objective.Sign.MIN));
			}
		}
	}

	@Override
	public Objectives evaluate(Map<String, Boolean> allocation) {
		Objectives objectives = new Objectives();
		initObjectives();
		for (String variableName : allocation.keySet()) {
			Objective objective = variableObjectiveMap.get(variableName);
			if (objective == null) {
				throw new IllegalStateException("solution is inconsistent with the ILP");
			}
			objectives.add(objective, allocation.get(variableName) ? 1.0 : 0.0);
		}
		return objectives;
	}

}
