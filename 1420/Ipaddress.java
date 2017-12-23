package ipaddress;
import java.util.regex.*;
import java.util.Scanner;


public class Ipaddress {

	private static Scanner iscan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i= false;
		String ip;
		iscan = new Scanner(System.in);
		System.out.println("Enter IP Adress:");
		ip = iscan.nextLine();
		
		//i=Pattern.matches("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", ip);
		i=Pattern.matches("^([1-9]{1}\\d{1,2})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", ip);
		//System.out.println(i);
		
		if (i==false)
		{
			System.out.println("This is a invalid Ip Address");
		}
		else
		{
			System.out.println("This is a valid Ip Address");
		}
		

	}
}
