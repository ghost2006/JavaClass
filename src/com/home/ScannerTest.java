package com.home;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
//		scanner.nextInt();   !!!!!!! - Enter number
//		scanner.nextLine();  !!!!!!! - Enter String
		
		Scanner scanner=new Scanner(System.in);
		
		
		int number=scanner.nextInt();
		int number1=scanner.nextInt();
		System.out.println(number+number1 + " <- sum of two numbers");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println(name + " has been entered");
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Checking if number is even");
		System.out.println("enter your number:");
		int n=sc2.nextInt();
		if (n%2==0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");	
		}
		
		
		
		
	}
}
