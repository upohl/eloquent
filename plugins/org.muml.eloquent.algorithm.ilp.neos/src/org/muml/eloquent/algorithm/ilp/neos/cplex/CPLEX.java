package org.muml.eloquent.algorithm.ilp.neos.cplex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.apache.xmlrpc.XmlRpcException;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.eloquent.algorithm.ilp.neos.IJobInfo;
import org.muml.eloquent.algorithm.ilp.neos.NeosServer;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.Variable;

public class CPLEX {
	
	private static final String illegalVarSectionLine =
			"unexpected line: %s";
	private static final String noVariableBinding =
			"no variable binding for the name \"%s\"";
	
	private static final int SUCCESS = 0;
	private static final int INFEASIBLE = 2;
	
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution,
			CPLEXConfiguration configuration) {
		ILPNameEnvironment nameEnvironment = new ILPNameEnvironment();
		CPLEXSolverInput solverInput = new CPLEXSolverInput(ilp, configuration,
				nameEnvironment);
		String result = solveOnline(solverInput);
		return parseResult(result, nameEnvironment, solution);
	}
	
	public static String solveOnline(CPLEXSolverInput solverInput) {
		NeosServer server = new NeosServer();
		String result = null;
		try {
			IJobInfo jobInfo = server.submitJob(solverInput);
			result = server.getFinalResults(jobInfo);
		} catch (XmlRpcException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static int parseResult(String result, ILPNameEnvironment nameEnvironment,
			Dictionary<String, Integer> solution) {
		BufferedReader reader = new BufferedReader(new StringReader(result));
		String line;
		boolean varSection = false;
		try {
			while ((line = reader.readLine()) != null) {
				if (!varSection && line.toLowerCase().contains("infeasible")) {
					// this check implies that no variable's name should
					// contain "infeasible"...
					return INFEASIBLE;
				} else if (line.equals("")) {
					// ignore empty line
					continue;
				} else if (!varSection && line.startsWith("\t")) {
					/* Ignore lines like
					 * \tall variables eliminated, but lower bound = 1 > 0
					 * 
					 * otherwise, we would interpret it as a variable
					 */
					continue;
				}
				String[] split = line.split(" = ");
				if (split.length != 2) {
					if (!varSection) {
						continue;
					}
					throw new IllegalStateException(String.format(illegalVarSectionLine,
							line));
				} else if (!varSection && split[0].matches(".*\\s.*")) {
					// a variable should not contain a whitespace character
					// (if we are already in the varSection, we will probably
					// fail later (noVariableBinding))
					continue;
				}
				varSection = true;
				Object object = nameEnvironment.getObject(split[0]);
				if (!(object instanceof Variable)) {
					throw new IllegalStateException(String.format(noVariableBinding,
							split[0]));
				}
				solution.put(((Variable) object).getName(),
						Integer.parseInt(split[1]));
			}
		} catch (IOException e) {
			// hmm should not happen
			throw new RuntimeException(e);
		}
		// XXX: hmm returning INFEASIBLE may not always be correct
		// (too lazy for now...)
		return varSection ? SUCCESS : INFEASIBLE;
	}
	
}
