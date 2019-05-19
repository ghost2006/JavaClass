package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
	//2ways of String creation
		//1 way-using String literal;
		String str="Hello";
		
		//2 way
		String str2=new String("Bye");
		
		str.toUpperCase(); //new obj is created in string pool
	    String str3=str.replace("o", "a");// Absolutely new obj was created in the str pool & assigned to the str3
		
		System.out.println(str);//Hello stays unchangeable!
		System.out.println(str3);//Hella
		
	}

}
