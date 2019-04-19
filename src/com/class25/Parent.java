package com.class25;

public class Parent {

	String str;
	
	Parent(){
		System.out.println("I am a parent constructor");
	}
}


class Child extends Parent{
	int num;
	
//	Parent(){ // parameter should have the same name as class--> can't override the constructor; 
//		System.out.println("I am a child constructor");
//	}
	Child (){ //  constructors can't be inherited
		System.out.println("I am a child constructor");
	}
	
	
}