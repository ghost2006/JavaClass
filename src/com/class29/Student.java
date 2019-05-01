package com.class29;

public class Student {
	
	private  String name; // to protect variables --> declare private & create methods through which will get them (getters & setters)
	 private int age;
	 
	 //we are protecting our data, using abstract and encapsulation in security purposes
	 
	 //create setters to set the value
	 public void setName(String name) {
		 if (!name.isEmpty()) { //using for restriction
		 this.name=name;
	  }
}
	 public void setAge(int age) {
		 if (age>=18) {
		 this.age=age;
	 }
}	 
	 
	 //provide methods to get/return the values of variables
	 public String getName() {
		 return name;
	 }
	 public int getage() {
		 return age;
	 }
}
