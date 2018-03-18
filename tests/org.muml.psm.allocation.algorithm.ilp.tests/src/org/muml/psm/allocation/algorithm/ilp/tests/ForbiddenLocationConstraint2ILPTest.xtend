package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class ForbiddenLocationConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
	// reuse model from the implication constraint tests
	public static final String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/implicationConstraint/model/"
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/forbiddenLocationConstraint/"
	private static final ExpectedTransformationStatus success = new ExpectedTransformationStatus();
	
	new(ExpectedTransformationStatus expectedTransformationStatus, String expectedURI,
		String transformationURI, String aslURI, String oclContextURI
	) {
		super(expectedTransformationStatus, expectedURI as Object, transformationURI,
			aslURI, oclContextURI
		)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			// simple
			#[success,
			  uriPrefix + "simple.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "simple.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// multiple tuple descriptors and order
			#[success,
			  uriPrefix + "multipleDescriptorsAndOrder.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "multipleDescriptorsAndOrder.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// multiple constraints
			#[success,
			  uriPrefix + "multipleConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "multipleConstraints.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// empty set (for now, we do not treat it as an error)
			#[success,
			  uriPrefix + "emptySet.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "emptySet.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// illegal relation (result in a transformation error)
			#[new ExpectedTransformationStatus(ExecutionDiagnostic.FATAL_ASSERTION, "illegal sequence"),
			  null,
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "illegalRelation.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"]
		]
	}
	
}