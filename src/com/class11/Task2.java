package com.class11;

public class Task2 {

	public static void main(String[] args) {
		//1. Create an arrays of cars: americ; german, korean,italian. then retrieve all values.

	String [][] cars = { {"Ford", "Chevrolet", "Tesla"},
				   {"BMW", "Mercedes"},
				   {"Hyudai", "Daewoo", "Kia"},
				   {"Ferrari", "Alfa Romeo", "Maserati"}	};
		
		for (int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		//2.  Create an array of countries: north american, european countries, asian, african. Then print all of them.
		 String [][] countries= {{"Mexico", "Canada"},
				 {"Spain", "Italy", "German", "Netherlands"},
				 {"China", "Korea", "Japan", "Vietnam"},
				 {"Kenya", "Egypt", "Nigeria", "Namibia"} };
		
		for (int i=0; i<countries.length; i++) {
			for (int j=0; j<countries[i].length;j++) {
				System.out.print(countries[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
