package com.htc.exercise;

import java.util.Scanner;

public class LoanAmount {

	public int Eligibility(String JobStatus, String MaritalStatus, int YearsOfService) {
		int Amount = 0;

		if (JobStatus.equalsIgnoreCase("Permanent") & MaritalStatus.equalsIgnoreCase("Married") & YearsOfService >= 30)
			Amount = 600000;

		else if (JobStatus.equalsIgnoreCase("Permanent") & MaritalStatus.equalsIgnoreCase("Married")
				& YearsOfService < 30)
			Amount = 350000;

		else if (JobStatus.equalsIgnoreCase("Permanent") & MaritalStatus.equalsIgnoreCase("Unmarried")
				& YearsOfService >= 30)
			Amount = 500000;

		else if (JobStatus.equalsIgnoreCase("Permanent") & MaritalStatus.equalsIgnoreCase("Unmarried")
				& YearsOfService < 30)
			Amount = 250000;

		else if (JobStatus.equalsIgnoreCase("Temporary"))
			Amount = 250000;

		return Amount;
	}

	public static void main(String[] args) {

		LoanAmount a = new LoanAmount();
		int b;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Job Status - ");
			String JobStatus = scan.next();
			System.out.print("Enter Marital Status - ");
			String MaritalStatus = scan.next();
			System.out.print("Enter Years Of Service - ");
			int YearsOfService = scan.nextInt();
			b = a.Eligibility(JobStatus, MaritalStatus, YearsOfService);
			scan.close();
			System.out.println("Loan eligibility is " + b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Invalid Input ");
		}

	}

}
