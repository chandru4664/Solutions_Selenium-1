package com.htc.corejava;

import java.util.Scanner;

public class LoanEligibility {
	
	public static void main(String arg[]) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Please Enter your Marital Status (M/U): ");
		 String mStatus=SC.nextLine();
		 System.out.println("Please Enter your job status (P - Permanent / T - Temp): ");
		 String jobStatus=SC.nextLine();
		 System.out.println("Please Enter your Years of Service: ");
		int yrsService=SC.nextInt();
//		 System.out.println(mStatus + "\n"+yrsService+"\n" + jobStatus);
		 
		if((mStatus.equalsIgnoreCase("M") ||mStatus.equalsIgnoreCase("U")) && jobStatus.equalsIgnoreCase("T") && yrsService > 0) {
			System.out.println("Your Loan Eligibility amount is Rs. 100,000.00");
		}
		else if(mStatus.equalsIgnoreCase("M") && jobStatus.equalsIgnoreCase("P") && yrsService >=30){
			System.out.println("Your Loan Eligibility amount is Rs. 600,000.00");
		} 
		else if(mStatus.equalsIgnoreCase("M") && jobStatus.equalsIgnoreCase("P") && yrsService <30) {
			System.out.println("Your Loan Eligibility amount is Rs. 350,000.00");
			}
		else if(mStatus.equalsIgnoreCase("U") && jobStatus.equalsIgnoreCase("P") && yrsService >=30) {
				System.out.println("Your Loan Eligibility amount is Rs. 500,000.00");
			}
		else if(mStatus.equalsIgnoreCase("U") && jobStatus.equalsIgnoreCase("P") && yrsService <30) {
			System.out.println("Your Loan Eligibility amount is Rs. 250,000.00");
		}
		else {
			System.out.println("Invalid Input");
		}
		 
	}
}
