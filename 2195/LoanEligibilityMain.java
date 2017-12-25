package com.htc.ariweek1;

import java.util.Scanner;

public class LoanEligibilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yearOfServices = 0;
		String maritalStatus = "";
		String jobType = "";
		int loanAmount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("        Welcome to Ari Bank       ");
		System.out.println(" ");

		try {
			System.out.println("Enter years of Services ");

			while (!sc.hasNextInt()) {
				System.out.println("Invalid entry. Enter year of services");
				sc.next();
			}
			yearOfServices = sc.nextInt();

			System.out.println("Job Type P-Permanent T-Temporary");

			while (!sc.hasNext("[PT]")) {
				System.out.println("Invalid entry.P-Permanent T-Temporary");
				sc.next();
			}
			jobType = sc.next();

			System.out.println("M-Married U-Unmarried");

			while (!sc.hasNext("[MU]")) {
				System.out.println("Invalid entry.M-Married U-Unmarried");
				sc.next();
			}
			maritalStatus = sc.next();

		} catch (Exception e) {
			System.out.println("IException caught");
		}
		
		LoanEligibility loanQuery=new LoanEligibility ();
		loanAmount = loanQuery.checkLoanEligibilty( yearOfServices,maritalStatus,jobType);
		
		System.out.println("");
		System.out.println("Congrats !! Your loan approved ");
		System.out.println("");
		System.out.println("Your loan amount : " + loanAmount );
		
	}

}
