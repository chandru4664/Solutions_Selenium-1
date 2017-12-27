package com.htc.ariweek1;

public class PrimeNumbers {

	public int countPrimeNumbers(int userMaxNumber) {

		int count = 0;
		int[] numArray;
		numArray = new int[userMaxNumber];

		for (int i = 0; i <= userMaxNumber - 1; i++) {
			numArray[i] = i + 1;
		}

		for (int i = 2; i <= userMaxNumber; i++) {
			for (int j = 2; j <= i; j++) {

				if (i % j == 0 & i == j) {

					count = count + 1;
					System.out.println("Prime Number : " + i);

				}
				if (i % j == 0 & i != j) {
					j = i + 1;
				}
			}

		}

		return count;

	}

}
