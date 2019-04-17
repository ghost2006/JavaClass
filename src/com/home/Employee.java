package com.home;

public class Employee extends Person {
	 public int salary;
	 
	 public Employee() {
	 }
	 
	 public Employee(String name, String lastName, int age, int salary) {
		 super(name, lastName, age);
		 this.salary=salary;
		 System.out.println(super.name+" "+super.lastName+" "+super.age+" "+this.salary);
	 }
	 
	 public void print() {
		 System.out.println(name+" "+lastName+" "+age+" "+salary);
	 }
}

