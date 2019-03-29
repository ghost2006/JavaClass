package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		// .contains()--> Checks for specific value in string. if value is present--> true, else-->false
		String str ="Good morning, students!";
		boolean contains=str.contains("Morning");
		System.out.println(contains); //false--> of the upper case!!!
		boolean contains1=str.contains("students");
		System.out.println(contains1);//true
		boolean contains2=str.contains("morning");
		System.out.println(contains2);//true
		
		String present="Welcome, Asel";
		boolean flag0=present.contains(present);
		String neededValue="Welcome";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);//true
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
		
		//---------- SARTS with   ENDS with--------------------
		// startsWith(), endsWith()--> will return true if string starts/ends with specified prefix/suffix, else-->false
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);//true
		System.out.println(str1.endsWith("X"));//false cause of upper case
		
		//.isEmpty() if length of a string is =0--> string is empty, else -->it's not----------------------------------------------------------
		String str2="Hello";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);//false
		
		//.concat()--> will concatenate 1 string to another!!!---------------------------------------------------------------------------------
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//.trim() ---> removes spaces ONLY at the beginning and at the end of the string!it's not going inside of our text!!!!
		String expected="You may quality for a multy-policy discount!";
		String actual=" You may quality for a multy-policy discount! ";
		System.out.println(expected.equals(actual)); // false cause of space!
		
		actual=expected.trim();  //it'll get rid of 2 spaces!!!
		System.out.println(expected.equals(actual)); //true!!! cause we cut out our spaces with trim() Method!!!!!!
	}

}
