package htc.adnan.corejava;

public class ArrayOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int odd[] = {1,3,5,7,9,11,13,15,17};
		int total = 0 ;
		System.out.println("Here is the position of array and its values: ");
		for(int i=0;i<odd.length;i++)
		{
			if(i%2!=0 && odd[i] %3 == 0)
			{
			System.out.println(i+" "+odd[i]);
			total = total + odd[i];
			}
			
		}
		System.out.println("Here is the Total Vlaue of divisible by 3:  "+total);
	}

}
