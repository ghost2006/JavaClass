package com.class27;

public class Hello {

	String str;
	static int num=100;
	
	public void hello() {
		System.out.println("Hello");//implemented instance method
	}

	public static void hello1() {
		System.out.println("Hello 1");// this method is implemented static method--> cause it has name and body
	}
	
	Hello(){
		System.out.println("I am a constructor");
	}
}
