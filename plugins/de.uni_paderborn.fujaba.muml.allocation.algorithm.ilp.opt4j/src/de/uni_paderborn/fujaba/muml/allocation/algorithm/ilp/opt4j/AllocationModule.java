package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import org.opt4j.core.problem.ProblemModule;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

public class AllocationModule extends ProblemModule {
	
	public AllocationModule(IntegerLinearProgram ilp) {
		super();
		this.ilp = ilp;
	}
	
	private IntegerLinearProgram ilp;

	@Override
	protected void config() {
		bind(IntegerLinearProgram.class).toInstance(ilp);
		bind(AllocationProblem.class).to(ConcreteAllocationProblem.class);
		bindProblem(AllocationSATCreatorDecoder.class,
				AllocationSATCreatorDecoder.class,
				ObjectiveFunctionEvaluator.class);
	}

}
