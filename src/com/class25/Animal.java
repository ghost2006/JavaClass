package com.class25;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}	
	
class Puppy extends Animal{
	
//	public void whoAmI() { // instance method can't override static method
//		System.out.println("I am a puppy");
//	}
//	
}

class Monkey extends Animal{
	
	public static void whoAmI() { // static method will be hidden to the parent class!!!!! compile are not gonna give us an error
		System.out.println("I am a monkey");
	}	
}
