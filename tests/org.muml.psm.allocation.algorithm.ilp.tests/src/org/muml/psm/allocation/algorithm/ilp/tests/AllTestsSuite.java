package org.muml.psm.allocation.algorithm.ilp.tests;

import org.eclipse.emf.common.EMFPlugin;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.muml.psm.allocation.language.xtext.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	OclContext2ILPTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setup() {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			LPSolveStandaloneSetup.doSetup();
			AllocationSpecificationLanguageStandaloneSetup.doSetup();
		}
	}
}