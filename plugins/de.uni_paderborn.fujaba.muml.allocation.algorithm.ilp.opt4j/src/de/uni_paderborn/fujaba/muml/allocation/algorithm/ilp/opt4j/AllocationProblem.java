package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

public interface AllocationProblem {
	IntegerLinearProgram getILP();
}
