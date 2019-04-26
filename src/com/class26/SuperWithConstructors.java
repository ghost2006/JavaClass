package com.class26;

public class SuperWithConstructors {

	 SuperWithConstructors(){
		 System.out.println("I am a parent constructor without parameters");
	 }

	 SuperWithConstructors(String str){//overloading
		 System.out.println("I am a parent constructor with 1 parametes");
	 }
	 
}
class ChildOfSuperWithConstructors extends SuperWithConstructors{
	 
	ChildOfSuperWithConstructors(){
		//super(); //compiler added super(); automatically!implicitly! always happens by default at the back but we don't see it!!!!
		//super(); error--always has to be the 1st line in constructor!!!!!!
		super("Hello");//we have to call it explicitly,cause we have a parameter
		 System.out.println("I am a child constructor without parameters");
	 }
}