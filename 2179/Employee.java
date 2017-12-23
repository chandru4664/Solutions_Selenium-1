package domhtc.employee.eligibility;

public class Employee {

	boolean isMarried;
	 boolean isTemp;
	int LoanAmt;
	int Service;
	
	void LoanEligibility(boolean isMarried, boolean isTemp, int Service) {
		this.isMarried = isMarried;	
		this.isTemp = isTemp;
		if (this.isMarried) {
			if (this.isTemp) {
				if (Service >=30) {
					LoanAmt = 100000;
					System.out.println("Congrats you are eligible for loan Amount:" +LoanAmt);
				}else {
					System.out.println("Sorry temp job holder  age is less then 30 not elgible for loan:"); 
				}
			} else	 {
				if (Service >=30) {
				   LoanAmt = 600000;
				   System.out.println("Congrats you are eligible for loan amout:" +LoanAmt);
				}else {
					LoanAmt = 350000;
					System.out.println("Comgrats you are eligible for loan amount:" +LoanAmt);
				}
			}
		}else if (this.isTemp) {
				       if (Service >=30) {
				       LoanAmt = 100000;
				       System.out.println("Congrats you are elgible for loan amt:" +LoanAmt);
				       }else {
				    	   System.out.println("sorry temp job holder age is less then 30 not eligible for loan:");
				       }
		}else {
			if (Service >=30 ) {
				LoanAmt = 500000;
				System.out.println("Congrats you sre eigible for loan amt:" +LoanAmt);
			}else {
				LoanAmt = 250000;
				System.out.println("Congrats you are eligible for laon amt;" +LoanAmt);
			}
		}	       
			   
		   }
			}
	
		
		

