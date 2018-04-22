package org.muml.psm.allocation.algorithm.ilp.export;

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
import org.muml.psm.allocation.algorithm.ilp.export.LPM2T;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

public class Export {

	

	
	@Operation(kind=Kind.QUERY)
	public static int solve(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
		return run(ilp, solution);
	}
	
	private static int run(IntegerLinearProgram ilp, Dictionary<String, Integer> solution) {
	
		
		int ret = -1;
		
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
			
			Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for serialize the ILP as LP File: "+finalTime+" seconds");
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime);
			
			
			
			
		//	process.getOutputStream().close();
			
				ret = 0;
			
			
			
		

		return ret;
	}
	
		
	
	
}
