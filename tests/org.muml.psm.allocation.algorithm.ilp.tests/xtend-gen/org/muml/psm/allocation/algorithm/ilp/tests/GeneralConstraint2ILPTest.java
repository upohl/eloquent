package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.tests.muml.MUMLOCLContextBasedTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class GeneralConstraint2ILPTest extends MUMLOCLContextBasedTest {
  public final static String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/models/";
  
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/generalConstraint/";
  
  public GeneralConstraint2ILPTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleStructured.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simpleStructured.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.1"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleNestedStructured.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simpleNestedStructured.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.2"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleMultiplePlatformInstances.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simpleMultiplePlatformInstances.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0") }));
  }
}
