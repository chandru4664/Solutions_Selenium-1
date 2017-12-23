package testJava;

import java.util.Scanner;

public class loan {

	public static void main(String[] args) {
		
		System.out.print("Are you married? Reply Yes or No ");
		Scanner scan = new Scanner(System.in);
		String maritalStatus= scan.next();
		if (maritalStatus.equalsIgnoreCase("yes")||maritalStatus.equalsIgnoreCase("no")) 
		{
			System.out.println("Do you have permenant Job");
			String Jobstatus= scan.next();
			if (Jobstatus.equalsIgnoreCase("yes")||Jobstatus.equalsIgnoreCase("no")) 
			{
				System.out.println("Do you have 30 years of experience");
				String experience= scan.next();
				if (experience.equalsIgnoreCase("yes")||experience.equalsIgnoreCase("no")) 
				{
					if(Jobstatus.equalsIgnoreCase("no")) 
					{
						System.out.println("Loan amount is Rs 100,000");
					}else if (maritalStatus.equalsIgnoreCase("yes"))
					{
						if(experience.equalsIgnoreCase("yes"))
						{
							System.out.println("Loan amount is Rs 600,000");
						}else
						{
							System.out.println("Loan amount is Rs 350,000");
						}
					}else if (maritalStatus.equalsIgnoreCase("no"))
					{
						if(experience.equalsIgnoreCase("yes"))
						{
							System.out.println("Loan amount is Rs 500,000");
						}else
						{
							System.out.println("Loan amount is Rs 250,000");
						}
					}else
					{
						System.out.println("You are not eligible for loan");
					}
				}else
				{
					System.out.println("Invalid input");
				}	
				}else 
				{
					System.out.println("Invalid input");
				}

			}else 
			{
				System.out.println("Invalid input");
			}

		scan.close();
		

	}

}
