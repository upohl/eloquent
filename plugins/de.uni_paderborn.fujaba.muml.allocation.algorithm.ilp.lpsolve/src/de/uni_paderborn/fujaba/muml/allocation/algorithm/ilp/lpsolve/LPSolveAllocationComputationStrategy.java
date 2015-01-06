package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.lpsolve;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

/**
 * An ILP-based allocation computation strategy. The allocation problem
 * is transformed to an ILP, which is solved using the lpsolve binary.
 * The transformation and invocation of lpsolve is encapsulated by
 * an QVTo transformation.
 *
 */
public class LPSolveAllocationComputationStrategy extends
		QVToBasedAllocationComputationStrategy {
	
	private static final String transformationURI =
			"platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.lpsolve/transforms/LPSolveBasedAlgorithm.qvto";
	
	public LPSolveAllocationComputationStrategy() {
		super(transformationURI);
	}

}
