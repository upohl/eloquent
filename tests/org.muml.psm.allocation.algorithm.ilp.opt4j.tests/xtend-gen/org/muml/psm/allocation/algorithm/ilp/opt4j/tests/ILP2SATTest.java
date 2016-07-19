package org.muml.psm.allocation.algorithm.ilp.opt4j.tests;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;
import org.junit.Test;
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILP2SAT;
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILPPreorderTraversal;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.Variable;
import org.opt4j.satdecoding.Constraint;
import org.opt4j.satdecoding.Literal;
import org.opt4j.satdecoding.Term;

@SuppressWarnings("all")
public class ILP2SATTest {
  private final String uri = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j.tests/fixtures/ilp2sat/";
  
  @Test
  public void testSingleConstraint() {
    final String uri = (this.uri + "singleConstraint.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(1, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    final Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(3, _size_1);
    Term term = constraint.get(0);
    EList<Variable> _variables = ilp.getVariables();
    Variable _get = _variables.get(0);
    Literal _literal = term.getLiteral();
    Object _variable = _literal.variable();
    Assert.assertEquals(_get, _variable);
    int _coefficient = term.getCoefficient();
    Assert.assertEquals(2, _coefficient);
    Term _get_1 = constraint.get(1);
    term = _get_1;
    EList<Variable> _variables_1 = ilp.getVariables();
    Variable _get_2 = _variables_1.get(1);
    Literal _literal_1 = term.getLiteral();
    Object _variable_1 = _literal_1.variable();
    Assert.assertEquals(_get_2, _variable_1);
    int _coefficient_1 = term.getCoefficient();
    Assert.assertEquals(3, _coefficient_1);
    Term _get_3 = constraint.get(2);
    term = _get_3;
    EList<Variable> _variables_2 = ilp.getVariables();
    Variable _get_4 = _variables_2.get(2);
    Literal _literal_2 = term.getLiteral();
    Object _variable_2 = _literal_2.variable();
    Assert.assertEquals(_get_4, _variable_2);
    int _coefficient_2 = term.getCoefficient();
    Assert.assertEquals(1, _coefficient_2);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(40, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.LE, _operator);
  }
  
  @Test
  public void testSingleConstraintFloatInt() {
    final String uri = (this.uri + "singleConstraintFloatInt.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(1, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    final Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(3, _size_1);
    Term term = constraint.get(0);
    EList<Variable> _variables = ilp.getVariables();
    Variable _get = _variables.get(0);
    Literal _literal = term.getLiteral();
    Object _variable = _literal.variable();
    Assert.assertEquals(_get, _variable);
    int _coefficient = term.getCoefficient();
    Assert.assertEquals(2, _coefficient);
    Term _get_1 = constraint.get(1);
    term = _get_1;
    EList<Variable> _variables_1 = ilp.getVariables();
    Variable _get_2 = _variables_1.get(1);
    Literal _literal_1 = term.getLiteral();
    Object _variable_1 = _literal_1.variable();
    Assert.assertEquals(_get_2, _variable_1);
    int _coefficient_1 = term.getCoefficient();
    Assert.assertEquals(3, _coefficient_1);
    Term _get_3 = constraint.get(2);
    term = _get_3;
    EList<Variable> _variables_2 = ilp.getVariables();
    Variable _get_4 = _variables_2.get(2);
    Literal _literal_2 = term.getLiteral();
    Object _variable_2 = _literal_2.variable();
    Assert.assertEquals(_get_4, _variable_2);
    int _coefficient_2 = term.getCoefficient();
    Assert.assertEquals(1, _coefficient_2);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(40, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.LE, _operator);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSingleConstraintFloatUnsupported() {
    final String uri = (this.uri + "singleConstraintFloatUnsupported.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
  }
  
  @Test
  public void testTwoConstraints() {
    final String uri = (this.uri + "twoConstraints.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(2, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(4, _size_1);
    Term term = constraint.get(0);
    EList<Variable> _variables = ilp.getVariables();
    Variable _get = _variables.get(0);
    Literal _literal = term.getLiteral();
    Object _variable = _literal.variable();
    Assert.assertEquals(_get, _variable);
    int _coefficient = term.getCoefficient();
    Assert.assertEquals(1, _coefficient);
    Term _get_1 = constraint.get(1);
    term = _get_1;
    EList<Variable> _variables_1 = ilp.getVariables();
    Variable _get_2 = _variables_1.get(1);
    Literal _literal_1 = term.getLiteral();
    Object _variable_1 = _literal_1.variable();
    Assert.assertEquals(_get_2, _variable_1);
    int _coefficient_1 = term.getCoefficient();
    Assert.assertEquals(2, _coefficient_1);
    Term _get_3 = constraint.get(2);
    term = _get_3;
    EList<Variable> _variables_2 = ilp.getVariables();
    Variable _get_4 = _variables_2.get(1);
    Literal _literal_2 = term.getLiteral();
    Object _variable_2 = _literal_2.variable();
    Assert.assertEquals(_get_4, _variable_2);
    int _coefficient_2 = term.getCoefficient();
    Assert.assertEquals(1, _coefficient_2);
    Term _get_5 = constraint.get(3);
    term = _get_5;
    EList<Variable> _variables_3 = ilp.getVariables();
    Variable _get_6 = _variables_3.get(2);
    Literal _literal_3 = term.getLiteral();
    Object _variable_3 = _literal_3.variable();
    Assert.assertEquals(_get_6, _variable_3);
    int _coefficient_3 = term.getCoefficient();
    Assert.assertEquals((-2), _coefficient_3);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(4, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.EQ, _operator);
    List<Constraint> _constraintList_2 = ilp2sat.getConstraintList();
    Constraint _get_7 = _constraintList_2.get(1);
    constraint = _get_7;
    int _size_2 = constraint.size();
    Assert.assertEquals(3, _size_2);
    Term _get_8 = constraint.get(0);
    term = _get_8;
    EList<Variable> _variables_4 = ilp.getVariables();
    Variable _get_9 = _variables_4.get(0);
    Literal _literal_4 = term.getLiteral();
    Object _variable_4 = _literal_4.variable();
    Assert.assertEquals(_get_9, _variable_4);
    int _coefficient_4 = term.getCoefficient();
    Assert.assertEquals(2, _coefficient_4);
    Term _get_10 = constraint.get(1);
    term = _get_10;
    EList<Variable> _variables_5 = ilp.getVariables();
    Variable _get_11 = _variables_5.get(1);
    Literal _literal_5 = term.getLiteral();
    Object _variable_5 = _literal_5.variable();
    Assert.assertEquals(_get_11, _variable_5);
    int _coefficient_5 = term.getCoefficient();
    Assert.assertEquals(3, _coefficient_5);
    Term _get_12 = constraint.get(2);
    term = _get_12;
    EList<Variable> _variables_6 = ilp.getVariables();
    Variable _get_13 = _variables_6.get(2);
    Literal _literal_6 = term.getLiteral();
    Object _variable_6 = _literal_6.variable();
    Assert.assertEquals(_get_13, _variable_6);
    int _coefficient_6 = term.getCoefficient();
    Assert.assertEquals(1, _coefficient_6);
    int _rhs_1 = constraint.getRhs();
    Assert.assertEquals(40, _rhs_1);
    Constraint.Operator _operator_1 = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.LE, _operator_1);
  }
  
  @Test
  public void testRHSVariables() {
    final String uri = (this.uri + "rhsVariables.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(1, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    final Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(5, _size_1);
    Term term = constraint.get(0);
    EList<Variable> _variables = ilp.getVariables();
    Variable _get = _variables.get(0);
    Literal _literal = term.getLiteral();
    Object _variable = _literal.variable();
    Assert.assertEquals(_get, _variable);
    int _coefficient = term.getCoefficient();
    Assert.assertEquals(2, _coefficient);
    Term _get_1 = constraint.get(1);
    term = _get_1;
    EList<Variable> _variables_1 = ilp.getVariables();
    Variable _get_2 = _variables_1.get(1);
    Literal _literal_1 = term.getLiteral();
    Object _variable_1 = _literal_1.variable();
    Assert.assertEquals(_get_2, _variable_1);
    int _coefficient_1 = term.getCoefficient();
    Assert.assertEquals(3, _coefficient_1);
    Term _get_3 = constraint.get(2);
    term = _get_3;
    EList<Variable> _variables_2 = ilp.getVariables();
    Variable _get_4 = _variables_2.get(2);
    Literal _literal_2 = term.getLiteral();
    Object _variable_2 = _literal_2.variable();
    Assert.assertEquals(_get_4, _variable_2);
    int _coefficient_2 = term.getCoefficient();
    Assert.assertEquals(1, _coefficient_2);
    Term _get_5 = constraint.get(3);
    term = _get_5;
    EList<Variable> _variables_3 = ilp.getVariables();
    Variable _get_6 = _variables_3.get(0);
    Literal _literal_3 = term.getLiteral();
    Object _variable_3 = _literal_3.variable();
    Assert.assertEquals(_get_6, _variable_3);
    int _coefficient_3 = term.getCoefficient();
    Assert.assertEquals((-4), _coefficient_3);
    Term _get_7 = constraint.get(4);
    term = _get_7;
    EList<Variable> _variables_4 = ilp.getVariables();
    Variable _get_8 = _variables_4.get(2);
    Literal _literal_4 = term.getLiteral();
    Object _variable_4 = _literal_4.variable();
    Assert.assertEquals(_get_8, _variable_4);
    int _coefficient_4 = term.getCoefficient();
    Assert.assertEquals(3, _coefficient_4);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(36, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.LE, _operator);
  }
  
  @Test
  public void testSingleVariable() {
    final String uri = (this.uri + "singleVariable.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(1, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    final Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(1, _size_1);
    final Term term = constraint.get(0);
    EList<Variable> _variables = ilp.getVariables();
    Variable _get = _variables.get(0);
    Literal _literal = term.getLiteral();
    Object _variable = _literal.variable();
    Assert.assertEquals(_get, _variable);
    int _coefficient = term.getCoefficient();
    Assert.assertEquals(1, _coefficient);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(1, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.EQ, _operator);
  }
  
  @Test
  public void testSingleLiteral() {
    final String uri = (this.uri + "singleLiteral.lp");
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(uri);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    final ILP2SAT ilp2sat = new ILP2SAT();
    ILPPreorderTraversal.traverse(ilp, ilp2sat);
    List<Constraint> _constraintList = ilp2sat.getConstraintList();
    int _size = _constraintList.size();
    Assert.assertEquals(1, _size);
    List<Constraint> _constraintList_1 = ilp2sat.getConstraintList();
    final Constraint constraint = _constraintList_1.get(0);
    int _size_1 = constraint.size();
    Assert.assertEquals(0, _size_1);
    int _rhs = constraint.getRhs();
    Assert.assertEquals(0, _rhs);
    Constraint.Operator _operator = constraint.getOperator();
    Assert.assertEquals(Constraint.Operator.EQ, _operator);
  }
}
