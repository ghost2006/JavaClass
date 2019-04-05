package com.home;

import java.util.Scanner;

public class AFLKDYSigfvuydgir {

	public static void main(String[] args) {
	
		AFLKDYSigfvuydgir obj= new AFLKDYSigfvuydgir();
		boolean odd=obj.isOdd(8);
		System.out.println(odd);
		obj.name("Lera");		
		String b=obj.name1("Leraaa");
		System.out.println(b);
		
		obj.palindrome("");
	}
		 public boolean isOdd (int a) {
			if (a%2==0) {
				return true;
			}else {
				return false;
			}}
		 
		 
		 void name(String a) {
			 System.out.println(a);
		 }
		 String name1( String a) {
			 return a;
		 }
		 void palindrome(String name) {
			 Scanner scan = new Scanner (System.in);
			 System.out.println("Enter a word");
			 String word= scan.nextLine();
			 String reverse="";
			 for (int i=word.length()-1; i>=0; i--) {
				 reverse+=word.charAt(i);
			 }
			 if (word.equalsIgnoreCase(reverse)){
				 System.out.println("Palindrome");
			 }else {
				 System.out.println("NOT");
			 }
		 }
	}


