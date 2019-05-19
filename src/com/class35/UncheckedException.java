package com.class35;

public class UncheckedException {

	public static void main(String[] args) {
		
		int [] array= {12,13,12};
		
		//System.out.println(array[3]); //ArrayIndexOutOfBoundsException
		
		String a="Hello";
	//	System.out.println(a.charAt(5)); // StringIndexOutOfBoundsException

		// new StringIndexOutOfBoundsException(); //it's an object that is thrown to our class
		
		String str=null;
		System.out.println(str.length()); // NullPointerException
	}

}
