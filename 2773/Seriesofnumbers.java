package htc.com.Training.Excercises;

//To Display series in 1,-3,5,-7...

public class Seriesofnumbers {

	public static void main(String[] args) {
        
		int a=-1;
		int n=1;
		
		for(int i=0;i<10;i++) {
			a=a+2;
			n+=1;
			
			if(n%2==0) {
			 System.out.println(a);
			}
			else {
			System.out.println(-a);	
			}
				
			}
	}
}

