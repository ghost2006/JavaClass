package com.class3;

public class IfElseIF {

	public static void main(String[] args) {
		
		int num1=23;
		int num2=21;
		
		if(num1>num2) {
			System.out.println("I am if block");
			System.out.println("Num1 is larger than num2");
			System.out.println("I have multiple lines to print");
			
		} else {
			System.out.println("I am else block");
			System.out.println("Num1 is smaller than num2");
		}
		int num3=24;
		int num4=24;
		
		if(num3>num4) {
			System.out.println("Num3 is larger than num4");	
		} else if (num3==num4) {
		System.out.println("Num3 is equals num4");
		} else {
		System.out.println("Num3 is smaller than num4");
		System.out.println("I am done with if condition");
		}
}
	
}