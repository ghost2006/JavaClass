package com.class13;

public class StringManipulations1 {

	public static void main(String[] args) {
		
		// toCharArray() - converts string to array of characters!!!
		String str ="saturday";
		
		char []array =str.toCharArray(); //returning array of characters!!!! we use CHAR cause of characters!
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	// OR using for each loop
		 for (char c:array) {
		       System.out.println(c);
		 }
	// printing in reverse order
		 for (int i=array.length-1; i>=0; i--) {
				System.out.println(array[i]);
		 }
		 

		 
		
		 
		 
		 
		 
		 
		 
		 	 
	}

}
