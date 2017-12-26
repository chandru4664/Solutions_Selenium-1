package basicPrograms;

public class Oddvalue {
	public static void main (String [] arg) {
		int a [] =new int[]{1,3,9,15,21,24,33};	
	for (int i=0;i <a.length;i++) {
       				
			if (a[i]%2 !=0 && a[i] % 3 ==0 && i % 2 == 0) {				
				System.out.println("odd number in even position:" +a[i]);
			  }

			else {
			System.out.println("condition not satified:" +a[i]);
			    }
	}
	}
}

