package com.class6;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
		Scanner res = new Scanner (System.in);

		System.out.println("Please enter 2 numbers");
		int num1=inp.nextInt();
		int num2=inp.nextInt();
		
		System.out.println("Please enter your operator");
		String operator = res.nextLine();
		
		int result;
		
		switch (operator) {
		case ("Addition"):
			result=num1+num2;
		break;
		case ("Subtraction"):
			result=num1-num2;
		break;
		case("Multiplication"):
			result=num1*num2;
		break;
		case ("Division"):
			result=num1+num2;
		break;
		default:
		    result=0;
		}
		System.out.println("Your result is "+ result);
	}
	
}
