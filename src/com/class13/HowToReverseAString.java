package com.class13;

public class HowToReverseAString {

	public static void main(String[] args) {
		
	// HOW TO REVERSE A STRING?
//----------Reverse a string without using a reverse function----------------------------------------------------------------------------------------------------------------

// 1. using toCharArray()		 
		String original="Today is Java Class"; 
		String reverse="";
			char [] array = original.toCharArray();
				 
			for (int i=array.length-1; i>=0; i--) {
				reverse=reverse+array[i];  //i=18->s; i=17->s; i=16->a; i=15->l; i=14->c; i=13->""; i=12->a...i=0->t
			}
			 System.out.println("Reversed String is: "+ reverse);
				 
//2  charAt()				 
				 
		String reverse1="";
		for (int i=original.length()-1; i>=0; i--) {
			reverse1= reverse1+original.charAt(i);	
		}
		 System.out.println("Reversed String is: "+ reverse1);		 
		
// using substring()
		 
		 String reverse2="";
		 for (int i=original.length(); i>0; i--) { // we should stop at 0! that's why i>0 !=0!!!!
		 reverse2+=original.substring(i-1, i);//i=18->s; i=17->s; i=16->a; i=15->l; i=14->c; i=13->""; i=12->a...i=0->t
		 }
		 System.out.println("Reversed String is: "+ reverse2);	
	}

}
