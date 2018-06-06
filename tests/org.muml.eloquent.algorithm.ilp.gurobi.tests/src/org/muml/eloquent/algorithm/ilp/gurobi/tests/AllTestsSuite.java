package org.muml.eloquent.algorithm.ilp.gurobi.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	LPM2TTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setup() {
		LPSolveStandaloneSetup.doSetup();
	}
}
