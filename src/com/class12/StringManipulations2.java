package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		// .charAt()-->returns only one character at specified index
		
		String str="Students";
		char character=str.charAt(7);
		System.out.println(character);//s
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)); //to print all characters
		}
		System.out.println();
		
		// indexOf("") --> returns an index of a specified character--------------------------------------------------------------------------
		String str1="Sunday";
		int index=str1.indexOf("d");
		System.out.println(index);//3
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Technologies"));//7---(starts from S-y-n-t-a-x-space-T=7)!!!
		System.out.println(str2.indexOf("echnologies"));//8
		System.out.println(str2.indexOf(" ")); //6
		System.out.println(str2.indexOf("w")); //-1 -cause we don't have this character in our string!!!!
		
		//substring(string inside of another one) - gives another string from your current string!--------------------------------------------
		String str3="Today is Sunday Java Class";
		String newString=str3.substring(5); // takes everything that starts from index [5]!
		System.out.println(newString); 
		
		//.substring(startIndex,endIndex)-----------------------------------------------------------------------------------------------------
		System.out.println(str3.substring(0,5));//today
		System.out.println(str3.substring(9,20));//sunday java
		System.out.println(str3.substring(16,20));//java
		
		System.out.println(str3.substring(21)); //class--here we use only beginning index, cause specifying the ending of our string!
}
}