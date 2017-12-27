package com.htc.ariweek1;

import java.util.Scanner;

public class ArrayClassMain {
	public static void main(String[] args) {

		// Local Variable Declartions
		int userInput = 0;
		int resultCount = 1;
		String inputLaptop;
		String displayPrice = "";
		int primeCount = 0;

		// Object Creations
		Scanner sc = new Scanner(System.in);
		OddNumbers odd = new OddNumbers();
		KeyValue k1 = new KeyValue();
		PrimeNumbers p1 = new PrimeNumbers();

		// Receive user Input for odd number count
		System.out.println("Enter the number : ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid entry. Enter the number: ");
			sc.next();
		}
		userInput = sc.nextInt();

		// Display odd number count
		resultCount = odd.countOddNumbers(userInput);
		System.out.println("Total count of odd numbers divisable by 3 upto " + userInput + " : " + resultCount);

		// Receive user Input for laptop price */
		System.out.println("Enter Laptop Name : ");  
		

		inputLaptop = sc.next();
		displayPrice = k1.findKeyValue(inputLaptop);

		if (displayPrice == "") {
			System.out.println(" LAPTOP NOT FOUND ON OUR STORE ");
		} else {
			System.out.println(inputLaptop + " Price : $" + displayPrice);
		}
		
		// Receive user Input for prime number count
		System.out.println("Enter Max number to display all Prime Numbers : ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid entry. Enter the number: ");
			sc.next();
		}
		userInput = sc.nextInt();
		
		primeCount = p1.countPrimeNumbers(userInput);
		System.out.println("Total Prime Numbers : " + primeCount);
		
	}
}