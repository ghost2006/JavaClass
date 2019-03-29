package com.class5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
//  Logical AND && (ampersand)---->both conditions has to be true!!!!!!!!     	Logical OR ||  --> at least one condition should be true!!
//	True and true = TRUE														True and true = TRUE
//	True and false = FALSE														True and false = TRUE
//  False and true = FALSE														False and true = TRUE
//	False and False = FALSE														False and False = FALSE
			
		/*  if number is between 1-10 --> it's small
		 * if between 11-100--> medium
		 *if between 101-1000--> large
		 */
		int num=15;
		if (num>=1 && num<=10) {   // true AND false ----> false
			System.out.println("number is small");
		}else if (num>=11 && num<=100) {  //true AND true---> true
				System.out.println("number is medium");
			} else if (num>=101 && num<=1000) {  // false AND true---> false
				System.out.println("number is large");
			}else {
				System.out.println("number is not in our range");
		}
		
		/* ask user to enter age and based on it we'll print
		 * if age is older than 1 year less than 3-> baby
		 * if age is older than 3 less than 5-> toddler
		 * if age is older than 5 but less than 13->kid
		 * if age is older than 13 but less than 20->teenager
		 * if age is older than 20 but less than 64 -> adult
		 * if age is older or equal to 64->senior
		 */
		Scanner myScanner;
		int age;
		myScanner = new Scanner (System.in);
		System.out.println("Please enter your age");
		age=myScanner.nextInt();
		if (age>1 && age<3) {
			System.out.println("you are a baby");
		} else if (age>=3 && age<5) {
			System.out.println("you are a toddler");
		} else if (age>=5 && age<13) {
			System.out.println("you are a kid");
		} else if (age>=13 && age<20) {
			System.out.println("you are a teenager");
		} else if (age>=20 && age<64) {
			System.out.println("you are a adult");
		} else {
			System.out.println("you are a seniour");
		}
		}
}
