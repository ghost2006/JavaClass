package com.class7;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/* not equal to 1.99
		 *Ask user to pay for a soda
		 *keep asking user to pay for soda until entered price is not equal to 1.99
		 *after user got a right amount print "Please enjoy your soda"*/
		
//		Scanner scan=new Scanner(System.in);
//		boolean payment=true;
//		while (payment) {
//			System.out.println("Please pay for soda!");
//			double price=scan.nextDouble();
//			if (price==1.99) {
//				payment=false;
//				System.out.println("Please enjoy your soda");
//			}
//		}
		//---------------------------------------------------------------------------------------------
//		Scanner scan=new Scanner(System.in);   //control+shift+o---> shortcut for IMPORT SCANNER!!!!!
//		double price;
//		price=scan.nextDouble(); 
//		
//		while (price!=1.99) {
//			System.out.println("Please pay for soda");
//			 price=scan.nextDouble();
//		}
//		System.out.println("Please enjoy your soda");
		//---------------------------------------------------------------------------------------------
		Scanner scan=new Scanner(System.in);   //control+shift+o---> shortcut for IMPORT SCANNER!!!!!
		double price;
		
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
		} while (price!=1.99);
		System.out.println("Please enjoy your soda");
	}
}