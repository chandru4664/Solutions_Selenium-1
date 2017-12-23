package example1;

import java.util.Scanner;

public class Sequence2 {
	public int sum=0;
	public void seq(int number) {
		int w = number-1;
		for(int i=1;i<=number;i=i+2)
		{
				if(i<w)
				{
				if(sum%2==0)
					{
					System.out.print(i+",");
					}
				else
					{
					System.out.print(-i+",");
					}
				}
				else
				{
					if(sum%2==0)
					{
					System.out.print(i);
					}
				else
					{
					System.out.print(-i);
					}
				}
			sum= sum+1;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner seq1 = new Scanner(System.in);
		System.out.println("enter number");
		int r = seq1.nextInt();
		seq1.close();
		Sequence2 ex3 = new Sequence2();
		ex3.seq(r);
		
			
		
	}

	}
