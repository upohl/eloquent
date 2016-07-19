package org.muml.psm.allocation.algorithm.ilp.opt4j.evaluation;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Map;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.ArithmeticExpression;
import org.muml.core.expressions.common.ArithmeticOperator;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;

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
  
  public static double evaluate(final Expression expression, final Map<String, Boolean> allocation) {
    ObjectiveFunctionExpressionEvaluator _objectiveFunctionExpressionEvaluator = new ObjectiveFunctionExpressionEvaluator(allocation);
    return _objectiveFunctionExpressionEvaluator.evaluate(expression);
  }
  
  public double _evaluate(final Expression expression) {
    throw new IllegalArgumentException(("unsupported expression: " + expression));
  }
  
  public double _evaluate(final ArithmeticExpression expression) {
    Expression _leftExpression = expression.getLeftExpression();
    final double left = this.evaluate(_leftExpression);
    Expression _rightExpression = expression.getRightExpression();
    final double right = this.evaluate(_rightExpression);
    double _switchResult = (double) 0;
    ArithmeticOperator _operator = expression.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case PLUS:
          _switchResult = (left + right);
          break;
        case TIMES:
          _switchResult = (left * right);
          break;
        default:
          ArithmeticOperator _operator_1 = expression.getOperator();
          String _plus = ("unexpected operator " + _operator_1);
          throw new IllegalArgumentException(_plus);
      }
    } else {
      ArithmeticOperator _operator_1 = expression.getOperator();
      String _plus = ("unexpected operator " + _operator_1);
      throw new IllegalArgumentException(_plus);
    }
    return _switchResult;
  }
  
  public double _evaluate(final LiteralExpression expression) {
    String _value = expression.getValue();
    return Double.parseDouble(_value);
  }
  
  public double _evaluate(final VariableExpression expression) {
    Variable _variable = expression.getVariable();
    return this.environment.lookup(_variable);
  }
  
  public double evaluate(final Expression expression) {
    if (expression instanceof ArithmeticExpression) {
      return _evaluate((ArithmeticExpression)expression);
    } else if (expression instanceof LiteralExpression) {
      return _evaluate((LiteralExpression)expression);
    } else if (expression instanceof VariableExpression) {
      return _evaluate((VariableExpression)expression);
    } else if (expression != null) {
      return _evaluate(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
