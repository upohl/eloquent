package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.evaluation;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.allocation.ilp.Variable;
import de.uni_paderborn.fujaba.muml.allocation.ilp.VariableExpression;
import java.util.Arrays;
import java.util.Map;

@SuppressWarnings("all")
public class ObjectiveFunctionExpressionEvaluator {
  public static class Environment {
    private final Map<String, Boolean> allocation;
    
    public Environment(final Map<String, Boolean> allocation) {
      this.allocation = allocation;
    }
    
    public double lookup(final Variable variable) {
      int _xblockexpression = (int) 0;
      {
        String _name = variable.getName();
        final Boolean value = this.allocation.get(_name);
        boolean _equals = Objects.equal(value, null);
        if (_equals) {
          String _name_1 = variable.getName();
          String _plus = ("env has no variable: " + _name_1);
          throw new IllegalArgumentException(_plus);
        }
        int _xifexpression = (int) 0;
        if ((value).booleanValue()) {
          _xifexpression = 1;
        } else {
          _xifexpression = 0;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
  }
  
  private final ObjectiveFunctionExpressionEvaluator.Environment environment;
  
  public ObjectiveFunctionExpressionEvaluator(final Map<String, Boolean> allocation) {
    ObjectiveFunctionExpressionEvaluator.Environment _environment = new ObjectiveFunctionExpressionEvaluator.Environment(allocation);
    this.environment = _environment;
  }
  
  public static double evaluate(final /* Expression */Object expression, final Map<String, Boolean> allocation) {
    ObjectiveFunctionExpressionEvaluator _objectiveFunctionExpressionEvaluator = new ObjectiveFunctionExpressionEvaluator(allocation);
    return _objectiveFunctionExpressionEvaluator.evaluate(expression);
  }
  
  public double _evaluate(final /* Expression */Object expression) {
    String _plus = ("unsupported expression: " + expression);
    throw new IllegalArgumentException(_plus);
  }
  
  public double _evaluate(final /* ArithmeticExpression */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nleftExpression cannot be resolved"
      + "\nrightExpression cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\nTIMES cannot be resolved"
      + "\noperator cannot be resolved");
  }
  
  public double _evaluate(final /* LiteralExpression */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
  }
  
  public double _evaluate(final VariableExpression expression) {
    Variable _variable = expression.getVariable();
    return this.environment.lookup(_variable);
  }
  
  public double evaluate(final VariableExpression expression) {
    if (expression != null) {
      return _evaluate(expression);
    } else if (expression != null) {
      return _evaluate(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
