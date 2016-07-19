package org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.ArithmeticExpression;
import org.muml.core.expressions.common.ArithmeticOperator;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.IVisitor;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;
import org.opt4j.satdecoding.Constraint;
import org.opt4j.satdecoding.Literal;

@SuppressWarnings("all")
public class ILP2SAT implements IVisitor {
  private enum State {
    CONSTRAINT_LHS,
    
    CONSTRAINT_RHS;
  }
  
  private final List<Constraint> constraintList;
  
  private final Stack<Expression> stack;
  
  private double accRHS;
  
  public List<Constraint> getConstraintList() {
    return this.constraintList;
  }
  
  private ILP2SAT.State state;
  
  public ILP2SAT() {
    ArrayList<Constraint> _newArrayList = CollectionLiterals.<Constraint>newArrayList();
    this.constraintList = _newArrayList;
    Stack<Expression> _stack = new Stack<Expression>();
    this.stack = _stack;
    this.accRHS = 0;
    this.state = null;
  }
  
  private void reduce() {
    this.stack.push(null);
    System.out.println(("reduce: " + this.stack));
    this.notEmpty();
    boolean canReduce = true;
    while ((canReduce && (!this.stack.empty()))) {
      {
        final Expression top = this.stack.pop();
        boolean _equals = Objects.equal(top, null);
        this.illegalStack(_equals, top);
        this.notEmpty();
        Expression _peek = this.stack.peek();
        boolean _equals_1 = Objects.equal(_peek, null);
        if (_equals_1) {
          this.stack.pop();
          this.expect(ArithmeticExpression.class);
          this.stack.pop();
          this.stack.push(null);
        } else {
          Expression _peek_1 = this.stack.peek();
          if ((_peek_1 instanceof ConstraintExpression)) {
            canReduce = false;
            this.postProcess();
          } else {
            this.expect(ArithmeticExpression.class);
            this.stack.push(top);
            canReduce = false;
          }
        }
      }
    }
  }
  
  private void postProcess() {
    boolean _equals = Objects.equal(this.state, ILP2SAT.State.CONSTRAINT_LHS);
    if (_equals) {
      this.state = ILP2SAT.State.CONSTRAINT_RHS;
    } else {
      boolean _equals_1 = Objects.equal(this.state, ILP2SAT.State.CONSTRAINT_RHS);
      if (_equals_1) {
        this.state = null;
        Constraint _head = IterableExtensions.<Constraint>head(this.constraintList);
        _head.setRhs(((int) this.accRHS));
        this.accRHS = 0;
        this.stack.pop();
      }
    }
    System.out.println(("postProcess: " + this.stack));
  }
  
