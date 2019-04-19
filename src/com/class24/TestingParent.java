package com.class24;

public class TestingParent {

	public static void main(String[] args) {
		
	
	String a;
	
	a="10";
	
	double d=12;
	
	Parent parent = new Parent();// by creating obj calling a constructor, reference variable "parent" type of Parent.
	parent.love();
	parent.work();
	
	Child child =new Child();
	child.love();
	child.cry();
	
	//type casting (can work with obj and variables)
	Parent obj=new Child(); //created an obj of child class and gave the reference to the parent class --> it's type casting
	//we can create an object of child class and assign it to the reference variable of type parent
	
	obj.work();// parent work --> accessing only parent's class methods by using parent's reference, and can't access child's methods
	obj.love();//Child love  BUT overriding m we are getting from the child class
	
	//obj.cry();// not accessible -- only the methods and variables available to that reference type are callable on the obj
 	
	//Child obj1=new Parent(); not possible to put bigger thing in a smaller box, we lost access to our specific methods,but they are still existing
}
}