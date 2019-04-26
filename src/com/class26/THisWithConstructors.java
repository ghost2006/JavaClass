package com.class26;

public class THisWithConstructors { 
	
	//this of () calls current class constructor--> constructor chaining- when we call one constructor from another one within the same class!!
	//this () we always use when we have overloaded constructors!!!!!

	public THisWithConstructors(){
		System.out.println("I am inside of constructor with no parameters");
		System.out.println("I have no parameters");
	}
	public THisWithConstructors(String str){
		this();
		System.out.println("I am inside of constructor with 1 parameter");
		System.out.println("I have a 1 String parameter "+str);
	}
	public THisWithConstructors(String str1, String str2){
		this(str1);// always should be our first statement in constructor!!!!!!
		System.out.println("I am inside of constructor with 2 parameters");
		System.out.println("I have 2 String parameters "+ str1+" "+str2);
		//this(str1)// can't do it-->cause should be first line in our constructor
	}
	
	 public static void main(String[] args) {
//	 THisWithConstructors obj1=new THisWithConstructors();
//   THisWithConstructors obj2=new THisWithConstructors("Hello");
	 THisWithConstructors obj3=new THisWithConstructors("Hello", "Bye");
		
		 /*I am inside of constructor with no parameters
		  * I have no parameters
		  * I am inside of constructor with 1 parameter
		  * I have a 1 String parameter Hello
		  * I am inside of constructor with 2 parameters
		  * I have 2 String parameters Hello bye */
	}
}
