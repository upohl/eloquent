package org.muml.psm.allocation.algorithm.ilp.lpsolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class LPSolve {
	private static final String[] CMD = new String[] {"lp_solve", "-lp"};
	private static final String VAR_SECTION = "Actual values of the variables:";
	private static final String UNEXP_LINE = "unexpected variable line: %s";
	
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		return run(ilp, solution);
	}
	
	private static int run(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		ProcessBuilder pb = new ProcessBuilder(CMD);
		int ret = -1;
		try {
			/*FileWriter fw = new FileWriter("/home/marcus/run.lp");
			fw.write(ilpString);
			fw.close();*/
			Process process = pb.start();
			new LPSolveM2T().serialize(ilp, process.getOutputStream());
			process.getOutputStream().close();
			parseOutput(process.getInputStream(), solution);
			ret = process.waitFor();
			System.out.println("lp_solve: " + ret);
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
		return ret;
	}
	
	private static void parseOutput(InputStream in, Dictionary<String, Integer> solution) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		try {
			boolean variableSection = false;
			String line = reader.readLine();
			while (line != null) {
				if (variableSection) {
					parseLine(line, solution);
				}
				if (line.equals(VAR_SECTION)) {
					variableSection = true;
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void parseLine(String line,  Dictionary<String, Integer> map) {
		String[] split = line.split("\\s+");
		if (split.length != 2) {
			throw new IllegalStateException(String.format(UNEXP_LINE, line));
		}
		map.put(split[0], Integer.parseInt(split[1]));
	}
}
