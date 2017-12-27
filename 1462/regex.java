package com.htc.corejava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex {
	public static void main(String args[]) {
				System.out.println("Please Enter ipAddress: ");
				Scanner SC=new Scanner(System.in);
				 String input=SC.nextLine();
				 SC.close();
		
//		String regex = "[^_][\\w]*@[^_][\\w]*.[a-zA-Z]{2,4}";
//		String input = "karthik01@aol.com";

		String regex = "^((2[0-5][0-5]|1\\d\\d|[1-9]?\\d)(\\.)){3}(2[0-5][0-5]|1\\d\\d|[1-9]?\\d)$";
//		String regex = "^((2[0-5][0-5])|(1\\d\\d)|([1-9]?\\d))\\.((2[0-5][0-5])|(1\\d\\d)|([1-9]?\\d))\\.((2[0-5][0-5])|(1\\d\\d)|([1-9]?\\d))\\.((2[0-5][0-5])|(1\\d\\d)|([1-9]?\\d))$";
//		String input = "00.250.25.255";
		
		
		
		boolean isMatch = Pattern.matches(regex, input);
		if(isMatch){	
		System.out.println(input + " is a Valid IP Address");
		}
		else {
			System.out.println(input + " is In-valid IP Address");
		}
	}

}
