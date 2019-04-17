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
//		  Employee emp = new Employee();
//		  emp.name="Joe";
//		  emp.lastName="Smith";
//		  emp.age=30;
//		  emp.salary=35000;
//		  emp.print();
		  Student st = new Student("Adam", "Smith", 15, 10);
		  Retiree re = new Retiree("Frank", "Smith", 15, "tour");
	  }
}
