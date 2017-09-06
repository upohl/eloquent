package org.muml.eloquent.ocl.vql.tests;

import org.junit.Test;

public class VQLEvaluationTest extends VQLEvaluationTestBase {
	
	@Test
	public void unboundOperationTests() {
		check("unboundOperationTests.ocl", "model.ecore");
	}
	
	@Test
	public void boundOperationTests() {
		check("boundOperationTests.ocl", "model.ecore");
	}
	
	@Test
	public void patternInStaticOperationTests() {
		check("patternInStaticOperationTests.ocl", "model.ecore");
	}
	
	@Test
	public void multipleVQLIncludesTests() {
		check("multipleVQLIncludesTests.ocl", "model.ecore");
	}

}
