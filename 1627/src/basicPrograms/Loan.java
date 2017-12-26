package basicPrograms;
import java.util.Scanner;

public class Loan {
	
	   public static void main(String[] args) {
		   int aprvlAmt;
		   Scanner userinput = new Scanner(System.in);
		   System.out.println("Are you a permanent employee? Use Yes or No");
		   String empType = userinput.nextLine();
		   System.out.println("are you Married? Use Yes or No");
		   String martStatus = userinput.nextLine();
		   System.out.println("how many years of experience?");
		   int expYears= userinput.nextInt();
		   userinput.close();
		   aprvlAmt = logiccheck(empType, martStatus, expYears);
		   System.out.print("loan approved is: ");
		   System.out.println(aprvlAmt);
	   }
	   public static int logiccheck(String empTypes, String marStatus, int exp){
		   int amt = 0;
		    
		   if (empTypes.equals("yes")){
			   if (marStatus.equals("yes")){
				   if (exp >= 30){
						   amt = 600000;
				   }
				   else
					   amt =  350000;
			   }
			   else if (marStatus.equals("no")){
				   if (exp >= 30){
					   amt = 500000;
				   }
				   else 
					   amt = 250000;
			   }		   
		   }
		   else if (empTypes.equals("no")){
			   amt = 100000;
		   }
		return amt;
	   }
	}
