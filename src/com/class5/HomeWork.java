package com.class5;

import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {

	/*Write a program to find largest of three double values using if-else..if provided by a user 
	 * (numbers must be distinct) */
	
	Scanner inp = new Scanner(System.in);
	System.out.println("Please enter amazon's price");
	double amazon = inp.nextDouble();
	System.out.println("Please enter ebay's price");
	double ebay = inp.nextDouble();
	System.out.println("Please enter target's price");
	double target = inp.nextDouble();
	
	if (amazon>ebay && amazon>target) {
		System.out.println("The most expensive price is "+amazon);
	} else if (ebay>target && ebay>amazon) {
		System.out.println("The most expensive price is "+ebay);
	} else {
		System.out.println("The most expensive price is "+target);
	}
	}
	
}
