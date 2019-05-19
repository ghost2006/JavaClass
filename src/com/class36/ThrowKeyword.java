package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		//if i want to create our custom Ex manually-i'll use 'throw' keyword
	
		int a=10;
		int b=0;
		//System.out.println(a/b);// new ArithmeticException got created by JVM, implicitly
	
		checkAgeEligibility(19); //Congratulations on your driver license
		//checkAgeEligibility(17); //ArithmeticException: You're not eligible to get driver license
		
		//twoNumdiv(10, 0); //calling static method
		
//		checkUserNameLength("Maria");
//		checkUserNameLength("A");
		
		System.out.println(withdrawMoney(2000, 500));
	}
	 public static void checkAgeEligibility(int age) {
		//if  person is >18-->give him id else-->throw an Ex
		 if (age>=18) {
			 System.out.println("Congratulations on your driver license");
		 } else {
			throw new ArithmeticException("You're not eligible to get driver license");
		 }
	 }
	 public static void twoNumdiv(int a, int b) {
		 if (b!=0) {
			 System.out.println(a/b);
		 } else {
			 throw new ArithmeticException("We cannot divide by zero"); //we created the obj manually
		 }
	 }
	 public static void checkUserNameLength(String userName) {
		 if (userName.length()>3) {
			 System.out.println("user name is accepted");
		 }else {
			throw new NullPointerException("Username should be longer than 3 characters");
		 }
	 }
	// create an exception: when user it trying to withdraw larger amount that the balance --> throw an exception saying "You do not have enough money"
	 public static int withdrawMoney(int amount, int balance) {
		 if (balance>=amount) {
		 return amount;
		 }else {
			 throw new ArithmeticException("Your balance is too low");
		 }
	 }
}
