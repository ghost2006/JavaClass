package com.class13;

public class StringCombiningOnebyOne {

	public static void main(String[] args) {
	
		/*return the strings combined, one letter at a time, starting with s1.  
		 * You can assume that s1 and s2 are equal lengths: 
		 * String s1="1234";  String s2="abcd";
		 * mixString(s1,s2) ==> "1a2b3c4d5e"   */
		
		String s1="1234";
		String s2="abcd";
		String finalString="";
		
		for (int i=0; i<s1.length(); i++) {
			finalString+=s1.charAt(i)+""+s2.charAt(i)+"";  //we add "" in order to change the char to a String!!!!!!!
		}
		System.out.println(finalString);
		
//2d way--------------------------------------------------------------------------------	
		
		String finalString2="";
		//arr0=1; arr1 =a; arr2=2; arr3=b
		
		char []arr=new char[s1.length()+s2.length()];
		
		for (int i=0,k=0; i<s1.length(); i++,k+=2) {
			arr[k]=s1.charAt(i);
			arr[k+1]=s2.charAt(i);
		}
		//arr: 1,a,2,b,3,c,4,d
		for (int j = 0; j < arr.length; j++) {
			finalString2+=arr[j];
		}
		System.out.println(finalString2);
	
	
	}
}

