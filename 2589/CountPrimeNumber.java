package com.htc.javaexercise.exercise;

public class CountPrimeNumber {
	
	static int[] numbers= {163,49,2,3,4,5,6,11,8,9,10,13,14,15,16,17,18,19,20};
	int[] x=new int[numbers.length];
	 //static int[] numbers= new int[100];
	static int count=0;
	
	static int i;
	
	public void countPrime() {
		for(i=0;i<numbers.length;i++) {
			
			for(int j=2;j<numbers[i];j++){
				
				if(numbers[i]%j==0) 
					 {
					x[i]=numbers[i];
						System.out.println(numbers[i]+" Not a prime it is divisible by" +j);
						break;
						
					}
			}
				if(numbers[i]!=x[i] && numbers[i]!=1)		{		
				System.out.println(numbers[i]+" is a prime");
				count+=1;
				}
			
		}
							
				
			
			
		}			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountPrimeNumber c=new CountPrimeNumber();
		c.countPrime();
		System.out.println("count of prime numbers:" +count);
		
		
	}

}
