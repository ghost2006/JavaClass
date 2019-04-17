package com.class23;

public class Employee {
	
	public static String department="IT";
	
	int salary; //default variable
	
	protected int salary1;// protected
	
	
	public void getPaid(){
		System.out.println("Employee get's paid "+salary);
	}
	public static void work() {
		System.out.println("Employee works in "+department+ " department");
	}
	
	 static void workDEFAULT() {//default
		System.out.println("I am a default Method");
	}
	 protected static void workPROTECTED() {// protected
			System.out.println("I am a Protceted Method");
		}
}
