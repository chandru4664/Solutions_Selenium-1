package com.htc.exercise;

public class Seriesone {

	public static void main(String[] args) {

		int i = 1, cn, r = 1;
		for (cn = 1; cn <= 10; cn++) {
			if (r % 2 != 0) {
				System.out.print(i + ",");
			} else {
				System.out.print(-i + ",");
			}
			i = i + 2;
			r++;
		}
	}
}