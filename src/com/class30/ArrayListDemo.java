package com.class30;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
	ArrayList<String> greetings=new ArrayList<String>(); // 1. we have to import the arrayList
//   class     type     name
	
	greetings.add("Hello");	//storing string objects inside our list
	greetings.add("Welcome");
	greetings.add("Hi");
	greetings.add("Bye");
	
	System.out.println(greetings.get(1));// to access the element at the specific index we use method 'get'
	System.out.println(greetings.size()); //to get the size of collection //4
	
	//collections -growable in size
	greetings.add("How are you?");
	greetings.add("How are you?");//storing duplicate values
	greetings.add("How are you?");
	System.out.println(greetings.size());//7, cause we add more objects
	
	System.out.println("-----For Loop-----");
	//to retrieve all values from the ArreyList--> use Loop
	for (int i=0; i<greetings.size();i++) { //size()-our length of arrayList
		System.out.println(greetings.get(i)); // get() --> accessing an element based on it's index
	}
	//ArrayLIst preserves the order! 
	System.out.println("-----Advanced For Loop-----");
	for (String greetWords:greetings) {
		System.out.println(greetWords);
	}
}
}