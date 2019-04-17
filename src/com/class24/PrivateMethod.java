package com.class24;

public class PrivateMethod {

	public static void main(String[] args) {
		/*Create 1 class with a private method that has 3 overloaded forms. Then call
		 * each overloaded method with specific arguments and observe result.*/

		method();
		method("Java");
		method(8);
	}

	private static void method() {
		System.out.println("Method #1");
	}

	private static void method(String str) {
		System.out.println("Method #2 " + str);
	}

	private static void method(int a) {
		System.out.println("Method #3 " + a);
	}
}
