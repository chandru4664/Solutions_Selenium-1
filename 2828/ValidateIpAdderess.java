package example1;

import java.util.Scanner;

public class ValidateIpAdderess {
	public int count = 0;
	public int count1 = 0;
	public int count2=0;
	public void validation(String IPaddress)
	{
		int i = IPaddress.length();
		int p = i-1;
		if (i>6 && i<16)
		{
			if(!IPaddress.startsWith(".") && !IPaddress.endsWith("."))
			{
				for (int y=0;y<p+1;y++)
				{
					if (IPaddress.charAt(y)=='.')
					{
						count = count + 1;
					}
					
					if (IPaddress.charAt(y) =='.' && IPaddress.charAt(y+1)=='.')
					{
						count2 = count2 + 1;
						
					}
					//System.out.println(IPaddress.charAt(y));
					char c = IPaddress.charAt(y);
					int x = (int) c;
					//System.out.print(x);
					 if (x>47 || x<57)
					 {
						count1 = count1 + 1;
					 }
					 else if (x != 46)
					 {
						 count1 = count1 + 1;
					 }
					 
				}
				if (count!=3)
				{
					System.out.println("Ip Addess should contain exactly three dots");
				}
				else if(count2>=1)
				{
					System.out.println("dots should not be in consecutive position");
				}				
				else if (count1==i)
				 {
					System.out.println("IP address does not support alphabets/special characters");
		 		 }
				else
				{
					System.out.println("IP address is valid");
				}
			
		    }
			else
			{
				System.out.println("The IP Address should not stats/ends with dot");
			}
		}	
		else
		{
			System.out.println("The length of the IP Address should be between 7 and 15 charactes");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner exp = new Scanner(System.in);
		System.out.println("enter Ip address");
		String address = exp.nextLine();
		exp.close();
		ValidateIpAdderess xyz = new ValidateIpAdderess();
		xyz.validation(address);
		

	}

}
