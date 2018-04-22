package org.muml.psm.allocation.algorithm.ilp.export;

import com.google.common.base.Objects;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.psm.allocation.ilp.ArithmeticExpression;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.Expression;
import org.muml.psm.allocation.ilp.ILPDataType;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.LiteralExpression;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.muml.psm.allocation.ilp.Operator;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;

@SuppressWarnings("all")
public class LPM2T {
  private final static String illegalExpression = "unexpected Expression: %s";
  
  private final static String illegalILPDataType = "unexpected ILP Data Type: %s";
  
  private OutputStream out;
  
  private OutputStream fileOut;
  
  public File myFile;
  
  private long startTime1;
  
  private Double finalTime;
  
  private Status logTransformationTime;
  
  public Double getFinalTime() {
    return this.finalTime;
  }
  
  protected void emit(final String data) {
    try {
      InputOutput.<String>print(data);
      this.fileOut.write(data.getBytes());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void serialize(final IntegerLinearProgram ilp, final String path) {
    try {
      File _file = new File((path + "\\ilp2.lp"));
      File _myFile = this.myFile = _file;
      FileOutputStream _fileOutputStream = new FileOutputStream(_myFile);
      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(_fileOutputStream);
      this.fileOut = _bufferedOutputStream;
      ObjectiveFunctionExpression _objectiveFunction = ilp.getObjectiveFunction();
      boolean _notEquals = (!Objects.equal(_objectiveFunction, null));
      if (_notEquals) {
        this.emitObjectiveFunction(ilp.getObjectiveFunction());
      }
      EList<ConstraintExpression> _constraints = ilp.getConstraints();
      for (final ConstraintExpression expression : _constraints) {
        this.emitExpression(expression);
      }
      EList<Variable> _variables = ilp.getVariables();
      for (final Variable variable : _variables) {
        this.emitVariable(variable);
      }
      this.fileOut.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected void emitObjectiveFunction(final ObjectiveFunctionExpression objectiveFunctionExpression) {
    ObjectiveGoal _goal = objectiveFunctionExpression.getGoal();
    boolean _equals = Objects.equal(_goal, ObjectiveGoal.MAX);
    if (_equals) {
      this.emit("max: ");
    } else {
      this.emit("min: ");
    }
    this.emitExpression(objectiveFunctionExpression.getObjectiveFunction());
    this.emit(";\n");
  }
  
  protected void bail(final Expression expression) {
    String _format = String.format(LPM2T.illegalExpression, expression);
    throw new IllegalArgumentException(_format);
  }
  
  protected void bail(final ILPDataType ilpDataType) {
    String _format = String.format(LPM2T.illegalILPDataType, ilpDataType);
    throw new IllegalArgumentException(_format);
  }
  
  protected void _emitExpression(final Expression expression) {
    this.bail(expression);
  }
  
  protected void _emitExpression(final ArithmeticExpression expression) {
    this.emitExpression(expression.getLeftExpression());
    Operator _operator = expression.getOperator();
    boolean _equals = Objects.equal(_operator, Operator.PLUS);
    if (_equals) {
      this.emit(" + ");
    } else {
      Operator _operator_1 = expression.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, Operator.MINUS);
      if (_equals_1) {
        this.emit(" - ");
      } else {
        Operator _operator_2 = expression.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, Operator.TIMES);
        if (_equals_2) {
          this.emit("*");
        } else {
          this.bail(expression);
        }
      }
    }
    this.emitExpression(expression.getRightExpression());
  }
  
  protected void _emitExpression(final LiteralExpression expression) {
    this.emit(expression.getValue());
  }
  
  protected void _emitExpression(final VariableExpression expression) {
    this.emit(expression.getVariable().getName());
  }
  
  protected void _emitExpression(final ConstraintExpression expression) {
    if ((((!Objects.equal(expression.getComment(), IlpPackage.Literals.EXPRESSION__COMMENT.getDefaultValue())) && (!Objects.equal(expression.getComment(), null))) && (!"".equals(expression.getComment())))) {
      this.emit(expression.getComment());
      this.emit(": ");
    }
    this.emitExpression(expression.getLeftExpression());
    Operator _operator = expression.getOperator();
    boolean _equals = Objects.equal(_operator, Operator.LESS_THAN_OR_EQUAL_TO);
    if (_equals) {
      this.emit(" <= ");
    } else {
      Operator _operator_1 = expression.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, Operator.GREATER_THAN_OR_EQUAL_TO);
      if (_equals_1) {
        this.emit(" >= ");
      } else {
        Operator _operator_2 = expression.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, Operator.EQUAL_TO);
        if (_equals_2) {
          this.emit(" = ");
        } else {
          this.bail(expression);
        }
      }
    }
    this.emitExpression(expression.getRightExpression());
    this.emit(";\n");
  }
  
  protected void emitVariable(final Variable variable) {
    ILPDataType _dataType = variable.getDataType();
    boolean _notEquals = (!Objects.equal(_dataType, ILPDataType.BINARY));
    if (_notEquals) {
      this.bail(variable.getDataType());
    }
    String _name = variable.getName();
    String _plus = ("bin " + _name);
    String _plus_1 = (_plus + ";\n");
    this.emit(_plus_1);
  }
  
  protected void emitExpression(final Expression expression) {
    if (expression instanceof ArithmeticExpression) {
      _emitExpression((ArithmeticExpression)expression);
      return;
    } else if (expression instanceof ConstraintExpression) {
      _emitExpression((ConstraintExpression)expression);
      return;
    } else if (expression instanceof LiteralExpression) {
      _emitExpression((LiteralExpression)expression);
      return;
    } else if (expression instanceof VariableExpression) {
      _emitExpression((VariableExpression)expression);
      return;
    } else if (expression != null) {
      _emitExpression(expression);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
