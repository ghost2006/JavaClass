package com.class36;

public class WhyStringImmutable {

	public static void main(String[] args) {
		// String are immutable
		
		String str ="Hello"; // obj Hello was created in the heap
		String str1 ="Hello";// str1--> to the same obj "Hello" id=18
		String str2 ="Hello";// str2--> same obj "Hello" id=18
		
		str="Hi"; // new obj 'Hi' was created and have id=22
		System.out.println(str);
		
	}

}
