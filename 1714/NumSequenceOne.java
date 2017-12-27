package com.htc.exercise;

public class NumSequenceOne {

	public static void main(String[] args) {

		int x = 1;
		int length;
		int reminder = 1;

		for (length = 1; length <= 10; length = length + 1) {

			if (reminder % 2 == 0) {
				System.out.print(-x + ",");

			} else {
				System.out.print(x + ",");
			}
			x = x + 2;
			reminder = reminder + 1;
		}

	}

}
