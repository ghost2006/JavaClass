package com.class13;

public class StrinSplit {

	public static void main(String[] args) {
		
		// .split() -- returns an array of strings
		
		  //       1string  second  third
		String str="Welcome Syntax Students Batch 4!";
		String [] array=str.split("S"); // it will cut our string at value "S" into pieces and remove "S"!!!
		System.out.println("the length of the array is " + array.length); //3
		
		String [] array1=str.split(" ");
		System.out.println("the length of the array is " + array1.length);
		
		String [] array2=str.split("!");
		System.out.println("the length of the array is " + array2.length);
		System.out.println("---------------------");
		
		for (String substring:array) {
			System.out.println(substring);
		}
		System.out.println("---------------------");
	
		for (int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}
	/* to count the number of characters --- use the length function
	 * to count the number of words use split Method !!! */
		
		
	}

}
