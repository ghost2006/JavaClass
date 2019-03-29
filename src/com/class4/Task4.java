package com.class4;

public class Task4 {
	public static void main(String[] args) {
		
	double mortRate=4.1;
	double allowedRate=4.5;
	int mortPrice=670000;
	int allowedPrice=200000;
	
			if (mortRate>allowedRate) {
				System.out.println("You cannot buy a house");
			} else {
				System.out.println("Congratulations! you'll get a house");
				if (mortPrice>=allowedPrice) {
					System.out.println("You can get a loan");
				} else {
					System.out.println("You can pay cash");
				}
			}
}
}
