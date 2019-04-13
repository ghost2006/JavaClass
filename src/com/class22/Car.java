package com.class22;

public class Car {
	
	public static String make= "Toyota";
 	String color; // declaring instance variable
 	String model;
 	int doors;
 	boolean engine;
 	
 	Car(){ // can use with access modifiers
 		System.out.println("I am the constructor"); // constructor body
 		System.out.println("Hello from CONSTRUCTOR");// doesn't have any return type(void), access mod!!
 	}
 	
 	public static void main (String [] args) { //static means we can call our M spesifying the class name
 		
 		Car obj =new Car();  // Car() calling our constructor automatically when we creating the object!
 	// car - className; obj- reference obj/object name; = - assigning operator; new - keywords that creates an object
 	//Car() - constructor, special type of method or block of code!lives inside of the class and have the same name of the Class!
 		
 System.out.println(obj.color);// it will take a default value-null; our constructor will initialize the object and it will give the default values to all uninitialized global variables!
 System.out.println(obj.doors); // 0
 System.out.println(obj.engine);// false
 		hello(); //calling our static M	
 	}
 	
 	public static void hello() {
 		//before using local variable we have to initialize it
 		String name;
 		//System.out.println(name); we'll get the error
 		System.out.println(" I am A static hello method");
 	}
}
