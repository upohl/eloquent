package org.muml.eloquent.algorithm.ilp.gurobi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class Gurobi {
	private static final String gurobiBinary = "gurobi_cl";
	private static final int success = 0;
	
	private static final String unexpectedLine = "Got unexpected line: %s";
	
	private static final String solSuffix = ".sol";
	private static final String lpSuffix = ".lp";
	
	public static int solve(IntegerLinearProgram ilp,
			Dictionary<String, Integer> solution) {
		int ret = success;
		File solFile = null;
		File lpFile = null;
		try {
			solFile = File.createTempFile("gurobi", solSuffix);
			lpFile = File.createTempFile("gurobi", lpSuffix);
			serializeILP(ilp, lpFile);
			ret = runGurobi(lpFile.getAbsolutePath(),
					solFile.getAbsolutePath());
			if (ret == success) {
				parseSolution(solFile, solution);
			}
		} catch (IOException|InterruptedException e) {
			throw new IllegalStateException(e);
		} finally {
			if (solFile != null) {
				solFile.delete();
			}
			// quite unlikely that solFile.delete throws an exception...
			if (lpFile != null) {
				lpFile.delete();
			}
		}
		return ret;
	}
	
	public static void serializeILP(IntegerLinearProgram ilp, File file) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream(file);
		new LPM2T().serialize(ilp, fos);
	}
	
	public static int runGurobi(String lpFilename, String solFilename) throws IOException, InterruptedException {
		// keep fingers crossed that we do not eventually block,
		// because we read neither stdout nor stderr
		Process process = new ProcessBuilder(gurobiBinary,
				"ResultFile=" + solFilename, lpFilename).start();
		return process.waitFor();
	}
	
	public static void parseSolution(File solFile, Dictionary<String, Integer> solution) throws FileNotFoundException, IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(solFile));
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("#")) {
					// ignore comment
					continue;
				}
				String[] splittedLine = line.split(" ");
				if (splittedLine.length != 2 ||
						!splittedLine[1].equals("0") && !splittedLine[1].equals("1")) {
					throw new IllegalStateException(
							String.format(unexpectedLine, line));
				}
				solution.put(splittedLine[0], Integer.parseInt(splittedLine[1]));
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

}
