package com.class13;

public class Task1 {

	public static void main(String[] args) {
		

	//1. *Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
	String sentense = "Today is a Saturday";
	System.out.println(sentense.replaceAll("[^A-Za-z]", ""));
	System.out.println(sentense.replace(" " , ""));
		
	//2. Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
		
	String b= "$$5Today7 is a Sat8urday";
	
	String b1=b.replaceAll("[^A-Za-z]", "");
	System.out.println(b1.length());
		
	//3. You have a String a=“Is it a Saturday? It is raining? Do We have a Java Class today?“. How would you find out how many sentences are in that String?
		
	String a= "Is it a Saturday? It is raining? Do We have a Java Class today?";
	
	String [] arr =a.split("\\?"); //! to determine [! or ?]
	System.out.println(arr.length);	
	
	//how many words are in the String?
	String [] arr1 =a.split(" "); 
	System.out.println(arr1.length);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
