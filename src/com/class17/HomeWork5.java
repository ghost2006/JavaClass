package com.class17;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		/* 5. Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!". */
		
		Scanner scan=new Scanner(System.in);
		int secretNumber=8;
		
		for( int i=1; i<20; i++) {
			System.out.println("Please enter a secret number between 1 to 20");
			int number=scan.nextInt();
				if (number>secretNumber) {
					System.out.println("Your number is too large");
				} else if (number<secretNumber) {
					System.out.println("Your number is too small");
				} else {
					System.out.println("Congratulations!!. You got it!");
					break;
			}
		}
		
	/* int secret,userNumber;
	 * secret=13;
	 * do{
	 	System.out.println("Please enter a secret number between 1 to 20");
			userNumber=scan.nextInt();
			if (userNumber<secret) {
					System.out.println("Your number is too small");
			} else if (number>secretNumber) {
					System.out.println("Your number is too large");
	 * 	}
	 * }while (secret!=userNumber);
	 *System.out.println("Congratulations!!. You got it!");*/
		
		
		
	}

}
