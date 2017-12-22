package htc.adnan.corejava;

import java.util.Scanner;

public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		int constant = 1;
		System.out.println("Enter the count of numbers to display");
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		for(int i=1;i<=count;i++)
		{
			
	       for (int j=i;j<=count;j++)
			System.out.print(constant+ "/"+(i) +" ");
		}
		

	}

}
