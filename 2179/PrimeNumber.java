package domhtc.employee.eligibility;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int[] numbers  = new int[] {1,3,4,5,6,7};
		for(int i=0; i < numbers.length; i++)
			if(numbers[i]%2 == 0) 
				System.out.println(numbers[i] + " is even number.");
			 else if(numbers[i]%3 ==0)
							System.out.println(numbers[i] + " is odd number.");
			
			else 
				System.out.println(numbers[i] + " is prime number.");
			
				
			}
		}
	