package com.class35;

import java.util.ArrayList;
import java.util.List;

public class ExceptionIntro {

	public static void main(String[] args) {
		
//		int a=10;
//		int b=0;
//
//		System.out.println(a/b); // arithmetic exception
//		System.out.println("code after an exception"); 
		
//		ArithmeticException exception=new ArithmeticException(); // happens behind when we're running our program(line 13)
//		throw exception;
		
		List<Object> fixedData = new ArrayList<>();
		while (true) {
			Object data = new byte[64 * 1024 - 1];
			fixedData.add(data);  //OutOfMemoryError: Java heap space
		}
		//System.out.println("Code after an error");will get an c error- unreachable code
	}

}
