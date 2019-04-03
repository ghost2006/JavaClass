package com.class14;

import java.util.Scanner;

public class Iq7 {

	public static void main(String[] args) {
		// 7. Write a java program to check whether a given number is prime or not	
/* PrimeNuber should meet 2 conditions: divisible by 1 & byItself ONLY
		 * 2,3,5,7,11,13,17,19,23,29 */
		
		 int number;
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter any number");
		    number = scanner.nextInt();//15
		    boolean prime = true;
		    for (int i=2; i<number;i++) {// we starts from 2-->i=2!!!
		    	if (number%i!=0) { //we want to cut the condition that our number/itself or /by 1. 
		    	}else {
		    		prime = false;
		    		 System.out.println("the number is not a prime");
		    		break;
		    	}
		    }
		  if (prime) {
			  System.out.println("the number is a prime");
		  }
		
		
	
		
		
		
		
		

	}

}
