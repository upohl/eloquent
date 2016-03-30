package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILP2SAT;
import org.muml.psm.allocation.algorithm.ilp.opt4j.ilp2sat.ILPPreorderTraversal;
import org.muml.psm.allocation.ilp.Variable;
import org.opt4j.core.Genotype;
import org.opt4j.core.common.random.Rand;
import org.opt4j.satdecoding.AbstractSATDecoder;
import org.opt4j.satdecoding.Constraint;
import org.opt4j.satdecoding.Model;
import org.opt4j.satdecoding.SATManager;

import com.google.inject.Inject;

public class AllocationSATCreatorDecoder extends AbstractSATDecoder<Genotype, Map<String, Boolean>> {
	private AllocationProblem problem;
	private ILP2SAT ilp2sat;

	@Inject
	public AllocationSATCreatorDecoder(AllocationProblem problem, SATManager manager, Rand random) {
		super(manager, random);
		this.problem = problem;
		ilp2sat = new ILP2SAT();
		ILPPreorderTraversal.traverse(problem.getILP(), ilp2sat);
	}

	@Override
	public Set<Constraint> createConstraints() {
		Set<Constraint> constraintSet = new HashSet<Constraint>();
		constraintSet.addAll(ilp2sat.getConstraintList());
		return constraintSet;
	}

	@Override
	public Map<String, Boolean> convertModel(Model model) {
		System.out.println("convertModel");
		Map<String, Boolean> allocation = new HashMap<String, Boolean>();
		for (Variable variable : problem.getILP().getVariables()) {
			allocation.put(variable.getName(), model.get(variable));
		}
		return allocation;
	}

}
