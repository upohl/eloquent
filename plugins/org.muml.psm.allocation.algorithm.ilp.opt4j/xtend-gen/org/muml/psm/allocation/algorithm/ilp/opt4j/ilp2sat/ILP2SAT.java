package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.ilp2sat;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.ilp2sat.IVisitor;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ConstraintExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;
import de.uni_paderborn.fujaba.muml.allocation.ilp.Variable;
import de.uni_paderborn.fujaba.muml.allocation.ilp.VariableExpression;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.opt4j.satdecoding.Constraint;
import org.opt4j.satdecoding.Literal;

@SuppressWarnings("all")
public class ILP2SAT implements IVisitor {
  private enum State {
    CONSTRAINT_LHS,
    
    CONSTRAINT_RHS;
  }
  
  private final List<Constraint> constraintList;
  
  private final /* Stack<Expression> */Object stack;
  
  private double accRHS;
  
  public List<Constraint> getConstraintList() {
    return this.constraintList;
  }
  
  private ILP2SAT.State state;
  
  public ILP2SAT() {
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type.");
  }
  
  private void reduce() {
    throw new Error("Unresolved compilation problems:"
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\n== cannot be resolved"
      + "\n== cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ComparingOperator is undefined"
      + "\nThe method or field ComparingOperator is undefined"
      + "\nThe method or field ComparingOperator is undefined"
      + "\nEQUAL cannot be resolved"
      + "\nLESS_OR_EQUAL cannot be resolved"
      + "\nGREATER_OR_EQUAL cannot be resolved");
  }
  
  public void _visit(final /* LiteralExpression */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nTIMES cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nTIMES cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\n== cannot be resolved"
      + "\nvalue cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type."
      + "\nLiteralExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nTIMES cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\nTIMES cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nPLUS cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public void _visit(final /* ArithmeticExpression */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\nThe method or field ArithmeticOperator is undefined"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nTIMES cannot be resolved"
      + "\n&& cannot be resolved"
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\nPLUS cannot be resolved");
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
    boolean _or = false;
    boolean _empty = this.stack.empty();
    if (_empty) {
      _or = true;
    } else {
      Expression _peek = this.stack.peek();
      boolean _isInstance = clazz.isInstance(_peek);
      boolean _not = (!_isInstance);
      _or = _not;
    }
    if (_or) {
      this.illegalStack();
    }
  }
  
  private void expectOrNull(final Class<?> clazz) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved");
  }
  
  private void illegalStack(final boolean condition, final /* Expression */Object expression) {
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
  
  private void expectOperator(final /* ArithmeticOperator */Object... operators) {
    throw new Error("Unresolved compilation problems:"
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticExpression cannot be resolved to a type."
      + "\nArithmeticOperator cannot be resolved to a type."
      + "\noperator cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved");
  }
  
  private Object addLiteral(final VariableExpression variableExpression, final /* LiteralExpression */Object literalExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
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
    } else if (expression instanceof VariableExpression) {
      _visit((VariableExpression)expression);
      return;
    } else if (expression instanceof IntegerLinearProgram) {
      _visit((IntegerLinearProgram)expression);
      return;
    } else if (expression != null) {
      _visit(expression);
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
