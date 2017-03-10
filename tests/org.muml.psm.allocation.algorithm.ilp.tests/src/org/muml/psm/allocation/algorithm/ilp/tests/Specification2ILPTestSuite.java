package org.muml.psm.allocation.algorithm.ilp.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.muml.psm.allocation.language.xtext.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	GeneralConstraint2ILPTest.class,
	SameLocation2ILPTest.class,
	DifferentLocation2ILPTest.class,
	RequiredHardwareResourceInstance2ILPTest.class,
	ResourceConstraint2ILPTest.class,
	MeasureFunction2ILPTest.class,
	ClassifierContextDeclCS2ILPTest.class,
	MetaModelImportTest.class,
	OclContext2ILPTest.class
})
public class Specification2ILPTestSuite {
	@BeforeClass
	public static void setUpClass() {
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
		LPSolveStandaloneSetup.doSetup();
	}
}