package com.home;

import java.util.Scanner;

public class Task1 {
public static void main (String []args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter number:");
	int number=sc.nextInt();
	if (number%2==0) {
		System.out.println("The number is divideble 2");
	} else if (number%2==0) {
		System.out.println("Number is divideble 3");
	} else if (number%4==0) {
		System.out.println("Number is divideble 4");
	} else if (number%5==0) {
		System.out.println("Number is divideble 5");
	} else {
		System.out.println("I don't know what you mean");
}
	
}
}
