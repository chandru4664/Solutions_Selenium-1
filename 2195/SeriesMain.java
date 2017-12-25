package com.htc.ariweek1;

import java.util.Scanner;

public class SeriesMain {

	public static void main(String[] args) {

		int inputDisplayCount = 0;
		int i = 1;
		boolean negative = false;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the count to print ");
		inputDisplayCount = sc.nextInt();

		if (inputDisplayCount > count) {
			System.out.println("1,-3 series ");
			System.out.println("=========== ");
		} else {
			System.out.println(" You entered 0 for 1,-3 series ");
		}

		while (inputDisplayCount > count) {
			if (!negative) {
				System.out.println(i);
				negative = true;
				i = i + 2;
			} else {
				System.out.println("-" + i);
				negative = false;
				i = i + 2;
			}
			count = count + 1;
		}
		;

		count = 0;

		System.out.println("  ");
		if (inputDisplayCount > count) {
			System.out.println("1/1/,1/2 series ");
			System.out.println("=============== ");
		} else {
			System.out.println(" You entered 0 for 1/1,1/2 series");
		}

		while (inputDisplayCount > count) {
			count = count + 1;
			System.out.println("1/" + count);

		}

	}

}
