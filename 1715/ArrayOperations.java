package htc.training.core;

/*Consider an array and perform the below operations 
(a) Count the number of odd numbers divisible by 3 in even positions.
(b) Search for a key value in array and print it is available in the array or not. 
(c) Count the number of prime numbers. */
public class ArrayOperations {

	public static void main(String[] args) {
		// array of 10 numbers
		int numbers[] = new int[] { 33, 15, 53, 54, 27, 65, 63, 93, 43, 99 };
		int oddNumberCount = 0;
		int totalPrimeCount=0;
		int kount = 0;
		System.out.println("Problem-A : Odd numbers from give numbers array divisibile by  3 in even poision are :");
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			
			if ((numbers[i] % 2 != 0) && (numbers[i] % 3 == 0)) {

				if (i % 2 == 0) {
					System.out.println(numbers[i]);
					oddNumberCount = oddNumberCount + 1;
				}
			}

		}
		System.out.println("Problem-A : Number of odd numbers divisible by 3 in even positions of give numbers array are:" + oddNumberCount);
		System.out.println("====================================================");
	
		
		int key = 63; 
		for (int i = 1; i < 10; i++) {
			if (numbers[i]==key)
				System.out.println("Problem-B : "+key+"is avaialbe in the number array list");
				
		}
		System.out.println("=======================================================");
		
		//System.out.println("sureee");
		for (int i = 1; i < 10; i++) {
			//System.out.println("sureee1");
		//	System.out.println("b.The number of prime numbers are: " + numbers[i]);
			kount=0;
			for (int j = i; j >= 1; j--) {
				//System.out.println("sureee2");
				if ((i%j) == 0)
					kount = kount + 1;
			}
		//	System.out.println("sureee3"+kount);
			if (kount == 2) {
				System.out.println( i);
				totalPrimeCount = 1 + totalPrimeCount;
				kount=0;
			}
			
		}
		System.out.println("Problem-C : Total Prime Numbers are :"+totalPrimeCount);
		System.out.println("====================================================");

	}

}
