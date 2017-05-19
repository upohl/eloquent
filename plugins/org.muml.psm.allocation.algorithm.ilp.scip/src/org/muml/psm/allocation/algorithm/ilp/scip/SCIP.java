package org.muml.psm.allocation.algorithm.ilp.scip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class SCIP {
	private static final long timeout=180;
	private static final String VAR_SECTION = "objective value:";
	private static final String TIMEOUT = "Timeout";
	private static final String INFEASIBLE = "SCIP Status        : problem is solved [infeasible]";
	private static final String UNEXP_LINE = "unexpected variable line: %s";
	private static final String CPUTIME = "CPU Time for solving:";
	private static final String SCIPTIMEOUT = "SCIP did not find a solution within ";
	

	
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
			LPM2T lpsolve = new LPM2T();
			
			
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
			
			Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as SCIPInput: "+finalTime+" seconds");
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime);
			String lpFileName = lpsolve.myFile.getAbsolutePath();
			String mpsFileName = lpFileName.substring(0, lpFileName.indexOf("."))+".mps";
			ProcessBuilder pbPre = new ProcessBuilder("lp_solve", "-parse_only","-wfmps",mpsFileName , lpFileName);
			Process processPre = pbPre.start();
			ret = processPre.waitFor();
			
			
			
			ProcessBuilder pb = new ProcessBuilder("scip", "-f",mpsFileName);
			//ProcessBuilder pb = new ProcessBuilder("\"D:\\Program Files\\SCIP\\scip.exe\"", "-f",mpsFileName);
			Process process = pb.start();
			
			
		//	process.getOutputStream().close();
			
			parseOutput(process.getInputStream(), process.getErrorStream(),  solution);
			if(process.waitFor(timeout, TimeUnit.SECONDS)==true)
			{
				ret = 0;
				}
			else
			{
				ret=-1;
				logTransformationTime = new Status(Status.WARNING,Activator.PLUGIN_ID,SCIPTIMEOUT+timeout+" seconds");
				Activator.getDefault().getLog().log(logTransformationTime);
			}
			System.out.println("scip: " + ret);
		
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		} //catch (InterruptedException e) {
 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}
	
	private static void parseOutput(InputStream in, InputStream err, Dictionary<String, Integer> solution) {
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

				if(line.startsWith(INFEASIBLE))
				{
					logTransformationTime = new Status(Status.WARNING,Activator.PLUGIN_ID,INFEASIBLE);
					Activator.getDefault().getLog().log(logTransformationTime);
					break;
				}
				line = reader.readLine();
			}
			
			line = reader.readLine();
			//Parse the results
			while (line != null) {
				if (line.equals(""))
				{
					variableSection = false;
				}
				if (variableSection) {
					parseLine(line, solution);
				}
				if(line.startsWith("Total Time"))
				{
					logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,CPUTIME+line.substring(line.indexOf(":")+1));
					Activator.getDefault().getLog().log(logTransformationTime);
				}
				line = reader.readLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try{
			BufferedReader errReader = new BufferedReader(new InputStreamReader(err));
			String errLine = errReader.readLine();
			while(errLine!=null)
			{
				if(errLine.startsWith(CPUTIME))
				{
					logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,CPUTIME+errLine.substring(errLine.indexOf(":")+1));
					Activator.getDefault().getLog().log(logTransformationTime);
					break;
				}
				errLine= errReader.readLine();
			}
		}
		 catch (IOException e) {
				e.printStackTrace();
				}*/
		}	
	
	
	private static void parseLine(String line,  Dictionary<String, Integer> map) {
		String[] split = line.split("\\s+");
		if (split.length != 3) {
			throw new IllegalStateException(String.format(UNEXP_LINE, line));
		}
		map.put(split[0], Integer.parseInt(split[1]));
	}
}
