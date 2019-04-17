package com.class24;

public class Employee {

	/* M Overriding - the same name method in 2 different classes (Parent-Child)
	 * Child implements only his own method without affecting Parents class and other child's classes
	 * it exists only when we have the inheritance!!! 
	 * in overloading Method signature should be the same (name and parameters!!!)*/
	
	public void getPaid() {// Overriden Method
		System.out.println("Employee gets paid");
	}
}
