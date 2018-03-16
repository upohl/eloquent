package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class ImplicationConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/implicationConstraint/model/"
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/implicationConstraint/"
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
			// single premise
			#[success,
			  uriPrefix + "singlePremise.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "singlePremise.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// single premise single conclusion
			#[success,
			  uriPrefix + "singlePremiseSingleConclusion.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "singlePremiseSingleConclusion.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// multi premise single conclusion
			#[success,
			  uriPrefix + "multiPremiseSingleConclusion.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "multiPremiseSingleConclusion.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// multi premise multi conclusion
			#[success,
			  uriPrefix + "multiPremiseMultiConclusion.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "multiPremiseMultiConclusion.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// mix various cases (also choose different premise/conclusion IDs)
			#[success,
			  uriPrefix + "mixed.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "mixed.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// two typed pairs in the conclusion
			#[success,
			  uriPrefix + "twoTypedPairs.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "twoTypedPairs.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// multiple constraints
			#[success, uriPrefix + "multipleConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "multipleConstraints.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// empty premise
			#[success,
			  uriPrefix + "emptyPremise.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "emptyPremise.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// an empty conclusion makes no sense (results in a
			// fatal transformation error)
			#[new ExpectedTransformationStatus(ExecutionDiagnostic.FATAL_ASSERTION, "empty conclusion"),
	          null,
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "emptyConclusion.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"],
			// order of generated constraints
			#[success,
			  uriPrefix + "order.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "order.allocation_specification",
			  modelsDirectory + "implicationConstraint.ecore"]
		]
	}
		
}