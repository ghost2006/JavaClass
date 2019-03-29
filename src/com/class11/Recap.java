package com.class11;
public class Recap {
	public static void main(String[] args) {
		// let's create an array of names  that will hold 5 elements and retrieve all from it

		String [] names=new String[7]; //creating an array using new keyword
		names [0]="Asel";
		names [1]="Awet";
		names [2]="Arif";
		names [3] ="Weqas";
		names [4]="Dzmitri";
		names [5]="Shiva"; //will get an runtime exception when trying to access to it
		names [6]="Sandesh";
		
		for (int i=0; i<names.length; i++) {
			System.out.println( names[i]);
		}
//2. creating an array using array literal
		String [] studentNames = {"Shaban", "Bilal", "Mehmet","Zaki", "Samir", "Frank"};
		System.out.println("-----------FOR LOOP-----------------");
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-----------ADVANCED LOOP-----------------");
// provide   data type/name    our array
		for (String student :studentNames) { // we'll take Shaban and assign to student-it takes each element and assign to our variable!!
			System.out.println(student);//we'll print each element from the beginning to the end of our loop in sequence(Shaban,Bilal...Frank)!
		
		}
		
	}
}
