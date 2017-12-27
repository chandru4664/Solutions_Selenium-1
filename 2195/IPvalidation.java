package com.htc.ariweek1;

public class IPvalidation {

	String validateIPaddress(String ipAddress) {

		// 1.Length should be greater than 7 and less than 15
		String validationErrorMessage = "";
		boolean error = false;

		if (ipAddress == "") {

			validationErrorMessage = "Empty IP address";
		}
		System.out.println(ipAddress.length());
		if (ipAddress.length() < 7 || ipAddress.length() > 15 && !error) {
			validationErrorMessage = "Invalid Length . Please enter minimum 7 or maximum 15";
			error = true;
		}

		// 2. Should not start or end with dot(.)

		if ((ipAddress.startsWith(".") || (ipAddress.endsWith("."))) && !error) {
			validationErrorMessage = "ip Address should not starts/ends with dot(.)";
			error = true;
		}

		// 3. Should have 3 exact dots(.)
		char[] ch = ipAddress.toCharArray();
		int i = 0;
		for (char c : ch) {
			if (c == '.') {
				i++;
			}
		}

		if (i != 3 && !error) {
			validationErrorMessage = "ip Address should have 3 dots(.) ";
			error = true;
		}

		// 4. Should not have consecutive dots
		if (ipAddress.contains("..") && !error) {
			validationErrorMessage = "ip Address should not have dot(.) in consecutive position";
			error = true;
		}

		// 5. should not contain spl or alpha char

		if (i == 3 && !error) {
			for (char c : ch) {

				if (c != '.') {
					if (!(c >= '0' && c <= '9')) {
						validationErrorMessage = "ip Address should not have alpha or spl characters";
						error = true;
						break;
					}
				}
			}
		}

		// 5. should not contain spl or alpha char using char sequence
		CharSequence cs = "0123456789.";
		System.out.println(error);
		System.out.println(ipAddress);
		System.out.println(ipAddress.contains(cs));
		/*
		 * if (!ipAddress.contains(cs)&&!error) { // System.out.println("in cs");
		 * validationErrorMessage =
		 * "ip Address should not have alpha or spl characters"; error = true; }
		 * 
		 */
		return validationErrorMessage;
	}

}
