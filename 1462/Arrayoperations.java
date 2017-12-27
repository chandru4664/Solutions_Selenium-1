package com.htc.corejava;

public class Arrayoperations {
	
	public static void main(String argu[]) {
		int [] intarray = {25,27,33,34,63,66,72,81,87,101,101,112,213,140,150,160,172,181,192,120};
		
		int counter = countOddDivby3(intarray);
		System.out.println("\nThere are " + counter + " Odd numbers divisible by 3 and in even possition of the given array.");
		
		arraySearch(intarray);
		
		primeNumber(intarray);
		
		
	}


	private static void primeNumber(int[] intarray) {
		int index = 0;
		int primeCounter =0;
		while(index<intarray.length) {
			boolean status = false;
			for(int i=2; i<intarray[index]; i++) {
				if(intarray[index]%i==0) {
					status = true;
				break;
				}
			}
			if (!status) {
				primeCounter++;
				System.out.print(intarray[index] + ", ");
			}
			index++;
		}
		System.out.println("\nThere are "+ primeCounter + " prime numbers exists in given array.");
	}
	
	

	private static void arraySearch(int[] intarray) {
		int searchvalue = 25;
		int index = 0;
		boolean status = false;
		while(index<intarray.length) {
			if(intarray[index]==searchvalue) {
				System.out.println("Value " + searchvalue + " found in array at the possition " + index + ".");
				status = true;
				break;
			}
			index++;
		}
		if(!status) {
			System.out.println("Value " + searchvalue + " not found in a given array.");
		}
	}

	
	
	private static int countOddDivby3(int[] intarray) {
		int index =0;
		int counter =0;
		while(index<intarray.length) {
			if(intarray[index]%2 == 1 && intarray[index]%3 == 0 && index%2 ==0) {
				counter++;
				System.out.print(intarray[index] + ", ");
			}
			index++;
		}
		return counter;
	}

}
