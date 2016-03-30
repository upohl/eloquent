package org.muml.psm.allocation.algorithm.ilp.opt4j;

import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public interface AllocationProblem {
	IntegerLinearProgram getILP();
}
