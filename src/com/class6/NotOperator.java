package com.class6;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		
		/* NOT operator -! exclamation mark ---> it will reverse our condition to the opposite one!!
		 * true---> false
		 * false---> true */
		
		boolean a=!true;
		System.out.println("The value of boolean variable is "+a);
		
		//if it's not snowing--> i'll come to the class, otherwise i'll stay at home
		boolean snow= true;
		
		if (!snow) {
			System.out.println("I will come to the class");
		}
		//
		int x=10;
		int y=20;
		if (!(x>y)) {
			System.out.println("Hello");
		}
		//
		int largest;
		Scanner inp=new Scanner (System.in);
		System.out.println("Please enter 3 distinc numbers");
		int	num1 =inp.nextInt();				
		int	num2 =inp.nextInt();				
		int	num3 =inp.nextInt();	
		
		if(!(num1==num2 && num1==num3 && num2==num3)) {
		if (num1>num2) {
				if (num1>num3) {
					largest=num1; // initializing our largest variable!
				}else {
					largest=num3;
				}
		}else {    //assuming that number2 >num1
				if(num2>num3) {
					largest=num2;
				} else {
					largest=num3;
	}
				}
		}else {
	System.out.println("All numbers are equal");
		largest=0;
}
		System.out.println("The largest number is "+largest);
		}
	}