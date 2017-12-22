package htc.adnan.corejava;

import java.util.Scanner;

public class LoanEligibility {
	
	
	public void employeeLoanforMarried()
	{
		int noOfYearOfExperience;
		String jobStatus;
		double loanAmounttemporary = 100000.00d;
		double loanAmountPermanent30 = 600000.00d;	
		double loanAmountPermanent25 = 350000.00d;
		Scanner msloan = new Scanner(System.in);
		System.out.print("Whats your Job Status?Permanent or Temporary? : ");
		jobStatus = msloan.next();
		
		if(jobStatus.equals("Temporary"))
		{
			System.out.println("You are Eligible for the Amount :Rs"+loanAmounttemporary);
		}
		if(jobStatus.equals("Permanent"))
		{
			System.out.print("Enter your No of years Experience in Service: ");
			noOfYearOfExperience = msloan.nextInt();
			if(noOfYearOfExperience >= 30)
			System.out.println("You are Eligible for the Amount :Rs"+loanAmountPermanent30);
			else
			{
				System.out.println("You are Eligible for the Amount :Rs"+loanAmountPermanent25);
			}
		}
			
		
	}
	public void employeeLoanforSingle()
	{
		int noOfYearOfExperience;
		String jobStatus;
		double loanAmounttemporary = 100000.00d;
		double loanAmountPermanent30 = 500000.00d;
		double loanAmountPermanent25 = 250000.00d;
		Scanner msloan = new Scanner(System.in);
		System.out.print("Whats your Job Status?Permanent or Temporary? : ");
		jobStatus = msloan.next();
		
		if(jobStatus.equals("Temporary"))
		{
			System.out.println("You are Eligible for the Amount :Rs"+loanAmounttemporary);
		}
		if(jobStatus.equals("Permanent"))
		{
			System.out.print("Enter your No of years Experience in Service: ");
			noOfYearOfExperience = msloan.nextInt();
			if(noOfYearOfExperience >= 30)
			System.out.println("You are Eligible for the Amount :Rs"+loanAmountPermanent30);
			else
			{
				System.out.println("You are Eligible for the Amount :Rs"+loanAmountPermanent25);
			}
		}
			
		
	}
	
	public static void main(String[] args) {
		LoanEligibility Le = new LoanEligibility();
        String maritalStatus;
		Scanner empdetails = new Scanner(System.in);
		System.out.println("===================Welcome to HTC Loan Quotation ========== ");
		System.out.print("Enter your Marital Status:Married/Single? : ");
		maritalStatus = empdetails.nextLine();
		if(maritalStatus.equals("Married"))
		{
			Le.employeeLoanforMarried();
		}
		if(maritalStatus.equals("Single"))
		{
			Le.employeeLoanforMarried();
		}
				
	}

}
