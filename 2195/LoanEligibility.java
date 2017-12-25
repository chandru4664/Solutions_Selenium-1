
package com.htc.ariweek1;

import java.io.IOException;
import java.util.Scanner;

public class LoanEligibility {

private	int yearOfServices = 0;
private	String maritalStatus = "";
private	String jobType = "";

	public int checkLoanEligibilty(int yearsOfServices, String maritalStatus, String jobType) {
    
		int loanAmount = 0 ;
		
		switch(jobType) {
	    
		case "P": 
			     if( yearsOfServices >= 30) 
			     {
			    	 if(maritalStatus == "U")
			    	 { loanAmount = 500000;}
			    	 else { loanAmount = 250000;}
			    	 if(maritalStatus == "M")
			    	 { loanAmount = 600000;}
			    	 else { loanAmount = 350000;}
			     }
			     break;
			    	 
		case "T": 
				loanAmount = 100000; 
			
		}
		
		return loanAmount ;
	}

}