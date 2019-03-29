package com.class12;
public class StringPractice {
	public static void main(String[] args) {
	//1way to create a string using String LITERAL!!!
	String st1="Hello";
	String st2="123";
	String st3="*&$#F";
	
	//2nd way to create a string 	
	String myString = new String ("Hello");	// use when we don't know the value of the string beforehand!!!
		
	//-------------- String Manipulations!---------------------------
	
// LENGTH function or METHOD- returns numbers of character in the String
	String str="Syntax";

	int lengthOfString=	str.length();// () -we're talking about method
	System.out.println(lengthOfString);
	
	String str1="Syntax Technologies";
	int lengthOf2String=str1.length();
	System.out.println(lengthOf2String);

	String str2="Welcome, Students!";
	System.out.println(str2.length());
	
	//+)-->converts all characters to upper case----------------------------------------------------------------------------------
	//.toLowerCase()-->converts all characters to lower case	
	String str3="Hello";
	String newString=str3.toUpperCase();// it'll convert to upper case!
	System.out.println(newString);
	
	String LowerCasesString=newString.toLowerCase();
	System.out.println(LowerCasesString);
	
	//equals()- compares 2 strings; if they're equal--> true, else-false!---------------------------------------------------------------------
	String str4="Hello";
	String str5="hello";
	
	boolean equality=str4.equals(str5);
	System.out.println(equality);// false
	
	//equalsIgnoreCase()  - compares 2 strings but ignores case!------------------------------------------------------------------------------
	String expectedBrowser="Chrome";
	String actualBrowser="CHROME";
	
	boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);

	}

}
