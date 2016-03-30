package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.opt4j.core.Objectives;
import org.opt4j.core.problem.Evaluator;

public abstract class AbstractObjectiveFunctionEvaluator implements Evaluator<Map<String, Boolean>> {
	
	private AllocationProblem problem;
	
	public AbstractObjectiveFunctionEvaluator(@NonNull AllocationProblem problem) {
		this.problem = problem;
	}
	
	@NonNull
	public AllocationProblem getProblem() {
		return problem;
	}

	@Override
	public abstract Objectives evaluate(Map<String, Boolean> phenotype);

}
