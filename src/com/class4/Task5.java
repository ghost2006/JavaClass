package com.class4;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
//		Write a program to ask user to enter numbers of worked years and annual salary. 
//		If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
//		Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		int num; 
		int reqNum;
		int sal;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter numbers of worked years");
		int number= scanner.nextInt();
		
		if (number>5) {
			System.out.println("you are eligible for bonus");
			System.out.println("Please enterthe amount of your saqlary");
			int salary= scanner.nextInt();
			if (salary>50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("you are not eligible for bonus");
		}
}
}
