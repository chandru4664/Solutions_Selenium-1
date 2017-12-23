
package Loan;

import java.util.Scanner;

public class LoanEligibility {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your years of service : \n");
	int service=scan.nextInt();
	
	System.out.print("Enter your job position : \n");
	String jobposition=scan.next();
	
	System.out.print("Enter your marital status : \n");
	String maritalstatus=scan.next();
	
	scan.close();
	
	if (maritalstatus.equalsIgnoreCase ("M") && service >= 30 && jobposition.equalsIgnoreCase ("P")) {
		
			System.out.print("Your eligible loan amount is : Rs.600,000");}
	
	else {
		if (maritalstatus.equalsIgnoreCase ("M") && service <= 29 && jobposition.equalsIgnoreCase ("P")) {
		
		System.out.print("Your eligible loan amount is : Rs.350,000");} 
	else {
				
	 if (maritalstatus.equalsIgnoreCase ("U") && service >= 30 && jobposition.equalsIgnoreCase ("P")) {
	
			System.out.print("Your eligible loan amount is : Rs.500,000");
	} else {
		if (maritalstatus.equalsIgnoreCase ("U") && service <= 29 && jobposition.equalsIgnoreCase ("P")) {
			
			System.out.print("Your eligible loan amount is : Rs.250,000");
	}
		else {
	if (service >= 30 && jobposition.equalsIgnoreCase ("T")) { 
	
			System.out.print("Your eligible loan amount is : Rs.100,000");
	} 	
		}
		}
		}
		}		
		}
		
}