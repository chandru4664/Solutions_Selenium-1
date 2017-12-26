package htc.com.Training.Excercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidIPAddr {

		public static void main(String[] args) {

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the IP Adress:");
	
	sc.close();

	String ip=sc.nextLine();
	boolean p=Pattern.matches("^([1-9]{1}\\d{1,2})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", ip);

	System.out.println(p);
	if(p==true) {
		System.out.println(ip+" is a Valid Ip address");
	}else {
		System.out.println(ip+" Not a Valid Ip address");
	}		
			
		}

	}

