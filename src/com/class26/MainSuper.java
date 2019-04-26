package com.class26;

public class MainSuper {
	 /* create a base class with the name of MainSuper
     * create 1 constructor with 1 parameter and print This is parent with 1 parameter.
     * create 1 constructor with 2 parameter and print This is parent with 2 parameter.
     *
     * then create a child class called ChildSuper
     in child class create 1 constructor with 1 parameter and print this is from child with 1 parameter
     in child class create 1 constructor with 2 parameter and print this is from child with 2 parameter and in this i want you to find which super to use for the following
     *
     * i want you to create a main method in ChildSuper
     * if i type in 2 parameters with calling the ChildSuper class in my main i want both
     * constructor with 2 parameter from parent and constructor with 2 parameter from child to appear
     *
     * Hint, i should only see one instantiation of ChildSuper with 2 parameters
     * And, i should only see one instantiation of ChildSuper with 1 parameter*/
	
	int a=1;
	String str="burger";
	char b='b';
	
	MainSuper(){
		System.out.println("This is parent without any parameter");
	}
	MainSuper(String str){
		System.out.println("This is parent with 1 parameter");
	}
	MainSuper(String str, String str2){
		System.out.println("This is parent with 2 parameters");
    }
	public void getVariables() {
		System.out.println("The values are "+a+" "+str+" "+b);
	}

}

