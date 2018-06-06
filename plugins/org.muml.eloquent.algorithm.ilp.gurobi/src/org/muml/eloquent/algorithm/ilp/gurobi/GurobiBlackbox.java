package org.muml.eloquent.algorithm.ilp.gurobi;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class GurobiBlackbox {
	
	@Operation(kind=Kind.HELPER)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		return Gurobi.solve(ilp, solution);
	}
	
}
