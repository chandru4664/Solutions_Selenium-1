package com.htc.loaneligibility.eligibility;

public class LoanEligibility {

	String status;
	String jobStatus;
	int service;
	
	public void loanEligibility(String status,String jobStatus,int service) {
		if(status=="unmarried" && jobStatus=="permanent") {
			if(service>=30) {
			System.out.println("Loan amount Eligible for this employee is Rupees 5 Lakh");
			}else if(service<30) {
				System.out.println("Loan amount Eligible for this employee is Rupees 2.5 Lakh");
			}
			/*else {
				System.out.println("not eligible for loan")
				
			}*/
		}else if(status=="married" && jobStatus=="permanent") {
			if(service>=30) {
				System.out.println("Loan amount Eligible for this employee is Rupees 6 Lakh");
				}else if(service<30) {
					System.out.println("Loan amount Eligible for this employee is Rupees 3.5 Lakh");
				}
			
		}else if(jobStatus=="temporary") {
			System.out.println("Loan amount Eligible for this employee is Rupees 1 Lakh");
		}else {
			System.out.println("Please reach out to company HR for more details");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanEligibility loan=new LoanEligibility();
		loan.loanEligibility("married", "permanent",15);
		loan.loanEligibility("unmarried", "temporary",15);
		loan.loanEligibility("unmarried", "permanent",31);

	}

}
