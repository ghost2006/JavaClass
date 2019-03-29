package com.class7;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
		int a=10;
		
	do {
		System.out.println("Hello");
		a++;
	}while (a>15); //we execute the code first inside DO LOOP! and then check the condition after!!!!!
		
	//--------------------------------------------------------------------------------	
	
	int b=10;
	while (b<15) { //check condition and only then executes!!
		System.out.println("Bye");
		b++;
	}
	
	}
}