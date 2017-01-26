package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class OclContext2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/oclContext/model/";
  
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/oclContext/";
  
  public OclContext2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.createTestData(2, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_allocation.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_allocation.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_noRelation.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_noRelation.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_allocation.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_allocationMultipleRelations.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_allocationMultipleRelationsOrder.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_allocationMultipleRelationsOrder.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_sameLowerUpper.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_sameLowerUpper.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_differentLowerUpper.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_differentLowerUpper.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_minusOneUpper.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_minusOneUpper.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_multipleRelationsDifferentBounds.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_multipleRelationsDifferentBounds.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_multipleRelationsWithBoundsAndDuplicates.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_multipleRelationsWithBoundsAndDuplicates.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "generalConstraint_unnamedRelationsWithDuplicates.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "generalConstraint_unnamedRelationsWithDuplicates.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "collocationConstraint_singleWithSemanticalDuplicates.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "collocationConstraint_singleWithSemanticalDuplicates.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "collocationConstraint_multipleRelations.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "collocationConstraint_multipleRelations.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "collocationConstraint_multipleRelationsMultipleCollocations.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "collocationConstraint_multipleRelationsMultipleCollocations.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "collocationConstraint_unnamedDuplicatedConstraints.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "collocationConstraint_unnamedDuplicatedConstraints.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "collocationConstraint_singleInequality.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "collocationConstraint_singleInequality.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_singleWithSemanticalDuplicates.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_singleWithSemanticalDuplicates.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_multipleRelations.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_multipleRelations.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_multipleRelationsMultipleConstraints.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_multipleRelationsMultipleConstraints.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_unnamedDuplicatedConstraints.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_unnamedDuplicatedConstraints.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") }, 
      new Object[] { (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_singleEquality.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (OclContext2ILPTest.uriPrefix + "differentLocationConstraint_singleEquality.allocation_specification"), (OclContext2ILPTest.modelsDirectory + "simple.ecore") });
  }
}
