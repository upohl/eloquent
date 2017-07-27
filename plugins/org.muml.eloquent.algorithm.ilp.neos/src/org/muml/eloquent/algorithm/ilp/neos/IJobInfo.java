package org.muml.eloquent.algorithm.ilp.neos;

public interface IJobInfo {
	public int getJobNumber();
	public String getPassword();
	
	public class JobInfo implements IJobInfo {
		private int jobNumber;
		private String password;
		
		public JobInfo(int jobNumber, String password) {
			this.jobNumber = jobNumber;
			this.password = password;
		}
		
		@Override
		public int getJobNumber() {
			return jobNumber;
		}
		
		@Override
		public String getPassword() {
			return password;
		}
	}
}
