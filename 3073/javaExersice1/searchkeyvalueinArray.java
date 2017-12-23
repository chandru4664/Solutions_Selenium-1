package testJava;

public class series {

	public static void main(String[] args) {

		// array input
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
		int flag=0;
		//search key value 10 and provides array position
		for(int i=0;i<20;i++)
		{
			if (a[i]==10)
			{
				System.out.print(a[i]+"is atposition"+ i);
				flag=flag+1;
			}
		}
		if (flag==0)
		{
				System.out.print("Value not found");
		}

	}

}
