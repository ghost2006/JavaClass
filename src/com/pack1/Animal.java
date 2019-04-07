package com.pack1;

public class Animal {
	/*  Create a class call Animal have properties like breed, weight, age, name and methods line canBark,isWild
	 * make the name variable static
	 * Create another class called Application from this application class 
	 * create 3 different instances/objects of it and print the properties and functions/methods */
	
	String breed="Labrador";
	int age=3;
	int weight=100;

	static String name = "Lucky";

	boolean canBark() {
		return true;
	}

	static boolean isWild() {
		return false;
	}

}
