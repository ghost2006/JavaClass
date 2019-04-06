package com.class17;
import java.util.Scanner;
public class HomeWork6 {

	public static void main(String[] args) {
		/* 6.Ask a user to input a leap year. 
		Give the user 10 chances to enter a correct leap year. As soon as the user enters the correct leap year exit the loop.
		if year is div by 400--> leap year;
		if year is div by 100--> not leap year;
		if year is div by 4-->a leap year;*/
		
//		Scanner scan=new Scanner(System.in);
//		int leapYear=2020;
//		
//	for (int i=1; i<10; i++) {
//		System.out.println("Please enter a leap year");
//		int year=scan.nextInt();
//			if (year==leapYear) {
//				break;
//		}
//	}
		int year=0;
		Scanner scan=new Scanner(System.in);
		
		for (int i=1; i<10; i++) {
			System.out.println("Please enter a leap year");	
			year=scan.nextInt();
			if (year%400==0) {
				System.out.println("The year is a leap");
				break;
			} else if (year%4==0 && year%100!=0){
				System.out.println("The year is a leap");
				break;
			} else {
				System.out.println("The year is not a leap");
			}
	
			
			
	}
	}
	}
