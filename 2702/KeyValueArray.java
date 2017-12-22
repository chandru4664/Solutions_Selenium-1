package htc.adnan.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class KeyValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] values = {"hello","world","java","testing","core","collections",
				"list","hash","Serialization"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Values to search in Java dictionary");
		String valueToSearch = input.nextLine();
		
		for(int i=0;i<values.length;i++)
		{
			if(valueToSearch.equals(values[i]))
			{
				System.out.println("Its present in the java dictionary");
				
			}		
		}
		
		}
		

	}

