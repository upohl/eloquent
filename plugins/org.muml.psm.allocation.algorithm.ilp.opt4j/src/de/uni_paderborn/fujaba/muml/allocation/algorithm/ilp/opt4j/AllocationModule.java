package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import org.opt4j.core.problem.ProblemModule;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

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
