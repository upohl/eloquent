package org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.BinaryExpression;
import org.muml.core.expressions.common.util.CommonExpressionsSwitch;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.VariableExpression;
import org.muml.psm.allocation.ilp.util.IlpSwitch;

public class ILPPreorderTraversal extends IlpSwitch<EObject> {
	
	private IVisitor visitor;
	private ExpressionSwitch expressionSwitch;
	
	public ILPPreorderTraversal(IVisitor visitor) {
		this.visitor = visitor;
		this.expressionSwitch = new ExpressionSwitch();
	}
	
	protected void visit(EObject eObject) {
		visitor.visit(eObject);
	}
	
	public static void traverse(IntegerLinearProgram ilp, IVisitor visitor) {
		//new ILPPreorderTraversal(visitor).caseIntegerLinearProgram(ilp);
		new ILPPreorderTraversal(visitor).doSwitch(ilp);
	}
	
	@Override
	public EObject caseIntegerLinearProgram(IntegerLinearProgram ilp) {
		visit(ilp);
		for (ConstraintExpression expression : ilp.getConstraints()) {
			//caseConstraintExpression(expression);
			doSwitch(expression);
		}
		//caseObjectiveFunctionExpression(ilp.getObjectiveFunction());
		return ilp;
	}
	
	@Override
	public EObject caseConstraintExpression(ConstraintExpression expression) {
		visit(expression);
		expressionSwitch.doSwitchExpression(expression.getLeftExpression());
		expressionSwitch.doSwitchExpression(expression.getRightExpression());
		return expression;
	}
	
	@Override
	public EObject caseObjectiveFunctionExpression(ObjectiveFunctionExpression expression) {
		visit(expression);
		doSwitch(expression.getObjectiveFunction());
		return expression;
	}
	
	@Override
	public EObject caseVariableExpression(VariableExpression expression) {
		visit(expression);
		return expression;
	}
	
	class ExpressionSwitch extends CommonExpressionsSwitch<EObject> {
		
		private void doSwitchExpression(EObject expression) {
			if (isSwitchFor(expression.eClass().getEPackage())) {
				doSwitch(expression);
			} else {
				ILPPreorderTraversal.this.doSwitch(expression);
			}
		}

		@Override
		public EObject caseBinaryExpression(BinaryExpression expression) {
			visit(expression);
			doSwitchExpression(expression.getLeftExpression());
			doSwitchExpression(expression.getRightExpression());
			return expression;
		}
		
		@Override
		public EObject caseExpression(Expression expression) {
			visit(expression);
			return expression;
		}
	}
	
}
