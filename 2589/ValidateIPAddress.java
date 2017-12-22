package com.htc.javaexercise.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Ip:");

String ip=sc.nextLine();
boolean p=Pattern.matches("^([1-9]{1}\\d{1,2})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$", ip);

System.out.println(p);
if(p==true) {
	System.out.println(ip+" this is a Valid Ip address");
}else {
	System.out.println(ip+" Not a Valid Ip address");
}
	
		
		
	}

}
