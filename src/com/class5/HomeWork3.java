package com.class5;
import java.util.Scanner;
public class HomeWork3 {

	public static void main(String[] args) {
		//Program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
//		Scanner inp=new Scanner (System.in);
//		System.out.println("Please enter 3 distinct numbers");
	
//		int	num1 =inp.nextInt();				//     1. num1>num2 && num1>num3
//		int	num2 =inp.nextInt();				//	   2. num2>num1 && num2>num3
//		int	num3 =inp.nextInt();				//	   3. num3>num1 && num3>num2 
//	
//		//5,3,4
//		if (num1>num2) {
//				if (num1>num3) {
//					System.out.println(num1+" is the largest");
//				}else {
//					System.out.println(num3+" is the largest");
//				}
//		}else {    //assuming that number2 >num1
//				if(num2>num3) {
//					System.out.println(num2+" is the largest");
//				} else {
//					System.out.println(num3+" is the largest");
//				}
//		}
		int largest;
		Scanner inp=new Scanner (System.in);
		System.out.println("Please enter 3 distinc numbers");
		int	num1 =inp.nextInt();				
		int	num2 =inp.nextInt();				
		int	num3 =inp.nextInt();			
	
		if (num1>num2) {
				if (num1>num3) {
					largest=num1; // initializing our largest variable!
				}else {
					largest=num3;
				}
		}else {    //assuming that number2 >num1
				if(num2>num3) {
					largest=num2;
				} else {
					largest=num3;
	}
}
		System.out.println("The largest number is "+largest);

}
}
