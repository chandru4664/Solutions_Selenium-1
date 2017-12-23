package example1;

public class ArrayExercise2 {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 0;
			int arr2[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,19,14,20,22,23};
			int i = arr2.length;
			
			for (int j=0;j<i;j++)
			{
				int y = arr2[j];
				int count2=0;
				if (y!=1)
				{
				for(int z=2;z<=y;z++)
				{	
					
					if(y%z == 0)
					{
					count2 = count2 +1;
					}
				}			
				}
				if(count2==1)
				{
					//System.out.print(arr2[j]);
					count = count + 1;
				}
					
				}
			System.out.println(count);
	}

}
