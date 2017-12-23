package testJava;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// odd numbers divisible by 3 in even position
		System.out.println();
		int countno=0;
		System.out.print("My input =");
		int a[]=new int[20];
		for (int k=0;k<20;k++) 
		{
			a[k] = k+1;
			System.out.print(a[k]);
			System.out.print(',');
		}
		System.out.println();
		for (int k=1;k<20;k=k+2) 
		{
			if((a[k]%3)==0) 
			{
				System.out.print(a[k]);
				countno=countno+1;
				System.out.print(',');
			}
			
		}
		System.out.print(countno+"is the total number of odd numbers divisible by 3 in even position");
		
	}

}
