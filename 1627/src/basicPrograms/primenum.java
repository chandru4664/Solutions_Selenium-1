package basicPrograms;
import java.util.Scanner;
public class primenum {
	public static void main (String[] args){
	    int[] array = new int [5];
	    int count=0;
	    Scanner in = new Scanner (System.in);

	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<5; i++)
	    {
	        array[i] = in.nextInt();
	    }
	    //loop through the numbers one by one
	    for(int i=0; i<array.length; i++){
	        boolean isPrime = true;

	        //check to see if the numbers are prime
	        for (int j=2; j<array[i]; j++){

	            if(array[i]%j==0){
	                isPrime = false;
	                break;
	            }
	        }
	        //print the number
	        if(isPrime)

	            System.out.println(  "Prime numbers are:" +array[i]);
	        count= i;     
	        	    }
	    System.out.println("Prime number count in array:" + count);
	}
    
}