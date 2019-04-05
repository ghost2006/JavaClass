package com.class16;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Create a method that will take 2 parameters as a numbers and prints which number is larger.
		Create a method that will take a number and prints whether the number is even or odd.
		Create a method that will print whether given String is palindrome or not. */
		
		Task obj= new Task();
		
		obj.findLargest(58, 85);
		
		obj.findIfNumberIsEvenOrOdd(8);
		
		obj.findIfNumberIsEvenOrOdd(11);
		obj.checkIfStringiIPalindrome("");
	}
	
	void findLargest(int a, int b) {
		if (a > b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");

		}
	}
	
	void findIfNumberIsEvenOrOdd(int a) {
		if (a%2==0) {
			System.out.println(a+ " is even");
		} else {
			System.out.println(a+ " is odd");
			
		}
	}
	
	void checkIfStringiIPalindrome(String str) {
		String reverseWord="";
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a word");
		String input= scan.nextLine();
		
		for (int i=input.length()-1; i>=0; i--){ 
			reverseWord+=input.charAt(i);
		}
		if (input.equalsIgnoreCase(reverseWord)){
			System.out.println("The word "+input+ " is a palindrome");
		}else {
			System.out.println("The word "+input+ " is not a palindrome");	
		}
	}
	

	}

