package com.pack1;

public class Minimum {

	/*Create a class Called Minimum within it crate a method called minOfValues and
	 * make it static From your previous Application class call the method and pass
	 * an array argument and print out the result { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	 * int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; */

	static int minOfValues(int[] array) { //minOfValues- static
		int min = 0;
		for (int y : array) {
			if (y < min) {
				min = y;
			}
		}
		return min; //min-local variable
	}
 void print() {
	 System.out.println("We have to create the obj if M isn't static!");
 }
	
	
}
