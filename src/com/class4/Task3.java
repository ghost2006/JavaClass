package com.class4;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		int amount1, amount2=200000;
		
		Scanner amount = new Scanner(System.in);
		
		System.out.println("Please enter the amount of loan");
		amount1= amount.nextInt();
		if (amount1<amount2) {
			System.out.println("Congratulations! You'll get a loan");
		}else {
			System.out.println("Unfortunatelly, You can't get a loan");
		}
		
		///2
		Scanner age =new Scanner(System.in);
		int age1;
		
		System.out.println("Please enter your age");
		age1=age.nextInt();
		if (age1>=18) {
			System.out.println("Congratulations! You'll get a driver licence");
		} else {
			System.out.println("You'll get a lerners permit");
		}
		
		
}

}
