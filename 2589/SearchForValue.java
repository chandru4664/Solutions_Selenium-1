package com.htc.javaexercise.exercise;

public class SearchForValue {
	
	static int[] numbers= {2,3,9,5,12,5,6,5,15,5,21,5,18};
	static int y;
	static int i;
	
	public void searchForValue(int x) {
		for(i=0;i<numbers.length;i++) {
			if (numbers[i]==x) {			
			int	a=i;
			y=numbers[i];
				System.out.println(x+ " Value exsist at array location: " +a);
			}
		}
		if(x!=y) {
			
				System.out.println("Value not available");
			
	
		}
		
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchForValue value=new SearchForValue();
		
		value.searchForValue(9);
				
		

	}

	}


