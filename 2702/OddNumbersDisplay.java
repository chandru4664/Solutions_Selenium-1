package htc.adnan.corejava;

import java.util.Scanner;

public class OddNumbersDisplay {
	public static void main(String[] args) {
		int odd = 1;
		int numberswanted;
		Scanner numbers = new Scanner(System.in);
		System.out.print("Enter the count of number wanted to display");
		numberswanted = numbers.nextInt();
		for(int i =1;i<=numberswanted;i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(-odd+" ");
			}
			else
			{
				System.out.print(+odd+" ");
			}
			
			odd += 2;
		}
		
	}

}
