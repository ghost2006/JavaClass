package com.class25;

public class FInalKeyword {

	public static final String NAME ="Syntax";// the variable name should be upper case(INTEGER MIN or MAX!
	
	public static void main(String[] args) {
		
		/* FINAL keyword can be used in 3 places/ways
		 * 1. with variables; we can not change final variables value--> call them constant
		 * 2. methods; we can't override final methods--> Prevent Overriding
		 * 3. classes; can't create a child class of a Final class,can't extend class--> Prevent Inheritance */
		
		final String str="Hello"; //constant or fixed --> variables values can't be changed
	 
		// str="John";
		
		// name="School"; --> compiler complain final values are not changeable
	}		
		
	public final void hello() {
		System.out.println("Hello from parent class");
	}
		
class ChildOfFinal extends FInalKeyword{
	
//	Can not override Final method
//	public final void hello() {
//		System.out.println("Hello from parent class");
//	}
		
	} 
	
	
	
	
	
	
	
	
	
}
