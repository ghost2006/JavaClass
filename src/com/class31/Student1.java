package com.class31;

public class Student1 {

	public int roll_num;
	public String name;
	public int age;
	
	Student1(int roll_num, String name, int age){
		this.roll_num=roll_num;
		this.name=name;
		this.age=age;
	}
	
	public void printAge() {
		System.out.println("The age of the student is "+ age);
	}
}
