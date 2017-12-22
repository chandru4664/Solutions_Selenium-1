package com.htc.javaexercise.exercise;

public class SeriesLogic {
	
public void seriesLogic() {
		
		int x=10;
		int y=0;
		int z=0;
		
     for(int i=0;i<x;i++) {
			
			if(i%2==0) {
			int a=y+1;
			System.out.print(a+",");
			
			y=y+4;
			}else {
				int b=z-3;
				System.out.print(b+",");
				
				z=z-4;
			}
	}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeriesLogic s=new SeriesLogic();
		s.seriesLogic();
		
		
	}

}

