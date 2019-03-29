package com.class4;

public class NestedIf {
	public static void main(String[] args) {
	
		//declare variable for gpa and having a diploma
		//if user has a diploma-->> congratulations--> if gpa higher 3.5-> hire person
		//else do not hire.
		
		
		double gpa=3.9;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {     //we nested it inside of first if 
				System.out.println("You are hired");
			}else {
				System.out.println("We can not hire you");
			}
		} else {
			System.out.println("Please get your degree");
		}
}
}
