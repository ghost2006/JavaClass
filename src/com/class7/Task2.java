package com.class7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// prompt user to ask the name 3 times and print "You are doing great____"
		
		String name;
		Scanner scan=new Scanner (System.in);
		int a=1;
		
		while(a<=3) {
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("You are doing great "+name);
			a++;
		}
		
		
	}

}
