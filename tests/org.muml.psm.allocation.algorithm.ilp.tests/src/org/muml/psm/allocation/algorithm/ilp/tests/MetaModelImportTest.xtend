package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class MetaModelImportTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/metamodelImport/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "metamodelImport.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "metamodelImport.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.3",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
	
}