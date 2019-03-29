package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {   //main ctrl+space+enter!!!!!!
	
		//take a number from a user and print it
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter any number");
		String myNumber=scanner.next();
		
		System.out.println("The number you enetred is "+myNumber);
	
		
		//ask user for the name and print good morning__
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Good morning "+name);
		
		
		
}
}
