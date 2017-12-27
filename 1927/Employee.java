package htc.training.homework;

public class Employee {
	private String jobstatus;
	private int experience;
	private int loanamt;
	private Person person;
	
	public Employee(String jobstatus, int experience, int loanamt, Person person) {
		this.jobstatus = jobstatus;
		this.experience = experience;
		this.loanamt = loanamt;
		this.person = person;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int loancalc() {
		if (jobstatus == "permanent") {
			if(person.getMaritalstts()=="unmarried" ) {
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

	@Override
	public String toString() {
		return "Employee [jobstatus=" + jobstatus + ", experience=" + experience + ", loanamt=" + loanamt + ", person="
				+ person + "]";
	}
	
	

}
