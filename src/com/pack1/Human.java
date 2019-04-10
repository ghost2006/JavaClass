package com.pack1;

public class Human {
	
	static String eyeColour="Brown"; //static variable, only one single copy among all objects
	int height=6; //instance variables. every object'll get the copy of each of them
	int weight=180;
	String gender="F";
	
	String programmingLanguage="Java"; //instance variable
	
	void speak() {
		String language="English";  // local variable, it's only available inside of the current M and cannot be used in another one
		System.out.println("Humans can speak"+ language);
	}
	void coding() {
		System.out.println("Syntax can code"+programmingLanguage);
	}
	void print() {
		System.out.println(eyeColour);
	
	}
//	public static void main(String [] args) {
//		Human person =new Human();
//		
//		// person.eyeColour="pink";
//		
//			System.out.println(person.eyeColour);
//			System.out.println(person.height);
//			System.out.println(person.weight);
//			System.out.println(person.gender);
//	}
}
