package org.muml.eloquent.ocl.vql.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org_muml_eloquent_ocl_vql_tests_fixtures.RootCompletePackagesNameClashTest;

@RunWith(Suite.class)
@SuiteClasses({
	VQLEvaluationTest.class,
	RootCompletePackagesNameClashTest.class
})
public class AllTestsSuite {

}
