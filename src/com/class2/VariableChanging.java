package com.class2;

public class VariableChanging {
	
	public static void main(String[] args) {
		//Values of variables can changed!

		String name = "John";
		String lastName = "Smith";
		lastName = "Johns";
		System.out.println(lastName);
		
		
		char grade = 'B';
		//char grade ='A' does not work!
		//creating a variable and assign the value
		grade ='A'; 
		
		System.out.println(grade);
		
		String city = "Wahington";
		//changing value of city from Washington to NY
		city = "New York"; // value of variable is changed 
		
		//printing value of city
		System.out.println(city);
		
	
}
	}
