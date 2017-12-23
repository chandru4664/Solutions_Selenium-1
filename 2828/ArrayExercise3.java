package example1;

import java.util.Scanner;

public class ArrayExercise3 {
	public int Count  ;			
	public String[] arr = new String[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayExercise3 e = new ArrayExercise3();
				String SearchWord;
				e.arr[0]="a";
				e.arr[1]="e";
				e.arr[2]="i";
				e.arr[3]="o";
				e.arr[4]="u";
				int y = e.arr.length;		
				Scanner word = new Scanner(System.in);
				System.out.println("please enter the value:");
				SearchWord = word.next();
				word.close();
				for(int i=0;i<y;i++)
				{
					if(e.arr[i].equals(SearchWord))
					{
					e.Count = e.Count + 1;
					}
				}
				if (e.Count>=1)
				System.out.println("value is present in the string");
				else
				System.out.println("value is not present in the string");

	}

}
