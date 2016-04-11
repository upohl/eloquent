package org.muml.psm.allocation.algorithm.ilp.opt4j.tests

import org.junit.Test
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILP2SAT
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILPPreorderTraversal
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.opt4j.satdecoding.Constraint

import static org.junit.Assert.*

class ILP2SATTest {
	private val uri = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j.tests/fixtures/ilp2sat/" 
	
	@Test
	public def testSingleConstraint() {
		val uri = uri + "singleConstraint.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(1, ilp2sat.constraintList.size)
		val constraint = ilp2sat.constraintList.get(0)
		assertEquals(3, constraint.size)
		var term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(2, term.coefficient)
		term = constraint.get(1)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(3, term.coefficient)
		term = constraint.get(2)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(1, term.coefficient)
		// test rhs
		assertEquals(40, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.LE, constraint.operator)
	}
	
	@Test
	public def testSingleConstraintFloatInt() {
		// same as above (just a different fixture file)
		val uri = uri + "singleConstraintFloatInt.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(1, ilp2sat.constraintList.size)
		val constraint = ilp2sat.constraintList.get(0)
		assertEquals(3, constraint.size)
		var term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(2, term.coefficient)
		term = constraint.get(1)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(3, term.coefficient)
		term = constraint.get(2)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(1, term.coefficient)
		// test rhs
		assertEquals(40, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.LE, constraint.operator)
	}
	
	@Test(expected = typeof(IllegalArgumentException))
	public def testSingleConstraintFloatUnsupported() {
		// currently floating point coefficients are unsupported
		val uri = uri + "singleConstraintFloatUnsupported.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
	}
	
	@Test
	public def testTwoConstraints() {
		val uri = uri + "twoConstraints.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(2, ilp2sat.constraintList.size)
		//
		// test second constraint
		//
		var constraint = ilp2sat.constraintList.get(0)
		assertEquals(4, constraint.size)
		var term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(1, term.coefficient)
		term = constraint.get(1)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(2, term.coefficient)
		term = constraint.get(2)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(1, term.coefficient)
		term = constraint.get(3)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(-2, term.coefficient)
		// test rhs
		assertEquals(4, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.EQ, constraint.operator)
		//
		// test first constraint
		// similar to the first testcase
		//
		constraint = ilp2sat.constraintList.get(1)
		assertEquals(3, constraint.size)
		term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(2, term.coefficient)
		term = constraint.get(1)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(3, term.coefficient)
		term = constraint.get(2)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(1, term.coefficient)
		// test rhs
		assertEquals(40, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.LE, constraint.operator)
	}
	
	@Test
	public def testRHSVariables() {
		val uri = uri + "rhsVariables.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(1, ilp2sat.constraintList.size)
		// similar to the first testcase
		val constraint = ilp2sat.constraintList.get(0)
		assertEquals(5, constraint.size)
		var term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(2, term.coefficient)
		term = constraint.get(1)
		assertEquals(ilp.variables.get(1), term.literal.variable)
		assertEquals(3, term.coefficient)
		term = constraint.get(2)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(1, term.coefficient)
		term = constraint.get(3)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(-4, term.coefficient)
		term = constraint.get(4)
		assertEquals(ilp.variables.get(2), term.literal.variable)
		assertEquals(3, term.coefficient)
		// test rhs
		assertEquals(36, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.LE, constraint.operator)
	}
	
	@Test
	public def testSingleVariable() {
		val uri = uri + "singleVariable.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(1, ilp2sat.constraintList.size)
		val constraint = ilp2sat.constraintList.get(0)
		assertEquals(1, constraint.size)
		val term = constraint.get(0)
		assertEquals(ilp.variables.get(0), term.literal.variable)
		assertEquals(1, term.coefficient)
		// test rhs
		assertEquals(1, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.EQ, constraint.operator)
	}
	
	@Test
	public def testSingleLiteral() {
		val uri = uri + "singleLiteral.lp"
		val ilp = QVToTransformationRunner.Util.loadURI(uri) as IntegerLinearProgram
		val ilp2sat = new ILP2SAT()
		ILPPreorderTraversal.traverse(ilp, ilp2sat)
		assertEquals(1, ilp2sat.constraintList.size)
		val constraint = ilp2sat.constraintList.get(0)
		assertEquals(0, constraint.size)
		// test rhs
		assertEquals(0, constraint.rhs)
		// test constraint operator
		assertEquals(Constraint.Operator.EQ, constraint.operator)
	}
}