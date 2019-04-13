package com.class22;

public class Task2 {

	//Write a program  that will have a private default constructor class and create 2 objects of this class: 
	// 1 - inside same class; 2 - from outside the class.
	
	private Task2(){
		System.out.println("I am a private constructor");
	}
	public static void main(String[] args) {
		 Task2 obj=new Task2();

	}

}
