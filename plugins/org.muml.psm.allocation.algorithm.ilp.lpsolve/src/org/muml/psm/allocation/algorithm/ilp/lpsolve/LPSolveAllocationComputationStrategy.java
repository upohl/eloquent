package org.muml.psm.allocation.algorithm.ilp.lpsolve;

import org.muml.psm.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

/**
 * An ILP-based allocation computation strategy. The allocation problem
 * is transformed to an ILP, which is solved using the lpsolve binary.
 * The transformation and invocation of lpsolve is encapsulated by
 * an QVTo transformation.
 *
 */
public class LPSolveAllocationComputationStrategy extends
		QVToBasedAllocationComputationStrategy<Object> {
	
	private static final String transformationURI =
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.lpsolve/transforms/LPSolveBasedAlgorithm.qvto";
	
	public LPSolveAllocationComputationStrategy() {
		super(transformationURI);
	}

}
