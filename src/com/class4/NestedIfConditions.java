package com.class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		// write a program to check work eligibility
		//if user is younger < than 16--> he is not allowed to work
		//otherwise __>allow to work. if user than younger 64 -->go to work. otherwise--> enjoy your life
		
		int age=65;
		int eligibleAge=16;
		int retirementAge=64;
		
		if(age<eligibleAge) {
			System.out.println("You too young, no work for you");
		} else {
			System.out.println("You are eligible to work");
			if (age<retirementAge) {
			System.out.println("Go work hard");
			} else {
			System.out.println("Please enjoy your life.You do need to work");
			}
		}
	}

}
