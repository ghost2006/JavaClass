package com.class14;

public class Iq5 {

	public static void main(String[] args) {
		////Reverse a string word by word?		

	
		String  sentence ="The master is speaking ";
		String reverse="";
		for (int i=sentence.length()-1;i>=0;i--) {
			reverse= reverse+sentence.charAt(i);
		}
		System.out.println(reverse);
		String [] words=reverse.split(" ");
		for (int i=words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");

		}
		
		
	}

}
