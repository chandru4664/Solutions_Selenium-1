package com.htc.ariweek1;

public class OddNumbers {

	public int countOddNumbers(int userMaxNumber) {

		int count = 0;
		int[] numArray;
		numArray = new int[userMaxNumber];

		for (int i = 0; i <= userMaxNumber - 1; i++) {
			numArray[i] = i + 1;
		}

		for (int a : numArray) {
			if (!(a % 2 == 0) && (a % 3 == 0)) {
				/*
				 * if (a / 2 == 0) { count = count + 1; System.out.println(a); }
				 */
				count = count + 1;
			}
		}

		return count;

	}

}
