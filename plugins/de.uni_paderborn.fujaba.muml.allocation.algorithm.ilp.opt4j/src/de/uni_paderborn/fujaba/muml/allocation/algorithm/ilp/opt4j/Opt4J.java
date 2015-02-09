package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import java.util.Map;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.opt4j.core.Individual;
import org.opt4j.core.optimizer.Archive;
import org.opt4j.core.start.Opt4JTask;
import org.opt4j.optimizers.ea.EvolutionaryAlgorithmModule;

import com.google.inject.Module;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

public class Opt4J {
	// make this configurable
	// also check if these values are reasonable
	private static final int GENERATIONS = 100;
	private static final int POPULATION = 500;
	private static final int CHILDREN = 50;
	private static final int PARENTS = 50;
			
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		int ret = computeSolution(ilp, solution,
				createEAModule(),
				new AllocationModule(ilp));
		return ret;
	}
	
	private static EvolutionaryAlgorithmModule createEAModule() {
		EvolutionaryAlgorithmModule ea = new EvolutionaryAlgorithmModule();
		ea.setGenerations(GENERATIONS);
		ea.setAlpha(POPULATION);
		ea.setMu(PARENTS);
		ea.setLambda(CHILDREN);
		return ea;
	}
	
	private static int computeSolution(IntegerLinearProgram ilp, Dictionary<String, Integer> solution,
			Module... modules) {
		Opt4JTask task = new Opt4JTask(false);
		task.init(modules);
		try {
			task.execute();
			Archive archive = task.getInstance(Archive.class);
			boolean first = true;
			System.out.println("possible solutions: " + archive.size());
			for (Individual individual : archive) {
				System.out.println(individual.getPhenotype());
				if (first) {
					Map<String, Boolean> map = (Map<String, Boolean>) individual.getPhenotype();
					for (String key : map.keySet()) {
						solution.put(key, map.get(key) ? 1 : 0);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 2;
		} finally {
			task.close();
		}
		return 0;
	}
}
