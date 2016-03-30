package org.muml.psm.allocation.algorithm.ilp.opt4j;

import org.muml.psm.allocation.ilp.IntegerLinearProgram;

import com.google.inject.Inject;
import com.google.inject.Singleton;

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
