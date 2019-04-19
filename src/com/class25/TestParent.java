package com.class25;

public class TestParent {

	public static void main(String[] args) {

		Parent p = new Parent();
		
		System.out.println("-----Calling CHILD'S CONSTRUCTOR-----");

		Child c = new Child(); //I am a parent constructor AND I am a child constructor--> it will execute both constructors
//JVM Always executes first Parent class constructor and then only child's; first by default parent constructor will be created and executed
		
		c.str="hi";
	}
}
