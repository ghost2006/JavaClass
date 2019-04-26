package com.class26;

public class Hello {
	
	/* Create a class called Hello
	    create 1 constructor with one parameter, create 1 constructor with two parameters
		create 1 constructor with three parameters
	  * i want you to use "this" key word and access those constructors pass values for each
	 but have one print statement for each constructor with one variable. make sure you use same data type */
	
	Hello(int a){
		this(8,9);
		System.out.println("Constructor with 1 parameter "+a);
	}
	Hello (int a, int b){
		this(1,11,0);
		System.out.println("Constructor with 2 parameters "+a+" "+b);
	}
	Hello (int a,int b, int c){
		System.out.println("Constructor with 3 parameters "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Hello obj=new Hello(1);
	}
}
