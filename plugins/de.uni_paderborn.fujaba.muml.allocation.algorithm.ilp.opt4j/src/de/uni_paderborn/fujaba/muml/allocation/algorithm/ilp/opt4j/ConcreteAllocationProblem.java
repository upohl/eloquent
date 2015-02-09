package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

@Singleton
public class ConcreteAllocationProblem implements AllocationProblem {
	private IntegerLinearProgram ilp;
	
	@Inject
	public ConcreteAllocationProblem(IntegerLinearProgram ilp) {
		this.ilp = ilp;
	}


	@Override
	public IntegerLinearProgram getILP() {
		return ilp;
	}

}
