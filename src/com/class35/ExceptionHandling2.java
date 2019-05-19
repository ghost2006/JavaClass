package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		int a=10; int b=0;
		
		try {
		System.out.println(a/b); // new ArithmeticEX --> will go to catch block--> we'll skip the code (line 13) inside try block
		System.out.println("code inside try block");
		
		} catch (ArithmeticException e) { //should be the exact class of an error or parent class
			System.out.println("code inside catch block");
		}
		System.out.println("the end of the program"); 
		/*	Beginning of the code
			code inside catch block
			the end of the program*/ 
		
        int a1=10; int b1=10;
        System.out.println("Beginning of the code");
        
		try {
		System.out.println(a1/b1);
		System.out.println("code inside try block");
		
		} catch (ArithmeticException e) {
			System.out.println("code inside catch block");
		}
		System.out.println("the end of the program"); 
	} /* Beginning of the code
		 1
		code inside try block
		the end of the program*/

}
