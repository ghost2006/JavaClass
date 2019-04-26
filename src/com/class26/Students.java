package com.class26;

public class Students {

	String fullName;
	int age;
	
	//this is used to differentiate between local and instance variables if they have the same names
	public Students(String fullname, int age){
		this.fullName=fullname;
		this.age=age;
	}
	
	public void displayDeatils() {
		System.out.println("Student full name is "+fullName+ " and age= "+age);
	}
	public static void main(String[] args) {
		Students obj=new Students("John Snow",30);
		obj.displayDeatils();
		
		Students obj1=new Students("Mary Ann",18);
		obj1.displayDeatils();
	}
}
