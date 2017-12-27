package htc.training.core;

/* Write a function validateIPaddress that accepts an ipAddress (string) as an input    
 and does the following validations(Strings & functions) 
(a) Length should be minimum 7 and maximum 15 
(b) Should not start and end with dot 
(c) Should have exactly 3 dots 
(d) Dots should not be in consecutive positions. 
(e) Should not permit alphabets and special characters package htc.taining;*/

public class IPValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean decisionIP;
		IPAddressValidator ival= new IPAddressValidator();
		decisionIP = ival.validate("10.36.37.77");
		System.out.println( "IP Address Value : " + decisionIP);		
	}

}
