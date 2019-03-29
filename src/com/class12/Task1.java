package com.class12;

public class Task1 {

	public static void main(String[] args) {
		
			/*    Write a program that:
	        * Converts all the characters in the string to lower case and prints.
	        * Converts all the characters in the string to upper case and prints.
	        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
	        * Prints characters between the 10th and 20th indices(inclusive).
	        * Clears/removes all white spaces or tabs on both ends and prints. */
		
			 String para = "The quick brown fox jumps over the lazy dog.";
		    
		    System.out.println(para.toLowerCase());
		    System.out.println(para.toUpperCase());
		    System.out.println(para.startsWith("The"));
		    System.out.println(para.endsWith("The"));
		    
		    // Counts the number of letter 'a' in the string/paragraph and prints.
		    int count=0;
		    for (int i=0; i<para.length(); i++) {
		    	if (para.charAt(i)=='a') {
		    		count++;
		    	}
		    }
		    System.out.println(count);
		    
		    // Prints the second half of the string/paragraph.
		    System.out.println(para.substring(para.length()/2));
		  
		    System.out.println(para.substring(10,20));
		    
	        // Prints the string/Paragraph in reverse order.
		    for (int i=para.length()-1; i>=0; i--) {
		    	System.out.print(para.charAt(i));
	 }
		
		    System.out.println(para.trim());
	}

}
