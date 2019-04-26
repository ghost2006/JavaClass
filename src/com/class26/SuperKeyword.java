package com.class26;

public class SuperKeyword {

	String name="John";
	
	public void sayName() {
		System.out.println("Parent name is "+name);
	}
}
class ChildOfSuperKeyword extends SuperKeyword{
	String name= "Michael";
	
	public void callingMethods() {
		sayName();//compiler will add by default 'this'!!!-->will go to child method sayName
		super.sayName();//will refer to parent method-sayName
	}
	
	public void sayName() {
		System.out.println("Parent name is "+super.name);// only if we have the same name of variables in both classes, if they are diff-not gonna use super.
		System.out.println("Child name is "+name);
	}
}