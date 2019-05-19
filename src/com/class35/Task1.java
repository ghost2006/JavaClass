package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// how would we handle InputMismatchException? when user enters mismatch value then programmer expected

		Scanner scanner=new Scanner(System.in);
		
		try {
			int input= scanner.nextInt();
			System.out.println(input); 
		
		} catch (InputMismatchException e) {
		System.out.println(e);  // java.util.InputMismatchException
		}
		System.out.println("End of the code");
}
}