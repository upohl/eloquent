package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.Map;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.opt4j.core.optimizer.Archive;
import org.opt4j.core.start.Opt4JTask;
import org.opt4j.optimizers.ea.EvolutionaryAlgorithmModule;
import org.opt4j.satdecoding.ContradictionException;

import com.google.inject.Module;

public class Opt4J {
			
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution, Opt4jConfiguration configuration) {
		System.out.println("got config: " + configuration);
		int ret = computeSolution(ilp, solution,
				createEAModule(configuration), //m);
				new AllocationModule(ilp, configuration.isNoDominatedSolutions()));
		return ret;
	}
	
	private static EvolutionaryAlgorithmModule createEAModule(Opt4jConfiguration configuration) {
		System.out.println("got configuration: " + configuration);
		EvolutionaryAlgorithmModule ea = new EvolutionaryAlgorithmModule();
		ea.setGenerations(configuration.getGenerations());
		ea.setAlpha(configuration.getPopulationSize());
		ea.setMu(configuration.getParents());
		ea.setLambda(configuration.getOffspring());
		return ea;
	}
	
	private static int computeSolution(IntegerLinearProgram ilp, Dictionary<String, Integer> solution,
			Module... modules) {
		Opt4JTask task = new Opt4JTask(false);
		task.init(modules);
		try {
			task.execute();
			Archive archive = task.getInstance(Archive.class);
			System.out.println("possible solutions: " + archive.size());
			if (archive.isEmpty()) {
				// this code path shouldn't be reached, because opt4j throws
				// an exception, if the problem is infeasible (if this behavior
				// changes in upcoming releases, we are safe at least)
				return 2;
			}
			@SuppressWarnings("unchecked")
			Map<String, Boolean> map = (Map<String, Boolean>) archive
					.iterator().next().getPhenotype();
			for (String key : map.keySet()) {
				solution.put(key, map.get(key) ? 1 : 0);
			}
		} catch (ContradictionException e) {
			return 2;
		} catch (Exception e) {
			// hrm... a "throws Exception" clause Opt4JTask.execute
			// is insane!
			e.printStackTrace();
			throw new IllegalStateException(e);
		} finally {
			task.close();
		}
		return 0;
	}
}
