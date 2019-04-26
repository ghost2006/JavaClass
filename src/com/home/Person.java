package com.home;

public class Person {
	  public String name;
	  public String lastName;
	  public int age;
	  
	  public Person() {
	  }
	  
	  public Person(String name, String lastName, int age) {
		  this.name=name;
		  this.lastName=lastName;
		  this.age=age;
	  }
	  
	  public static void main(String[] args) {
		  
		  Employee emp=new Employee("Joe", "Smith", 30, 35000);
		  
		  Student st = new Student("Adam", "Smith", 15, 10);
		 
		  Retiree re = new Retiree("Frank", "Smith", 15, "tour");
	  }
}
