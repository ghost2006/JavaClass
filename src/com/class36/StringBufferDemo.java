package com.class36;

public class StringBufferDemo {
public static void main(String[] args) {
	
	//StringBuffer is a class & it has a lot of methods
	//StringBuffer is an mutable obj
	
//	 StringBuffer sb=new StringBuffer("Hello");
//	 sb.deleteCharAt(3); // we're modifying our obj hello to -->helo
//	 
//	 System.out.println(sb); //helo
	 
	 String str="Good morning";
	 str.concat(" John");
	 
	 System.out.println(str); //Good morning
	 
	 System.out.println("-------------------");
	 
	 StringBuffer sb=new StringBuffer("Hello");
	 sb.append(" John"); 
	 System.out.println(sb); //  Hello John
}
}
