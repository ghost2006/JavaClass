package com.home;

import java.util.Scanner;

public class AFLKDYSigfvuydgir {

	public static void main(String[] args) {
	
		String weqas = "hello world my name Is wEqas";
		char[] w = weqas.toCharArray();
		char empty;
		for (int i = 0; i <= w.length - 1; i++) {
			if (w[i] == 'a' || w[i] == 'A' || w[i] == 'e' || w[i] == 'E' || w[i] == 'i' || w[i] == 'I' || w[i] == 'o'
					|| w[i] == 'O' || w[i] == 'u' || w[i] == 'U') {
				empty = w[i];
				System.out.print(empty + ",");
			}
	}
		
	
		String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
		//String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

		System.out.println(replace);
	}
		
	}


