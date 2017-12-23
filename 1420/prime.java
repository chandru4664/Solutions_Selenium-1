package Primenumber;

import java.util.Scanner;

public class prime {
public static void main(String[] args)
{
	int p = 2;
	int result = 0;
	int num = 0;
	Scanner read = new Scanner(System.in);
	System.out.print("Please enter a number: \n");
	num = read.nextInt();
	while (p <= num /2)
	{
		if (num % p == 0)
			
		{
			result = 1;
		}
		p++;
	}
	if (result == 1)
	{
		System.out.print("Number:" + num + " is Not Prime.");
	}
	else
	{
		System.out.print("Number: " + num + " is Prime.");
		}
	read.close();
	}
}

