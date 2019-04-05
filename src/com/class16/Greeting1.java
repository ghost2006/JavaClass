package com.class16;

public class Greeting1 {

	public static void main(String[] args) {
	
		Greeting1 obj=new Greeting1 ();
		obj.askHowAreYou("Omar");//any code will be executable only inside of main M
		obj.askHowAreYou("!78&(*^");//passing arguments -the value that we passing - "!78&(*^" (they are called parameters "name" in M)
	}

	// void is a return type, askHowAreYou- M name--> M doesn't return any value
		void askHowAreYou(String name) {// we can't have the same name of M!!
			System.out.println("How are you "+name);
		}
		
		void askHowAreYou1(String name) { // any changeable values (name for ex) is better to pass to the parameters
			System.out.println("How are you "+name);
		}
		
		
		
		
		
		
}
