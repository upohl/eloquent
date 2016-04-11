package org.muml.psm.allocation.algorithm.ilp.opt4j.tests

import java.util.Collection
import java.util.Map
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.ilp.opt4j.evaluation.ObjectiveFunctionExpressionEvaluator
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner
import org.muml.psm.allocation.ilp.IntegerLinearProgram

import static org.junit.Assert.*

@RunWith(value = typeof(Parameterized))
class ObjectiveFunctionExpressionEvaluatorTest {

	static val uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j.tests/fixtures/evaluation/"
	
	val String ilpURI
	val Map<String, Boolean> allocation
	val double expected
	
	new(String ilpURI, Map<String, Boolean> allocation, double expected) {
		this.ilpURI = ilpURI
		this.allocation = allocation
		this.expected = expected
	}
	
	@Test
	public def test() {
		val ilp = QVToTransformationRunner.Util.loadURI(ilpURI) as IntegerLinearProgram
		val actual = ObjectiveFunctionExpressionEvaluator.evaluate(
			ilp.objectiveFunction.objectiveFunction,
			allocation
		)
		// we are dealing with integers => no delta
		assertEquals(expected, actual, 0)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		newArrayList(
			#[
				uriPrefix + "singleLiteral.lp",
				#{"x" -> true, "y" -> false, "z" -> true},
				2
			],
			#[
				uriPrefix + "twoLiterals.lp",
				#{"x" -> true, "y" -> false, "z" -> true},
				42
			],
			#[
				uriPrefix + "singleVariable.lp",
				#{"x" -> true, "y" -> false, "z" -> true},
				1
			],
			#[
				uriPrefix + "singleVariable.lp",
				#{"x" -> false, "y" -> false, "z" -> true},
				0
			],
			#[
				uriPrefix + "singleVariable.lp",
				#{"x" -> true, "y" -> false, "z" -> true},
				1
			],
			#[
				uriPrefix + "mix1.lp",
				#{"x" -> true, "y" -> true, "z" -> true},
				6
			],
			#[
				uriPrefix + "mix1.lp",
				#{"x" -> true, "y" -> false, "z" -> true},
				2
			],
			#[
				uriPrefix + "mix1.lp",
				#{"x" -> false, "y" -> false, "z" -> true},
				1
			]
		)
	}
	
}