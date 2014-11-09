package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class LPSolveBasedAlgorithmTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/algorithmMain/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "simpleAllocation.allocation",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/LPSolveBasedAlgorithm.qvto",
				  uriPrefix + "simpleAllocation.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "nonexistentAllocation.allocation",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/LPSolveBasedAlgorithm.qvto",
				  uriPrefix + "nonexistentAllocation.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// simplified version of the M3 meeting's bug
				#[uriPrefix + "sameLocationM3MeetingBug.allocation",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/LPSolveBasedAlgorithm.qvto",
				  uriPrefix + "sameLocationM3MeetingBug.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}