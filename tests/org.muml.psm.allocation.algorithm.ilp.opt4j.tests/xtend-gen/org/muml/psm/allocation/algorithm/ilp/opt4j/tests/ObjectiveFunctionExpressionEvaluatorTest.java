package org.muml.psm.allocation.algorithm.ilp.opt4j.tests;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.core.expressions.Expression;
import org.muml.psm.allocation.algorithm.ilp.opt4j.evaluation.ObjectiveFunctionExpressionEvaluator;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class ObjectiveFunctionExpressionEvaluatorTest {
  private final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j.tests/fixtures/evaluation/";
  
  private final String ilpURI;
  
  private final Map<String, Boolean> allocation;
  
  private final double expected;
  
  public ObjectiveFunctionExpressionEvaluatorTest(final String ilpURI, final Map<String, Boolean> allocation, final double expected) {
    this.ilpURI = ilpURI;
    this.allocation = allocation;
    this.expected = expected;
  }
  
  @Test
  public void test() {
    EObject _loadURI = QVToTransformationRunner.Util.loadURI(this.ilpURI);
    final IntegerLinearProgram ilp = ((IntegerLinearProgram) _loadURI);
    ObjectiveFunctionExpression _objectiveFunction = ilp.getObjectiveFunction();
    Expression _objectiveFunction_1 = _objectiveFunction.getObjectiveFunction();
    final double actual = ObjectiveFunctionExpressionEvaluator.evaluate(_objectiveFunction_1, 
      this.allocation);
    Assert.assertEquals(this.expected, actual, 0);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    Pair<String, Boolean> _mappedTo = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_1 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_2 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_3 = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_4 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_5 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_6 = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_7 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_8 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_9 = Pair.<String, Boolean>of("x", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_10 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_11 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_12 = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_13 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_14 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_15 = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_16 = Pair.<String, Boolean>of("y", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_17 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_18 = Pair.<String, Boolean>of("x", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_19 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_20 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    Pair<String, Boolean> _mappedTo_21 = Pair.<String, Boolean>of("x", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_22 = Pair.<String, Boolean>of("y", Boolean.valueOf(false));
    Pair<String, Boolean> _mappedTo_23 = Pair.<String, Boolean>of("z", Boolean.valueOf(true));
    return CollectionLiterals.<Object[]>newArrayList(
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "singleLiteral.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)), Integer.valueOf(2))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "twoLiterals.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5)), Integer.valueOf(42))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "singleVariable.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_6, _mappedTo_7, _mappedTo_8)), Integer.valueOf(1))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "singleVariable.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_9, _mappedTo_10, _mappedTo_11)), Integer.valueOf(0))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "singleVariable.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_12, _mappedTo_13, _mappedTo_14)), Integer.valueOf(1))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "mix1.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_15, _mappedTo_16, _mappedTo_17)), Integer.valueOf(6))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "mix1.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_18, _mappedTo_19, _mappedTo_20)), Integer.valueOf(2))), Object.class)), 
      ((Object[])Conversions.unwrapArray(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList((ObjectiveFunctionExpressionEvaluatorTest.uriPrefix + "mix1.lp"), Collections.<String, Boolean>unmodifiableMap(CollectionLiterals.<String, Boolean>newHashMap(_mappedTo_21, _mappedTo_22, _mappedTo_23)), Integer.valueOf(1))), Object.class)));
  }
}
