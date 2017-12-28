package com.exercise;

public class Employee {
	private int empId;
	private String empName;
	private String jobStatus;
	private double salary;
	private String marStatus;
	private int experience;
	private double loanAmount;
	
	
	public Employee(String jobStatus, int experience , String marStatus) {
		this.experience = experience;
		this.jobStatus = jobStatus;
		this.marStatus = marStatus;
	}
	public Employee(int empId, String empName, String jobStatus, double salary, String marStatus, int experience,
			double loanAmount) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobStatus = jobStatus;
		this.salary = salary;
		this.marStatus = marStatus;
		this.experience = experience;
		this.loanAmount = loanAmount;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMarStatus() {
		return marStatus;
	}
	public void setMarStatus(String marStatus) {
		this.marStatus = marStatus;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobStatus=" + jobStatus + ", salary=" + salary
				+ ", marStatus=" + marStatus + ", experience=" + experience + ", loanAmount=" + loanAmount + "]";
	}
	
	
	
	public void permanentEmployee() {
		if(marStatus=="Unmarried"&& jobStatus=="Permanent") {
			if(experience>=30) {
					System.out.println("THIS EMPLOYEE IS ELIGIBILE FOR A LOAN AMOUNT OF $500,000");
				}
			else
				System.out.println("THIS EMPLOYEE IS ELIGIBILE FOR A LOAN AMOUNT OF $250,000");
		}
		else if(marStatus=="married"&& jobStatus=="Permanent"){
			if(experience>=30) {
				System.out.println("THIS EMPLOYEE IS ELIGIBILE FOR A LOAN AMOUNT OF $600,000");
			}
		    else
			System.out.println("THIS EMPLOYEE IS ELIGIBILE FOR A LOAN AMOUNT OF $350,000");
	    } 
		else{
			System.out.println("THIS EMPLOYEE IS ELIGIBILE FOR A LOAN AMOUNT OF $250,000");
						
		
}
	}
	
}
