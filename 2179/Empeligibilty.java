package domhtc.employee.eligibility;

import java.util.Scanner;

public class Empeligibilty {
	public static void main(String[] args) {
			boolean Married;
			boolean Temp;
			int Serv;
			
		Scanner in = new Scanner(System.in);
		System.out.print("Are you Married(true/false): ");
		Married = in.nextBoolean();
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("Are you a temp employee(true/false): ");
				Temp = in.nextBoolean();
				
				Scanner in3 = new Scanner(System.in);
		System.out.print("How much service yours: ");
		Serv = in.nextInt();
		
		Employee obj1 = new Employee();
	
		obj1.LoanEligibility(Married, Temp, Serv);
		in.close();
		in2.close();
		in3.close();
	}
		}
