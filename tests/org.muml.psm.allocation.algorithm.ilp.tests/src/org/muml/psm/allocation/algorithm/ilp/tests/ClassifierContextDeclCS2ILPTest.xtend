package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class ClassifierContextDeclCS2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/classifierContextDeclCS/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "simple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// adds operations to the OCLContext class
				#[RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "oclcontextSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "oclcontextDifferentLocation.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "oclcontextDifferentLocation.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}