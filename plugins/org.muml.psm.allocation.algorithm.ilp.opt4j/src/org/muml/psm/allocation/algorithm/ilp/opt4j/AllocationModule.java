package org.muml.psm.allocation.algorithm.ilp.opt4j;

import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.opt4j.core.problem.ProblemModule;

public class AllocationModule extends ProblemModule {
	
	private IntegerLinearProgram ilp;
	private boolean noDominatedSolutions;
	
	public AllocationModule(IntegerLinearProgram ilp, boolean noDominatedSolutions) {
		super();
		this.ilp = ilp;
		this.noDominatedSolutions = noDominatedSolutions;
	}

	@Override
	protected void config() {
		bind(IntegerLinearProgram.class).toInstance(ilp);
		bind(AllocationProblem.class).to(ConcreteAllocationProblem.class);
		bindProblem(AllocationSATCreatorDecoder.class,
				AllocationSATCreatorDecoder.class,
				noDominatedSolutions ? NoDominatedSolutionObjectiveFunctionEvaluator.class
						: SingleObjectiveFunctionEvaluator.class);
	}

}
