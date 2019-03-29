package com.home;

public class Task3 {

	public static void main(String[] args) {
		
		// !!!!!!!!! IN ODRDER TO COMMENT ONE LINE - PUT CURSON ON THAT LINE AND HIT CTRL + / !!!!!!!!!!
		
		int a = 2;
		int b = 6;
		int c = 9;
		int d = 20;
		if (a < b) {
			System.out.println("Less than B");
			if(a < c) {
				System.out.println("Less than C");
				if(a < d) {
					System.out.println("Less than D");
				}else {
					System.out.println("Not Less than "); // Nested if statements when one if statement inside another one 
				}
			}else {
				System.out.println("Not Less than C");				
			}
		}else {
			System.out.println("Ne Ok");
		}		
		
		if(a < b) {
			System.out.println("A lees B");
			System.out.println("Cool");
			System.out.println("Good");
		}
		
		if(a > b)
			System.out.println("A lees B"); // If only one statement - we can skip curly brackets !!!!!!
	}
}
