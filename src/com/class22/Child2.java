package com.class22;

public class Child2 extends Parent{

	String eyeColor="green";
	String hairColor="yellow";
	
	public static void main(String[] args) {
		
		
		Child2 childObj=new Child2();
		childObj.sing();
		System.out.println(childObj.nose);
		childObj.swim();

	}
	public void swim() {
		 System.out.println("Child 2 can swim");
}
}