package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	GeneralConstraint2ILPTest.class,
	SameLocation2ILPTest.class,
	DifferentLocation2ILPTest.class,
	RequiredHardwareResourceInstance2ILPTest.class,
	ResourceConstraint2ILPTest.class,
	MeasureFunction2ILPTest.class,
	// XXX: deactivated for now
	// ClassifierContextDeclCS2ILPTest.class,
	MetaModelImportTest.class
})
public class Specification2ILPTestSuite {
	@BeforeClass
	public static void setUpClass() {      
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
		LPSolveStandaloneSetup.doSetup();
	}
}
