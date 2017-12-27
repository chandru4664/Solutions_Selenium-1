package com.htc.ariweek1;

import java.util.Scanner;

public class IPvalidationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IPvalidation ip = new IPvalidation();

		String ipAddress = new String();
		String displayErrorMessage = "";

		System.out.println("Enter IP address : ");

		ipAddress = sc.next();
		try {displayErrorMessage = ip.validateIPaddress(ipAddress);
		throw new IPException(displayErrorMessage);
		}
		catch (IPException e)
		{System.out.println(e);}
		while (displayErrorMessage.length() > 0) {
			System.out.println(displayErrorMessage);
			System.out.println("Enter Valid IP Address : ");
			ipAddress = sc.next();
			displayErrorMessage = ip.validateIPaddress(ipAddress);

		}

		System.out.println("Entered ipAddress " + ipAddress + " is valid ");

	}
}
