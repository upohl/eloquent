package org.muml.psm.allocation.algorithm.ilp.lpsolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.lpsolve.xtext.resource.LPSolveResource;

public class LPSolve {
	private static final String timeout="60";
	private static final String VAR_SECTION = "Actual values of the variables:";
	private static final String TIMEOUT = "Timeout";
	private static final String INFEASIBLE = "This problem is infeasible";
	private static final String UNEXP_LINE = "unexpected variable line: %s";
	
	private static String serialize(IntegerLinearProgram ilp) {
		long startTime1 = System.currentTimeMillis();
		String ser = new LPSolveResource().serializeEObject(ilp, null);
		Double finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime1)
				.doubleValue() / 1000d);
		Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as LPSolveInput: "+finalTime+" seconds");
		// writes log into the .log file within the .metadata folder of the workspace
		Activator.getDefault().getLog().log(logTransformationTime);
		return ser;
	}
	
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		return run(ilp, solution);
	}
	
	private static int run(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
	
		
		int ret = -1;
		try {
			/*FileWriter fw = new FileWriter("/home/marcus/run.lp");
			fw.write(ilpString);
			fw.close();*/
	
			
	
			/* alternative code for measuring...
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			// serialize start...
			new LPSolveM2T().serialize(ilp, out);
			// serialize end...
			process.getOutputStream().write(out.toByteArray());
			 * end alternative code (when using this comment out the following new LPSolveM2T()... line
			 */
			LPSolveM2T lpsolve = new LPSolveM2T();
			
			
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("ILP Model");
			if (!project.exists()) {
				try {
					project.create(new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			String path = project.getLocation().toString();
			long startTime1 = System.currentTimeMillis();
		
			lpsolve.serialize(ilp,path);
			Double finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime1)
					.doubleValue() / 1000d);
			
			Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as LPSolveInput: "+finalTime+" seconds");
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime);
			
			ProcessBuilder pb = new ProcessBuilder("lp_solve", "-lp", "-timeout", timeout, "\""+ lpsolve.myFile.getAbsolutePath()+"\"");
			Process process = pb.start();
			startTime1 = System.currentTimeMillis();

		//	process.getOutputStream().close();
			
			parseOutput(process.getInputStream(), solution);
			ret = process.waitFor();
			finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - startTime1)
					.doubleValue() / 1000d);
			logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for solving the ILP: "+finalTime+" seconds");
			Activator.getDefault().getLog().log(logTransformationTime);
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
		

		
		Status logTransformationTime;
		try {
			boolean variableSection = false;
			String line = reader.readLine();
					
			//Parse the CPU time for solving
			while(line != null)
			{

				if(line.startsWith(VAR_SECTION))
				{
					variableSection = true;
					break;
				}
				if(line.startsWith(TIMEOUT))
				{	
					logTransformationTime = new Status(Status.WARNING,Activator.PLUGIN_ID,"LP Solve did not find a solution within "+timeout+" seconds");
					Activator.getDefault().getLog().log(logTransformationTime);
					break;
				}
				if(line.startsWith(INFEASIBLE))
				{
					logTransformationTime = new Status(Status.WARNING,Activator.PLUGIN_ID,"This problem is infeasible");
					Activator.getDefault().getLog().log(logTransformationTime);
					break;
				}
				line = reader.readLine();
			}
			
			line = reader.readLine();
			//Parse the results
			while (line != null) {
				if (variableSection) {
					parseLine(line, solution);
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
