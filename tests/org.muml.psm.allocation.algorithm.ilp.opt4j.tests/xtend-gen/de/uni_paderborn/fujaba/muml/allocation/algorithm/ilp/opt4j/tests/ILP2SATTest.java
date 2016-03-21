package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.ilp2sat.ILP2SAT;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.ilp2sat.ILPPreorderTraversal;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.qvto.QVToTransformationRunner;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

@SuppressWarnings("all")
public class ILP2SATTest {
  private final String uri = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.tests/fixtures/ilp2sat/";
  
  @Test
  public void testSingleConstraint() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
  }
  
  @Test
  public void testSingleConstraintFloatInt() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
  }
  
  @Test
  public void testRHSVariables() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
  }
  
  @Test
  public void testSingleVariable() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
  }
  
  @Test
  public void testSingleLiteral() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field constraintList is not visible"
      + "\nThe field constraintList is not visible");
  }
}
