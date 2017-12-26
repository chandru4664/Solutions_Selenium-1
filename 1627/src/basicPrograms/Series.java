package basicPrograms;
import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the length of the number to be printed:");
		int numPrint= userinput.nextInt();
		userinput.close();		
		//Logic for 1, -3, 5, -7....
		int i=1, c, f=1;
		for (c= 1; c<=numPrint; c++)
		{
			if (f%2 ==0) {
				System.out.println(-i+ " ");
					}
			else
			{
				System.out.println(i+ " ");
			}
			i+=2;
			f++;			
		}
	

	 }
	
	
}
