package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class OclContext2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/oclContext/model/"
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/oclContext/"
	
	new(String expectedURI, String transformationURI, String aslURI, String oclContextURI) {
		super(expectedURI, transformationURI, aslURI, oclContextURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			// simple allocation
			#[uriPrefix + "generalConstraint_allocation.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_allocation.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// no relation (lp_solve cannot handle the resulting *.lp file)
			#[uriPrefix + "generalConstraint_noRelation.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_noRelation.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple disjoint relations
			#[uriPrefix + "generalConstraint_allocation.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_allocationMultipleRelations.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple disjoint relations (same as above (except relation names),
			// but the order of the relations is changed (resulting in a different *.lp file)
			#[uriPrefix + "generalConstraint_allocationMultipleRelationsOrder.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_allocationMultipleRelationsOrder.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// same lower and upper bound
			#[uriPrefix + "generalConstraint_sameLowerUpper.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_sameLowerUpper.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// different lower and upper bound
			#[uriPrefix + "generalConstraint_differentLowerUpper.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_differentLowerUpper.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// an upper bound of -1 (which means "unbounded")
			#[uriPrefix + "generalConstraint_minusOneUpper.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_minusOneUpper.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations with different bounds (disjoint)
			#[uriPrefix + "generalConstraint_multipleRelationsDifferentBounds.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_multipleRelationsDifferentBounds.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations with different bounds (not disjoint)
			#[uriPrefix + "generalConstraint_multipleRelationsWithBoundsAndDuplicates.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_multipleRelationsWithBoundsAndDuplicates.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// unnamed relations with duplicates (the unnamed relations
			// are not disjoint)
			#[uriPrefix + "generalConstraint_unnamedRelationsWithDuplicates.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "generalConstraint_unnamedRelationsWithDuplicates.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			//
			// collocation
			//
			// single collocation constraint with semantical duplicates
			#[uriPrefix + "collocationConstraint_singleWithSemanticalDuplicates.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "collocationConstraint_singleWithSemanticalDuplicates.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations
			#[uriPrefix + "collocationConstraint_multipleRelations.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "collocationConstraint_multipleRelations.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations and multiple collocation constraints
			#[uriPrefix + "collocationConstraint_multipleRelationsMultipleCollocations.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "collocationConstraint_multipleRelationsMultipleCollocations.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// unnamed duplicated collocation constraints
			#[uriPrefix + "collocationConstraint_unnamedDuplicatedConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "collocationConstraint_unnamedDuplicatedConstraints.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// single inequality (demonstrates why we need to generate a
			// ">= 1" inequality)
			#[uriPrefix + "collocationConstraint_singleInequality.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "collocationConstraint_singleInequality.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			//
			// differentLocation (similar to the collocation constraints)
			//
			// single differentLocation constraint with semantical duplicates
			#[uriPrefix + "differentLocationConstraint_singleWithSemanticalDuplicates.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "differentLocationConstraint_singleWithSemanticalDuplicates.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations
			#[uriPrefix + "differentLocationConstraint_multipleRelations.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "differentLocationConstraint_multipleRelations.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// multiple relations and multiple differentLocation constraints
			#[uriPrefix + "differentLocationConstraint_multipleRelationsMultipleConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "differentLocationConstraint_multipleRelationsMultipleConstraints.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// unnamed duplicated differentLocation constraints
			#[uriPrefix + "differentLocationConstraint_unnamedDuplicatedConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "differentLocationConstraint_unnamedDuplicatedConstraints.allocation_specification",
			  modelsDirectory + "simple.ecore"],
			// single equality
			#[uriPrefix + "differentLocationConstraint_singleEquality.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "differentLocationConstraint_singleEquality.allocation_specification",
			  modelsDirectory + "simple.ecore"]
		]
	}
	
}