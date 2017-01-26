package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.ilp.tests.MUMLOCLContextBasedTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class DifferentLocation2ILPTest extends MUMLOCLContextBasedTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/differentLocationConstraint/";
  
  public DifferentLocation2ILPTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "separateLocationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintStructuredTwoEmbedded.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "locationConstraintStructuredTwoEmbedded.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.4"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }));
  }
}
