package htc.training.core;
class Employee {

	int eligibleAmount;

	public boolean isMarritalstatus() {
		return maritalstatus;
	}

	public void setMarritalstatus(boolean marritalstatus) {
		this.maritalstatus = marritalstatus;
	}

	public String getJobstatus() {
		return jobstatus;
	}

	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

	public int getServiceleft() {
		return serviceleft;
	}

	public void setServiceleft(int serviceleft) {
		this.serviceleft = serviceleft;
	}

	public int getEligibility(boolean maritalstatus, String jobstatus, int serviceleft) {
		try {
			if ((maritalstatus) && (jobstatus.equals("temp")) && (serviceleft < 30))
				eligibleAmount = 100000 / 0;
			else if ((!maritalstatus) && (jobstatus.equals("temp")) && (serviceleft < 30))
				eligibleAmount = 100000;
			else if ((maritalstatus) && (jobstatus.equals("perm")) && (serviceleft >= 30))
				eligibleAmount = 600000;
			else if ((maritalstatus) && (jobstatus.equals("perm")) && (serviceleft < 30))
				eligibleAmount = 300000;
			else if ((!maritalstatus) && (jobstatus.equals("perm")) && (serviceleft >= 30))
				eligibleAmount = 500000;
			else if ((!maritalstatus) && (jobstatus.equals("perm")) && (serviceleft < 30))
				eligibleAmount = 250000;
		} catch (Exception e) {
			eligibleAmount = 10000;
		}
		return eligibleAmount;
	}

	boolean maritalstatus;
	String jobstatus;
	int serviceleft;
}
