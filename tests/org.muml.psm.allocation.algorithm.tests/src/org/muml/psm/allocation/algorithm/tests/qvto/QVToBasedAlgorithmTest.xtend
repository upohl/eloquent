package org.muml.psm.allocation.algorithm.tests.qvto

import java.util.Collection
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

abstract class QVToBasedAlgorithmTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	protected def static Collection<Object[]> getTestData(String transformationURI) {
		TestDataUtil.createTestData(2,
				#[uriPrefix.concat("algorithmMain/simpleAllocation.allocation"),
				  transformationURI,
				  uriPrefix.concat("algorithmMain/simpleAllocation.allocation_specification"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.1/@modelElements.0"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC")],
				#[uriPrefix.concat("algorithmMain/nonexistentAllocation.allocation"),
				  transformationURI,
				  uriPrefix.concat("algorithmMain/nonexistentAllocation.allocation_specification"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.1/@modelElements.0"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC")],
				// simplified version of the M3 meeting's bug
				#[uriPrefix.concat("algorithmMain/sameLocationM3MeetingBug.allocation"),
				  transformationURI,
				  uriPrefix.concat("algorithmMain/sameLocationM3MeetingBug.allocation_specification"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.1/@modelElements.0"),
				  uriPrefix.concat("models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC")])
	}
}