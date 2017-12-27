package htc.training.homework;

public class EmployeeClone implements Cloneable {
	private String maritalstts;
	private String jobstatus;
	private int experience;
	private int loanamt;
	
	public EmployeeClone(String maritalstts, String jobstatus, int experience) {
		this.maritalstts = maritalstts;
		this.jobstatus = jobstatus;
		this.experience = experience;
	}
	
	public String getMaritalstts() {
		return maritalstts;
	}

	public void setMaritalstts(String maritalstts) {
		this.maritalstts = maritalstts;
	}

	public String getJobstatus() {
		return jobstatus;
	}

	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLoanamt() {
		return loanamt;
	}

	public void setLoanamt(int loanamt) {
		this.loanamt = loanamt;
	}

	@Override
	public String toString() {
		return "EmployeeClone [maritalstts=" + maritalstts + ", jobstatus=" + jobstatus + ", experience=" + experience + ", loanamt=" + loanamt + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		 
	}

	public int loancalc() {
		if (jobstatus == "permanent") {
			if(maritalstts=="unmarried" ) {
				if(experience >= 30) {
					loanamt = 500000 ;
				}else {
					loanamt = 250000 ;
				}
				 
			}else {
				if(experience >= 30) {
					loanamt = 600000 ;
				}else {
					loanamt = 350000 ;
				}
			}
		}else {
			loanamt = 100000 ;
		}
		return loanamt;
	}

}
