package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.google.common.annotations.Beta;

import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)

@SuiteClasses({
	Specification2ILPTestSuite.class,
	LPSolveBasedAlgorithmTest.class
})
public class AllTestsSuite {
	 @BeforeClass
	 public static void setUpClass() {      
		 AllocationSpecificationLanguageStandaloneSetup.doSetup();
		 LPSolveStandaloneSetup.doSetup();

	    }

}
