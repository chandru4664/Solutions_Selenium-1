package example1;

public class ArrayExercise1 {
	public int count ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExercise1 ae = new ArrayExercise1();
		int arr1[]= {10,15,12,18,15,17};
		int i = arr1.length;
		
		for (int j=0;j<i;j=j+2)
		{
			if(arr1[j]%2 != 0)
			{
				if(arr1[j]%3 == 0)
				{
					ae.count = ae.count +1;
				}
		}
			
		}
		System.out.println(ae.count);
		}
		
	}


