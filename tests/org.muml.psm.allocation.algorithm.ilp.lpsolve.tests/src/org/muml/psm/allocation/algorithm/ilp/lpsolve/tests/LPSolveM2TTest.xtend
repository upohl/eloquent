package org.muml.psm.allocation.algorithm.ilp.lpsolve.tests

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.Collection
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.ilp.lpsolve.LPSolveM2T
import org.muml.psm.allocation.algorithm.tests.util.ModelTestUtil
import org.muml.psm.allocation.ilp.IntegerLinearProgram

@RunWith(value = typeof(Parameterized))
class LPSolveM2TTest {
	private String filename;
	
	private static final String fixturesPrefix
			= "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/"
	private static final String noILPInstance = "Expected an ILP, got: %s"
	private static final String illegalResourceSize = "Expected 1 root object, got: %s"
	
	new(String filename) {
		this.filename = filename;
	}
	
	@Test
	def testSerialization() {
		val ResourceSet resSet = new ResourceSetImpl()
		val Resource origResource = resSet.getResource(
			URI.createURI(filename), true
		)
		val IntegerLinearProgram expectedILP = assertAndGetILP(origResource) 
		val LPSolveM2T m2t = new LPSolveM2T()
		val ByteArrayOutputStream os = new ByteArrayOutputStream()
		m2t.serialize(expectedILP, os)
		// load serialized ILP
		val ByteArrayInputStream in = new ByteArrayInputStream(os.toByteArray)
		val Resource resource = resSet.createResource(
			URI.createURI("dummy.lp")
		)
		resource.load(in, emptyMap)
		// make sure all proxies are resolved, otherwise EMFCompare
		// might report differences
		EcoreUtil.resolveAll(resSet)
		val IntegerLinearProgram actualILP = assertAndGetILP(resource)
		ModelTestUtil.assertModelEquals(expectedILP, actualILP)
	}
	
	def protected IntegerLinearProgram assertAndGetILP(Resource resource) {
		val int actualSize = resource.contents.size
		Assert.assertEquals(String.format(illegalResourceSize, actualSize),
			1, actualSize
		)
		val EObject eObject = resource.contents.get(0)
		Assert.assertTrue(String.format(noILPInstance, eObject),
			eObject instanceof IntegerLinearProgram
		)
		eObject as IntegerLinearProgram
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		/* we should update this list from time to time... (we do not generate
		 * this list dynamically during the testcase execution, because
		 * a) the code should be simple (no eclipse bundle reading etc., please)
		 * b) in case of a testcase failure, one can immediately identify the
		 *    failing fixture file
		 * c) (personal reason) sometimes, I have some broken *.lp files
		 *    lingering around in these directories, which should be ignored
		 *    (of course) 
		 */
		#[
			#[fixturesPrefix + "forbiddenLocationConstraint/emptySet.lp"],
			#[fixturesPrefix + "forbiddenLocationConstraint/multipleConstraints.lp"],
			#[fixturesPrefix + "forbiddenLocationConstraint/multipleDescriptorsAndOrder.lp"],
			#[fixturesPrefix + "forbiddenLocationConstraint/simple.lp"],
			#[fixturesPrefix + "implicationConstraint/emptyPremise.lp"],
			#[fixturesPrefix + "implicationConstraint/mixed.lp"],
			#[fixturesPrefix + "implicationConstraint/multipleConstraints.lp"],
			#[fixturesPrefix + "implicationConstraint/multiPremiseMultiConclusion.lp"],
			#[fixturesPrefix + "implicationConstraint/multiPremiseSingleConclusion.lp"],
			#[fixturesPrefix + "implicationConstraint/order.lp"],
			#[fixturesPrefix + "implicationConstraint/singlePremise.lp"],
			#[fixturesPrefix + "implicationConstraint/singlePremiseSingleConclusion.lp"],
			#[fixturesPrefix + "implicationConstraint/twoTypedPairs.lp"],
			#[fixturesPrefix + "oclContext/collocationConstraint_multipleRelations.lp"],
			#[fixturesPrefix + "oclContext/collocationConstraint_multipleRelationsMultipleCollocations.lp"],
			#[fixturesPrefix + "oclContext/collocationConstraint_singleInequality.lp"],
			#[fixturesPrefix + "oclContext/collocationConstraint_singleWithSemanticalDuplicates.lp"],
			#[fixturesPrefix + "oclContext/collocationConstraint_unnamedDuplicatedConstraints.lp"],
			#[fixturesPrefix + "oclContext/differentLocationConstraint_multipleRelations.lp"],
			#[fixturesPrefix + "oclContext/differentLocationConstraint_multipleRelationsMultipleConstraints.lp"],
			#[fixturesPrefix + "oclContext/differentLocationConstraint_singleEquality.lp"],
			#[fixturesPrefix + "oclContext/differentLocationConstraint_singleWithSemanticalDuplicates.lp"],
			#[fixturesPrefix + "oclContext/differentLocationConstraint_unnamedDuplicatedConstraints.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_allocation.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_allocationMultipleRelationsOrder.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_differentLowerUpper.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_minusOneUpper.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_multipleRelationsDifferentBounds.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_multipleRelationsWithBoundsAndDuplicates.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_noRelation.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_sameLowerUpper.lp"],
			#[fixturesPrefix + "oclContext/generalConstraint_unnamedRelationsWithDuplicates.lp"],
			#[fixturesPrefix + "sequencePart/locationConstraint.lp"],
			#[fixturesPrefix + "sequencePart/measureFunction.lp"],
			#[fixturesPrefix + "sequencePart/resourceConstraint.lp"]
		]
	}

}