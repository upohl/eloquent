package org.muml.eloquent.algorithm.ilp.gurobi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.Status;
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
			long startTime = System.currentTimeMillis();
			serializeILP(ilp, lpFile);
			Double finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime)
					.doubleValue() / 1000d);
			
			Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as Gurobi Input: "+finalTime+" seconds");
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime);
		
			startTime = System.currentTimeMillis();
			ret = runGurobi(lpFile.getAbsolutePath(),
					solFile.getAbsolutePath());

			finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime)
					.doubleValue() / 1000d);
			
			Status logSolvingTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for solve the ILP Model Using Gurobi: "+finalTime+" seconds");
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logSolvingTime);
		
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
		// we read stdout and stderr to avoid blocking
		Process process = new ProcessBuilder(gurobiBinary,
				"ResultFile=" + solFilename, lpFilename).start();
		InputStream stdout = process.getInputStream();
		InputStream stderr = process.getErrorStream();
		

        if(stderr.available()>0)
        {
	        String resultErr = new BufferedReader(new InputStreamReader(stderr))
	        		  .lines().collect(Collectors.joining("\n"));
	        
			Status logError = new Status(Status.ERROR,Activator.PLUGIN_ID,resultErr);
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logError);
        }
		
        if(stdout.available()>0)
        {
	        String result = new BufferedReader(new InputStreamReader(stderr))
	        		  .lines().collect(Collectors.joining("\n"));
	        
	        Status logGurobiOutput = new Status(Status.INFO,Activator.PLUGIN_ID,result);
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logGurobiOutput);
        }
		
				
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
