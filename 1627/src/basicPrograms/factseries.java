package basicPrograms;
import java.util.Scanner;
public class factseries {
	public static void main(String[] arg)
	{
	//Logic for 1/1, 1/2, 1/3, 1/4....
		   Scanner userinput = new Scanner(System.in);
			System.out.println("Enter the length of the number to be printed:");
			int numPrn= userinput.nextInt();
			userinput.close();	
		    int t;	
			for(t=1;t<=numPrn;t++)
			{
				System.out.print(1);
				System.out.print('/');
				System.out.print(t);
				System.out.print(',');
			}
	}
}

