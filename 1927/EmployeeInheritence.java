package htc.training.homework;

public class EmployeeInheritence extends Person {
	private String jobstatus;
	private int experience;
	private int loanamt;
	
	public EmployeeInheritence(String name, int age, String maritalstts, String jobstatus, int experience) {
		super(name, age, maritalstts);
		this.jobstatus = jobstatus;
		this.experience = experience;
	}
	
	public void loancalc() {
		if (jobstatus == "permanent") {
			if(super.getMaritalstts() =="unmarried" ) {
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
	}

	
	public int getLoanamt() {
		return loanamt;
	}


	public void setLoanamt(int loanamt) {
		this.loanamt = loanamt;
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


	@Override
	public String toString() {
		return "Employee [jobstatus=" + jobstatus + ", experience=" + experience + ", loanamt=" + loanamt + ", name="
				+ super.getName() + ", age=" + super.getAge() + ", maritalstts=" + super.getMaritalstts() + "]";
	}

	
	
	
}
