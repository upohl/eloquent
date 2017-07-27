package org.muml.eloquent.algorithm.ilp.neos.cplex;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class CPLEXBlackbox {
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution,
			CPLEXConfiguration configuration) {
		return CPLEX.solve(ilp, solution, configuration);
	}
}
