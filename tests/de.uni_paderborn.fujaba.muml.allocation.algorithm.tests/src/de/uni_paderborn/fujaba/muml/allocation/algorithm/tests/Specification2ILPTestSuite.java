package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	GeneralConstraint2ILPTest.class,
	SameLocation2ILPTest.class,
	DifferentLocation2ILPTest.class,
	RequiredHardwareResourceInstance2ILPTest.class,
	ResourceConstraint2ILPTest.class,
	MeasureFunction2ILPTest.class,
	ClassifierContextDeclCS2ILPTest.class,
	MetaModelImportTest.class
})
public class Specification2ILPTestSuite {

}
