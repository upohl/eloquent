package org.muml.eloquent.algorithm.ilp.neos.cplex;

import java.io.ByteArrayOutputStream;

import org.muml.eloquent.algorithm.ilp.neos.ISolverInput;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.Variable;

public class CPLEXSolverInput implements ISolverInput {
	
	private IntegerLinearProgram ilp;
	private CPLEXConfiguration configuration;
	private ILPNameEnvironment nameEnvironment;
	
	public CPLEXSolverInput(IntegerLinearProgram ilp, CPLEXConfiguration configuration,
			ILPNameEnvironment nameEnvironment) {
		this.ilp = ilp;
		this.configuration = configuration;
		this.nameEnvironment = nameEnvironment;
	}
	
	private static final String template = new StringBuilder()
			.append("<document>\n")
			.append("	<category>lp</category>\n")
			.append("	<solver>CPLEX</solver>\n")
			.append("	<inputMethod>AMPL</inputMethod>\n")
			.append("	<model><![CDATA[\n")
			.append("%s")
			.append("]]></model>\n")
			.append("	<data><![CDATA[\n")
			.append("%s")
			.append("]]></data>\n")
			.append("	<commands><![CDATA[\n")
			.append("%s")
			.append("]]></commands>\n")
			.append("	<email>%s</email>\n")
			.append("</document>").toString();
	
	protected String getTemplate() {
		return template;
	}
	
	protected String getModel() {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		new AMPLM2T(nameEnvironment).serialize(ilp, os);
		return os.toString();
	}
	
	protected String getData() {
		return "";
	}
	
	protected String getCommands() {
		StringBuffer sb = new StringBuffer();
		sb.append("solve;\n");
		for (Variable variable : ilp.getVariables()) {
			sb.append("display ");
			sb.append(nameEnvironment.getName(variable));
			sb.append(";\n");
		}
		return sb.toString();
	}
	
	@Override
	public String getInput() {
		return String.format(getTemplate(),
				getModel(), getData(), getCommands(),
				configuration.getEmail());
	}
}
