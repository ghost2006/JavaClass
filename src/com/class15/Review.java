package com.class15; //starts with upper case

import java.util.Scanner;

public class Review { //everything we have inside of the class{} but outside of the Method we call Global or class level!
	// methods and variables are member of the class
	// Global - location where we create our instances 
	String eyes;// data members
	String hair;
	String nose;
	String shirt;

	public static void main(String[] args) { //(String []  args- is a method signature!-without it we won't run our code,we can only read it!)
		// Local -inside of method
		String ear = "left ";

		Review weqas = new Review(); //creating an instance! Weqas here is an object and a variable
		weqas.eyes = "blue";
		weqas.hair = "blue";
		weqas.nose = "brown";
		weqas.shirt = "gray";
		weqas.humanEyes(); // we calling a method here!
		weqas.noReturn();
		Review weqas1 = new Review();
		weqas1.eyes = "green";

		System.out.println(weqas1.eyes);
		weqas.scannerFirstName();
		weqas.noReturn();
		weqas.scannerInt();
		weqas.reverseString();
		// weqas.vowelCountWithLoop();
		weqas.vowelCountWithReplaceAll();
	}

	void humanEyes() { //starts with lower case // we can't declare one method inside of another one
		Review weqas = new Review();
		weqas.eyes = "red";
		System.out.println(weqas.eyes);
	}

	void noReturn() { //void m don't return anything!!!!
		System.out.println("I do not have a return type");
	}

	void scannerFirstName() {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	void scannerInt() {
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
	}

	void reverseString() {
		String str = "seigolonhceT xatnyS";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			System.out.println(reverse);
		}
	}

	// System.out.println(reverse);
	void vowelCountWithLoop() {
		String weqas = "hello world my name Is wEqas";
		char[] w = weqas.toCharArray();
		char empty;
		for (int i = 0; i <= w.length - 1; i++) {
			if (w[i] == 'a' || w[i] == 'A' || w[i] == 'e' || w[i] == 'E' || w[i] == 'i' || w[i] == 'I' || w[i] == 'o'
					|| w[i] == 'O' || w[i] == 'u' || w[i] == 'U') {
				empty = w[i];
				System.out.print(empty + ",");
			}
		}
	}

	void vowelCountWithReplaceAll() {
		String weqas = "hello world my name Is wEqas";
		String replace = weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
		// String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);
	}
}