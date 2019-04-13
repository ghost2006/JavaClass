package com.class22;

public class Child1 extends Parent{ //extends Parent Class--our inheritance

// Parent Class/Super Class/Based class
//Child Class/Sub Class/Derived Class
	
	
	String hairType="curly";
	public static void main(String[] args) {
		
		Child1 childObj=new Child1();
		childObj.sing(); // we can access all properties of class parent
		System.out.println("Child eyecolor "+childObj.eyeColor);
		System.out.println("Child hairolor "+childObj.hairColor);
		System.out.println("Child nos "+childObj.nose +" nose");
		
		
		Parent parentObject=new Parent();
		// parentObject.hairType--> not accessible in parent class
		//parentObject.playTennis()-->not accessible in parent class
	}
	
	public void playTennis() {
		 System.out.println("Child 1 can play tennis");
	 }
}
