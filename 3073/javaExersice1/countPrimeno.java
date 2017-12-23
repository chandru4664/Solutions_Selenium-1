package testJava;
import java.util.*;
public class primeNumber {
	public static void main(String[] args)
	{
		System.out.print("Input no please");
		Scanner scan = new Scanner(System.in);
		int numInp= scan.nextInt();
			scan.close();
			
			int Count=0;
			for (int i=0;i<=numInp;i++)
			{
				int value = primeFun(i);
				if (value==0)
				{
				 Count = Count+1;
				 }
			}
			System.out.print("No of prime no# " + Count);					
	}

	public static int primeFun(int num)
	{
		int primelocator=0;
		if (num==1 || num==0)
		{
			//System.out.println("Not a prime no#");	
			primelocator =1;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					//System.out.println("Not a prime");
					primelocator = 1;
					break;
				}else if(i==(num-1))
					{
				//	System.out.println("Yeah "+num+" is a prime");
					primelocator = 0;
					}
				
			}
		} 
		return primelocator;
				
	}
	 
}

