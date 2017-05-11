package org.muml.psm.allocation.algorithm.ilp.lpsolve;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.lpsolve.xtext.resource.LPSolveResource;

public class LPSolve {
	private static final int timeout=60;
	private static final String[] CMD = new String[] {"lp_solve", "-lp -time -timeout "+timeout};
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
		ProcessBuilder pb = new ProcessBuilder(CMD);
		int ret = -1;
		try {
			/*FileWriter fw = new FileWriter("/home/marcus/run.lp");
			fw.write(ilpString);
			fw.close();*/
			Process process = pb.start();
			/* alternative code for measuring...
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			// serialize start...
			new LPSolveM2T().serialize(ilp, out);
			// serialize end...
			process.getOutputStream().write(out.toByteArray());
			 * end alternative code (when using this comment out the following new LPSolveM2T()... line
			 */
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
		Status logTransformationTime;
		try {
			boolean variableSection = false;
			String line = reader.readLine();
					
			//Parse the CPU time for solving
			while(line != null)
			{
				if(line.startsWith("CPU Time for solving:"))
				{	logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time for solving the ILP: "+line.substring(line.indexOf(":")));
					Activator.getDefault().getLog().log(logTransformationTime);
				}
				
				if(line.startsWith(TIMEOUT))
				{	
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					MessageBox dialog =
						    new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
						dialog.setText("LP Solve did not find a solution within "+timeout+" seconds");
						// open dialog and await user selection
						dialog.open();
						break;
				}
				if(line.startsWith(INFEASIBLE))
				{
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					MessageBox dialog =
						    new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
						dialog.setText("This problem is infeasible");
						// open dialog and await user selection
						dialog.open();
						
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