  public void _visit(final ConstraintExpression expression) {
    System.out.println(expression);
    boolean _empty = this.stack.empty();
    boolean _not = (!_empty);
    if (_not) {
      throw new IllegalStateException("predecessor stack should be empty");
    }
    this.state = ILP2SAT.State.CONSTRAINT_LHS;
    this.stack.push(expression);
    Constraint _constraint = new Constraint();
    this.constraintList.add(0, _constraint);
    Constraint.Operator op = null;
    ComparingOperator _operator = expression.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case EQUAL:
          op = Constraint.Operator.EQ;
          break;
        case LESS_OR_EQUAL:
          op = Constraint.Operator.LE;
          break;
        case GREATER_OR_EQUAL:
          op = Constraint.Operator.GE;
          break;
        default:
          ComparingOperator _operator_1 = expression.getOperator();
          String _plus = ("unsupported operator: " + _operator_1);
          throw new IllegalArgumentException(_plus);
      }
    } else {
      ComparingOperator _operator_1 = expression.getOperator();
      String _plus = ("unsupported operator: " + _operator_1);
      throw new IllegalArgumentException(_plus);
    }
    Constraint _head = IterableExtensions.<Constraint>head(this.constraintList);
    _head.setOperator(op);
  }
  
  public void _visit(final LiteralExpression expression) {
    System.out.println(expression);
    this.expectOrNull(Expression.class);
    final Expression top = this.stack.peek();
    if ((top instanceof ArithmeticExpression)) {
      this.expectOperator(ArithmeticOperator.TIMES, ArithmeticOperator.PLUS);
      Expression _peek = this.stack.peek();
      final ArithmeticOperator operator = ((ArithmeticExpression) _peek).getOperator();
      boolean _equals = Objects.equal(operator, ArithmeticOperator.PLUS);
      if (_equals) {
        String _value = expression.getValue();
        double _parseDouble = Double.parseDouble(_value);
        this.accumulateRHS(_parseDouble);
        this.reduce();
      } else {
        this.stack.push(expression);
      }
    } else {
      if ((top instanceof VariableExpression)) {
        this.stack.pop();
        this.expectOperator(ArithmeticOperator.TIMES);
        this.stack.pop();
        this.addLiteral(((VariableExpression)top), expression);
        this.reduce();
      } else {
        if ((top instanceof ConstraintExpression)) {
          String _value_1 = expression.getValue();
          double _parseDouble_1 = Double.parseDouble(_value_1);
          this.accumulateRHS(_parseDouble_1);
          this.reduce();
        } else {
          boolean _equals_1 = Objects.equal(top, null);
          if (_equals_1) {
            String _value_2 = expression.getValue();
            double _parseDouble_2 = Double.parseDouble(_value_2);
            this.accumulateRHS(_parseDouble_2);
            this.reduce();
          } else {
            this.illegalStack();
          }
        }
      }
    }
  }
  
  private void accumulateRHS(final double value) {
    boolean _equals = Objects.equal(this.state, ILP2SAT.State.CONSTRAINT_LHS);
    if (_equals) {
      double _accRHS = this.accRHS;
      this.accRHS = (_accRHS + ((-1) * value));
    } else {
      double _accRHS_1 = this.accRHS;
      this.accRHS = (_accRHS_1 + value);
    }
  }
  
  public void _visit(final VariableExpression expression) {
    System.out.println(expression);
    this.expectOrNull(Expression.class);
    final Expression top = this.stack.peek();
    if ((top instanceof LiteralExpression)) {
      this.stack.pop();
      this.expectOperator(ArithmeticOperator.TIMES);
      this.stack.pop();
      this.addLiteral(expression, ((LiteralExpression)top));
      this.reduce();
    } else {
      if ((top instanceof ArithmeticExpression)) {
        this.expectOperator(ArithmeticOperator.PLUS, ArithmeticOperator.TIMES);
        Expression _peek = this.stack.peek();
        final ArithmeticOperator operator = ((ArithmeticExpression) _peek).getOperator();
        boolean _equals = Objects.equal(operator, ArithmeticOperator.PLUS);
        if (_equals) {
          this.addLiteral(expression, "1");
          this.reduce();
        } else {
          this.stack.push(expression);
        }
      } else {
        if ((top instanceof ConstraintExpression)) {
          this.addLiteral(expression, "1");
          this.reduce();
        } else {
          boolean _equals_1 = Objects.equal(top, null);
          if (_equals_1) {
            this.addLiteral(expression, "1");
            this.reduce();
          } else {
            this.illegalStack();
          }
        }
      }
    }
  }
  
  public void _visit(final ArithmeticExpression expression) {
    System.out.println(expression);
    this.expectOrNull(Expression.class);
    final Expression top = this.stack.peek();
    if ((top instanceof ArithmeticExpression)) {
      final ArithmeticExpression arith = ((ArithmeticExpression) top);
      if ((Objects.equal(arith.getOperator(), ArithmeticOperator.TIMES) && Objects.equal(expression.getOperator(), ArithmeticOperator.PLUS))) {
        throw new IllegalStateException("do the math on your own! (distributivity law)");
      }
    }
    this.stack.push(expression);
  }
  
  public void _visit(final IntegerLinearProgram ilp) {
  }
  
  private void notEmpty() {
    boolean _empty = this.stack.empty();
    if (_empty) {
      this.illegalStack("stack must not be empty");
    }
  }
  
  private void expect(final Class<?> clazz) {
    if ((this.stack.empty() || (!clazz.isInstance(this.stack.peek())))) {
      this.illegalStack();
    }
  }
  
  private void expectOrNull(final Class<?> clazz) {
    if (((!this.stack.empty()) && Objects.equal(this.stack.peek(), null))) {
      return;
    }
    this.expect(clazz);
  }
  
  private void illegalStack(final boolean condition, final Expression expression) {
    if ((!condition)) {
      this.stack.push(expression);
      this.illegalStack();
    }
  }
  
  private void illegalStack() {
    this.illegalStack(("unsupported stack state: " + this.stack));
  }
  
  private void illegalStack(final String msg) {
    throw new IllegalStateException(msg);
  }
  
  private void expectOperator(final ArithmeticOperator... operators) {
    this.expect(ArithmeticExpression.class);
    Expression _peek = this.stack.peek();
    final ArithmeticExpression arith = ((ArithmeticExpression) _peek);
    boolean found = false;
    for (final ArithmeticOperator operator : operators) {
      found = (Objects.equal(arith.getOperator(), operator) || found);
    }
    if ((!found)) {
      this.illegalStack();
    }
  }
  
  private void addLiteral(final VariableExpression variableExpression, final LiteralExpression literalExpression) {
    String _value = literalExpression.getValue();
    this.addLiteral(variableExpression, _value);
  }
  
  private void addLiteral(final VariableExpression variableExpression, final String coefficient) {
    double value = Double.parseDouble(coefficient);
    double _ceil = Math.ceil(value);
    int _intValue = Double.valueOf(value).intValue();
    double _minus = (_ceil - _intValue);
    boolean _greaterThan = (_minus > 0);
    if (_greaterThan) {
      throw new IllegalArgumentException("floating point coefficient is not supported");
    }
    int coeff = Double.valueOf(value).intValue();
    boolean _equals = Objects.equal(this.state, ILP2SAT.State.CONSTRAINT_RHS);
    if (_equals) {
      int _coeff = coeff;
      coeff = (_coeff * (-1));
    }
    Variable _variable = variableExpression.getVariable();
    final Literal literal = new Literal(_variable, true);
    Constraint _head = IterableExtensions.<Constraint>head(this.constraintList);
    _head.add(coeff, literal);
  }
  
  public void _visit(final EObject object) {
    throw new IllegalArgumentException(("got unexpected: " + object));
  }
  
  public void visit(final EObject expression) {
    if (expression instanceof ConstraintExpression) {
      _visit((ConstraintExpression)expression);
      return;
    } else if (expression instanceof ArithmeticExpression) {
      _visit((ArithmeticExpression)expression);
      return;
    } else if (expression instanceof LiteralExpression) {
      _visit((LiteralExpression)expression);
      return;
    } else if (expression instanceof VariableExpression) {
      _visit((VariableExpression)expression);
      return;
    } else if (expression instanceof IntegerLinearProgram) {
      _visit((IntegerLinearProgram)expression);
      return;
    } else if (expression != null) {
      _visit(expression);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
