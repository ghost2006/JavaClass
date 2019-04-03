package com.home;

import java.util.Scanner;

public class AFLKDYSigfvuydgir {

	public static void main(String[] args) {
	
		String d="Good morning all";

		String [] array =d.split(" ");
		System.out.println(array.length);
		
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("_______ ");
		
		
		for (int i= array.length-1;i>=0; i--) { //word by word
			System.out.print(array[i]+" ");
		}
		
		System.out.println("_______ ");
		
		
		String reverse="";
	for (int i=d.length()-1;i>=0; i--) { //in reverse order
		reverse+= d.charAt(i);
	}
	System.out.println(reverse);
	}
	}


