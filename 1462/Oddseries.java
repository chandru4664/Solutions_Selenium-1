package com.htc.corejava;


public class Oddseries {
	

	public static void main(String args[]) {


		int n=20;
		
     oddseries(n);
     System.out.println();
	 oneby(n);
		
		
	}

	private static void oneby(int n) {
		for (int i=1;i<=n;i++){
			System.out.print("1/" + i + ", ");
		}
	}

	private static void oddseries(int n) {
		int counter = 0;

		for (int i=1;i<=n;i++){

			if(i%2==1) 	{
				counter++;

				if(counter%2==0) {
					System.out.print(i * -1 +", ");
				}

				else {
					System.out.print(i+", ");
				}

			}

		}
	}

}
