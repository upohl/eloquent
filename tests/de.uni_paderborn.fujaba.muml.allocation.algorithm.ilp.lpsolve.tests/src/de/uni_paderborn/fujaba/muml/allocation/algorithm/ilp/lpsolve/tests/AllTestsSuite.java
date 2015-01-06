package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.lpsolve.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	LPSolveBasedAlgorithmTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setUpClass() {      
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
		LPSolveStandaloneSetup.doSetup();
	}
}