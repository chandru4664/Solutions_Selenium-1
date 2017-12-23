package example1;

public class LoanEligibility {
	
	
	
	public int CalculateLoanamount(String MaritalStatus,String JobType,int Service) {
		 int Loan;
		if(JobType.equals("permanent"))
			if(MaritalStatus.equals("married"))
				if(Service>=30)
					Loan=600000;
				else
					Loan=350000;
			else
				if(Service>=30)
					Loan=500000;
				else
					Loan=250000;
		else
			Loan=100000;
			
		return Loan;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanEligibility le = new LoanEligibility();
		 int y;
		y=le.CalculateLoanamount("unmarried", "temporary", 30);
		System.out.println(y);
		y=le.CalculateLoanamount("married", "temporary", 30);
		System.out.println(y);
		y=le.CalculateLoanamount("unmarried", "permanent", 30);
		System.out.println(y);
		y=le.CalculateLoanamount("unmarried", "permanent", 25);
		System.out.println(y);
		y=le.CalculateLoanamount("married", "permanent", 25);
		System.out.println(y);
		y=le.CalculateLoanamount("married", "permanent", 45);
		System.out.println(y);
	}

}
