package org.muml.eloquent.algorithm.ilp.neos;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.muml.eloquent.algorithm.ilp.neos.IJobInfo.JobInfo;

public class NeosServer {
	private XmlRpcClient client;

	public NeosServer() {
		this(getURL());
	}
	
	public NeosServer(URL url) {
		client = new XmlRpcClient();
		client.setConfig(createConfig(url));
	}
	
	protected XmlRpcClientConfig createConfig(URL url) {
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(url);
		/* If enabled, a NPE is thrown for a "large" solverInput...
		 * Need to check why this happens (it seems that no Content-Length
		 * header is set, if extensions are enabled)
		 */
		//config.setEnabledForExtensions(true);
		return config;
	}
	
	private static final String url = "https://neos-server.org:3333";
	
	private static URL getURL() {
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static final String submitJobMethodName = "submitJob";
	
	public IJobInfo submitJob(ISolverInput solverInput) throws XmlRpcException {
		/* Moving around a (potentially big) solverInput as a string is really
		 * stupid. Actually, we should write out the "data" in, for instance,
		 * AMPLM2T.emit and do HTTP chunk encoding, but I'm not sure if this
		 * conforms to the XMLRPC spec etc. and we need to dig deeper into
		 * the apache xmlrpc plugin => do this stupid thing for now.
		 */
		return submitJob(solverInput.getInput());
	}
	
	public IJobInfo submitJob(String data) throws XmlRpcException {
		Object[] result = (Object[]) client.execute(submitJobMethodName,
				new Object[] {data});
		int jobNumber = (int) result[0];
		String passwordOrError = (String) result[1];
		// keep these debugging information for now
		System.out.println(jobNumber);
		System.out.println(passwordOrError);
		if (jobNumber == 0) {
			// indicates an error
			throw new RuntimeException(passwordOrError);
		}
		return new JobInfo(jobNumber, passwordOrError);
	}
	
	private static final String getFinalResultsMethodName = "getFinalResults";
	
	public String getFinalResults(IJobInfo jobInfo) throws XmlRpcException {
		byte[] result = (byte[]) client.execute(getFinalResultsMethodName,
				new Object[] {
						jobInfo.getJobNumber(),
						jobInfo.getPassword()
				});
		return new String(result);
	}
	
	private static final String getKillJobMethodName = "killJob";
	
	public void killJob(IJobInfo jobInfo) throws XmlRpcException {
		client.execute(getKillJobMethodName,
				new Object[] {
						jobInfo.getJobNumber(),
						jobInfo.getPassword()
				});
	}
	
}
