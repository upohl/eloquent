package org.muml.eloquent.algorithm.ilp.gurobi;

import org.muml.psm.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

/**
 * An allocation computation strategy that uses the gurobi solver.
 * More precisely, it uses the gurobi_cl binary.
 *
 */
public class GurobiAllocationComputationStrategy extends QVToBasedAllocationComputationStrategy<Object> {
	
	private static final String transformationURI =
			"platform:/plugin/org.muml.eloquent.algorithm.ilp.gurobi/transforms/GurobiBasedAlgorithm.qvto";
	
	public GurobiAllocationComputationStrategy() {
		super(transformationURI);
	}

}
