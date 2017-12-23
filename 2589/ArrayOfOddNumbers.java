package com.htc.javaexercise.exercise;

public class ArrayOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,3,9,5,12,5,6,5,15,5,21,5,18};
		int y=0;
		
		for(int i=2;i<numbers.length;i+=2) {
			if (numbers[i]%3==0) {
				
				y=y+1;
				
			}
			
		}
		System.out.println("the cout of the number of odd numbers divisible by 3 in even positions: " +y);

	}

}
