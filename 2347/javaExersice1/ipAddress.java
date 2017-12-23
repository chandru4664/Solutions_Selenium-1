package testJava;

import java.util.Scanner;
import java.util.*;
public class ipAddress {
	public static void main(String[] args)
	{
		System.out.print("Input IP no please");
		Scanner scan = new Scanner(System.in);
		String numIp= scan.next();
			scan.close();
			if(Ipfun(numIp))
			{
				System.out.println("Valid IP");
			}
			else{
				System.out.println("Invalid IP");
			}
			
	}
	public static boolean Ipfun(String numIp)
	{
		if ((numIp.length()>=7)&&(numIp.length()<=11))
		{
		if ((numIp.charAt(0)!='.')&&(numIp.charAt(numIp.length()-1)!='.'))
		{
			if(numIp.contains("..")==false)
			{
				int count =0;
				int counts=0;
				for(int i = 0; i < numIp.length(); i++) 
				{
				    if (numIp.charAt(i) == '.')
				    {
				        count++;
				        
				    }else if(Character.isLetter(numIp.charAt(i)))
				    {
				    	counts++;
				    }
				}
				if (count==3&&counts==0)
					{
						//System.out.println(" IP");
					 return true;
					}else
					{
						//System.out.println("Invalid IP");
						return false;
					}
				
				
			}else
				{
				//System.out.println("Invalid IP");
				return false;
				}
		}else
		{
			//System.out.println("Invalid IP");
			return false;
		}
		}else 
		{
		return false;
		}
	}

}
