package com.htc.ariweek1;

public class KeyValue {

	public String findKeyValue(String laptopName) {

		String[][] laptopList = new String[5][5];
		
		
		String laptopPrice = "";
		// laptopList = new String[5][5];

		laptopList[0][0] = "DELL";
		laptopList[0][1] = "197.99";
		laptopList[1][0] = "LENOVA";
		laptopList[1][1] = "80.99";
		laptopList[2][0] = "SONY";
		laptopList[2][1] = "120.99";
		laptopList[3][0] = "HP";
		laptopList[3][1] = "70.00";
		laptopList[4][0] = "MAC";
		laptopList[4][1] = "149.99";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {

				if (laptopList[i][0].equals(laptopName)) {

					laptopPrice = laptopList[i][1];

				}
			}
		}

		return laptopPrice;
	}
}