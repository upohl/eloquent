package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.tests.muml.MUMLOCLContextBasedTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class MeasureFunction2ILPTest extends MUMLOCLContextBasedTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/measureFunction/";
  
  public MeasureFunction2ILPTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleQoS.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleQoS.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleServices.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleServices.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleHeterogeneousQoS.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleHeterogeneousQoS.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionOrder.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionOrder.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MeasureFunction2ILPTest.uriPrefix + "measureFunctionMultipleServices.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MeasureFunction2ILPTest.uriPrefix + "measureFunctionOmitService.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }));
  }
}
