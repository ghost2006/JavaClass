package com.class13;

public class StringManipulations {

	public static void main(String[] args) {
		
		//REPLACE() - will replace old character/value to new character/value
	String str="I am a good tester#1!";
	
	// what we're looking for to replace, new value
	String newStr=str.replace("a",           "e"); // replaces every letter "a" in our string to "e"
	System.out.println(newStr);
		
	String newStr1=str.replace("good", "great");	
	System.out.println(newStr1);
		
	String newStr2=str.replace("tester", "programmer");
	System.out.println(newStr2);
	
	String newStr3=str.replace("Tester", "programmer");
	System.out.println(newStr3); //I am a good tester --->no change, cause of case!!!

	str=str.replace("!", "?");
	System.out.println(str); 
	
	str=str.replace("1", "2");
	System.out.println(str); //with #2 and "?" ---we changed our "!" to"?" on line 23!!!!
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
	// replaceAll() - will replace all that matched specified pattern[regex-regular expression)]
	String str1="12Hello World 465%&%$";
	String replacedNoNumbers = str1.replaceAll("[0-9]", "");//replaced the group of numbers [0-9]--> it will replaced all numbers with ""
	System.out.println(replacedNoNumbers); 	
	
	String newString = replacedNoNumbers.replaceAll("[^A-Z a-z]", ""); //"^" (caret) means not or except--> we'll get rid of everything,numbers but leave A-Za-z!!! 
			  // we saved space adding "space" between Z a !!! if we do [^A-Za-z] it'll cut even Space!!//HelloWorld 
	System.out.println(newString); // Hello World 
	
//	String replacedNoCharacter = replacedNoNumbers.replaceAll("[A-Za-z]", ""); //replaced the group of characters[a-z]--> 
//	System.out.println(replacedNoNumbers); 	
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", "")); //1123 --> we replaced everything with "",but numbers!
		
		
		
		
		
	}

}
