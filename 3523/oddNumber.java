package htc.javatraining.classwork; 
public class oddNumber { 
 

	public static void main(String[] args) { 


 		System.out.println(); 
		int countno=0; 
		System.out.print("input is ="); 
		int a[]=new int[50]; 
		for (int k=0;k<50;k++)  
		{ 
			a[k] = k+1; 
 			System.out.print(a[k]); 
			System.out.print(','); 
		} 
		System.out.println(); 
		for (int k=1;k<50;k=k+2)  
		{ 
			if((a[k]%3)==0)  
 			{ 
 				System.out.print(a[k]); 
 				countno=countno+1; 
				System.out.print(','); 
 			} 
			 
 		} 
 		System.out.print(countno+"is the total number of odd numbers divisible by 3 in even position"); 
 		 
 	} 
 
 
 } 
