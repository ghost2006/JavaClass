package com.home;

public class Student extends Person{
	public int grade;
	
	public Student(String name, String lastName, int age, int grade) {
		 super(name, lastName, age);
		 this.grade=grade;
		 System.out.println(super.name+" "+super.lastName+" "+super.age+" "+grade);
	}
}
