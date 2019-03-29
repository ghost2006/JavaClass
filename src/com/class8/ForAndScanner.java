package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		/*prompt user to enter 2 integers and compare them 
		 * at the end print largest*/

		Scanner myScanner;
		int num1, num2;
		int largest=0;
		myScanner=new Scanner(System.in);
		
		for (int i=1;i<=5; i++) { //i control variable for for loop
			
			System.out.println("Please enter 1 number");
			num1=myScanner.nextInt();
		
			System.out.println("Please enter second number");
			num2=myScanner.nextInt();
		
			if (num1>num2) {
				largest=num1;
			} else if(num2>num1) {
				largest=num2;
			}else {
				System.out.println(num1+" is equals to"+num2);
		}
		System.out.println(largest+" is the largest");
	}
}
}
