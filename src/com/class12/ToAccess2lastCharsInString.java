package com.class12;

public class ToAccess2lastCharsInString {

	public static void main(String[] args) {
		/*
		 * Given a string, return a new string made of 3 copies of the last 2 chars of
		 * the original string. The string length will be at least 2.
		 * extraEnd("Hello") → "lololo" 
		 * extraEnd("ab") → "ababab" Or extraEnd("Hi") →"HiHiHi" */

		String str = "Hello";
		String lastTwo = null;
			if (str != null && str.length() >= 2) {  
				lastTwo = str.substring(str.length() - 2);
			}
			if (str.length()==2){
			    System.out.println(str+str+str);
			}
			 else{
				 System.out.println(str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2));
	}

}
}