package domhtc.employee.eligibility;

public class ValidateIpAddress {
	
	public String i;
			
	public static void main(String[] args) {
	
		String i = "11.123.4567";
		boolean result;
		
		result = (i > 7) && (i < 15);
		System.out.println(result);
		
		
	}
}
