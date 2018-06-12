package org.muml.eloquent.algorithm.ilp.gurobi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
		Process process = new ProcessBuilder(gurobiBinary,
				"ResultFile=" + solFilename, lpFilename).start();
		// make sure we read stdout/stderr to avoid a deadlock...
		ThreadPool threadPool = new ThreadPool();
		
		threadPool.add(new StreamReader(process.getInputStream(), "stdout"));
		threadPool.add(new StreamReader(process.getErrorStream(), "stderr"));
		threadPool.join();
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
	
	public static class ThreadPool {
		private List<Thread> pool = new ArrayList<Thread>();
		
		public void add(Runnable runnable) {
			Thread thread = new Thread(runnable);
			thread.start();
			pool.add(thread);
		}
		
		public void join() throws InterruptedException {
			for (Thread thread : pool) {
				thread.join();
			}
		}
	}
	
	public static class StreamReader implements Runnable {
		private static final String printPrefix = "Gurobi (%s): ";
		private InputStream in;
		private String name;
		
		public StreamReader(InputStream in, String name) {
			this.in = in;
			this.name = name;
		}
		
		public void run() {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			String line = null;
			StringBuilder stdout = new StringBuilder();
			try {
				while ((line = reader.readLine()) != null) {
					//stdout.append(String.format(printPrefix, name));
				//	System.out.println(line);
					stdout.append(line);
					stdout.append(System.getProperty("line.separator"));
					// writes log into the .log file within the .metadata folder of the workspace
				}
				Status log= new Status(Status.INFO,Activator.PLUGIN_ID,name+":"+stdout.toString());;
				Activator.getDefault().getLog().log(log);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
	}

}
