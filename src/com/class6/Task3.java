package com.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
	char grade;
	Scanner inp= new Scanner(System.in);
	String explenation;
    System.out.println("Please enter your grade");
	grade= inp.next().charAt(0);
		
     switch (grade) {
     case ('A'):
    	 explenation="Excellent";
     break;
     case ('B'):
    	 explenation="Good";
     break;
     case ('C'):
    	 explenation="Avarage";
     break;
     case ('D'):
    	 explenation="Bad";
     break;
     default:
    	 explenation="Not acceptable";
     }
	System.out.println("Your grade is "+explenation);
	}
}