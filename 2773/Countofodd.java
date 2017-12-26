package htc.com.Training.Excercises;

//To Display no.of odd numbers divisible by 3 in even positions in an array. 

import java.util.Arrays;

public class Countofodd {

	public static void main(String[] args) {

		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
		int count = 0;

		System.out.println("List of numbers in array: " + Arrays.toString(num));

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 != 0 && num[i] % 3 == 0 && i % 2 == 0) {

				count += 1;
			}
		}

		System.out.println("Count of off numbers divisible by 3 in even position are: " + count);

	}
}
