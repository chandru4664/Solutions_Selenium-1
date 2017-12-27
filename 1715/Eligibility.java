package htc.training.core;

public class Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		System.out.println(
				" A married temporary job holder eligible loan amount is:" + emp.getEligibility(true, "temp", 25));
		System.out.println(
				" An unmarried temporary job holder eligible loan amount is:" + emp.getEligibility(false, "temp", 25));
		System.out.println(" A temporary job holder with 30 years of service eligible loan amount is: "
				+ emp.getEligibility(true, "temp", 30));
		System.out.println(" A married permanent job holder with 30 years of service eligible loan amount is: "
				+ emp.getEligibility(true, "perm", 30));
		System.out.println(" A married permanent job holder with 25 years of service eligible loan amount is: "
				+ emp.getEligibility(true, "perm", 25));
		System.out.println(" An unmarried permanent job holder with 30 years service eligible loan amount is:"
				+ emp.getEligibility(false, "perm", 30));
		System.out.println(" An unmarried permanent job holder with 25 years service eligible loan amount is: "
				+ emp.getEligibility(false, "perm", 25));
	}

}
