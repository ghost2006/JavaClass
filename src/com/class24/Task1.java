package com.class24;

public class Task1 {

	public static void main(String[] args) {

		/* 2. Create 1 class with a static method that has 3 overloaded forms. Then call
		 * each overloaded method with specific arguments and observe result.*/

		method();
		method("Java");
		method(8);
	}

	static void method() {
		System.out.println("Method #1");
	}

	static void method(String str) {
		System.out.println("Method #2 " + str);
	}

	static void method(int a) {
		System.out.println("Method #3 " + a);
	}

}
