package com.home;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// Write a program to find the factorial value of any number entered through the keyboard. 
		
		Scanner scan = new Scanner(System.in);
		
        int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = scan.nextInt();
       
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
		
		
	}
}
