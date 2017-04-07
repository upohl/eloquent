package org.muml.psm.allocation.algorithm.ilp.opt4j.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	ObjectiveFunctionExpressionEvaluatorTest.class,
	ILP2SATTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setup() {
		LPSolveStandaloneSetup.doSetup();
	}
}