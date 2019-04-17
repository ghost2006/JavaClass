package com.class23;

public class MainMethodOverloading {
	
	/* Can we overload a main Method?
	 * YES
	    * by changing the  # of parameters
	    * by changing the dataType  of parameters*/


	public static void main(String[] args) {
		System.out.println("i am a maim Method with string argument array"); 
	}
	
	public static void main() {
		System.out.println("i am a maim Method with no parameters"); 	
}
	
	public static void main(String str) {
		System.out.println("i am a maim Method with 1 string parameter"); 
	}
	
	public static void main(int a) {
		System.out.println("i am a maim Method with 1 int parameter"); 
	}
	
}