package htc.com.Training.Excercises;

//To Display employee eligibility on certain conditions.

public class empLoan {
	
	 public static void loanElig(String jStts, String mStts, int exp)
	  {
		
	  if(jStts=="perm" && mStts=="S" && exp>=30) {
	      System.out.println("Eligible Loan amount is:Rs.500,000");
		}
	  
	  if (jStts=="perm" && mStts=="M" && exp>=30) {
			System.out.println("Eligible Loan amount is:Rs.600,000");
	}
	  if(jStts=="perm" && mStts=="S" && exp<30) {
			System.out.println("Eligible Loan amount is:Rs.250,000");
		}
	  if (jStts=="perm" && mStts=="M" && exp<30)  {		
			System.out.println("Eligible Loan amount is:Rs.350,000");
		}
	  if(jStts=="temp") { 	  
		  	System.out.println("Loan amount is: Rs.100,000");
	  }
	} 
	 
	  public static void main (String []args){
		
		 loanElig("perm", "M", 36);
			
		}
	  }
