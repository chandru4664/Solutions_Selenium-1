package testJava;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi sudhar");
		
		// Program for 1,-3,5,-7
		int j=1;
		for(int i=1;i<20;i=i+4)
		{
			System.out.print(i);
			System.out.print(',');
			System.out.print(j=j-4);
			System.out.print(',');
		}
		//Program to peint 1/1,1/2,1/3...
		System.out.println();
		for (int i=1;i<10;i++)
		{
			System.out.print("1/"+i+",");
		}
					
	}

}
