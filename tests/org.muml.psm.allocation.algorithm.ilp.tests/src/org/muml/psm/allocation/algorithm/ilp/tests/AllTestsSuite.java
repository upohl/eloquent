package org.muml.psm.allocation.algorithm.ilp.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.muml.psm.allocation.language.xtext.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	OclContext2ILPTest.class,
	ImplicationConstraint2ILPTest.class,
	ForbiddenLocationConstraint2ILPTest.class,
	SequencePart2ILPTest.class,
	UnorderedILPTest.class,
	FixedStructureILPComparatorTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setup() {
		LPSolveStandaloneSetup.doSetup();
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
	}
}