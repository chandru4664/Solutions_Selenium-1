package htc.com.Training.Excercises;

// Print a number if it is present in an Array

import java.util.Arrays;

public class PrintAvalue {

	public static void main(String[] args) {
		
		int[] myArray = { 2, 4, 6, 5, 7, 8, 3, 12, 15, 17 };
		int numtofind = 12;
		boolean flag = false;
		
		System.out.println("Number in array are: " + Arrays.toString(myArray));
		
		for (int n: myArray) {
			if (n == numtofind) {
				flag = true;
				break;
			}
		}
		
		if (flag)
			System.out.println(numtofind + " is available");
		else
		    System.out.println(numtofind + " is not avaialable");	
		}
	}
			
		