package com.home;

public class Student extends Person{
	public int grade;
	
	public Student(String name, String lastName, int age, int grade) {
		 super(name, lastName, age);
		 this.grade=grade;
		 System.out.println(name+" "+lastName+" "+age+" "+grade);// we don't need here super! cause we don't have in child class the same name variables as in Parent!
	}
}
