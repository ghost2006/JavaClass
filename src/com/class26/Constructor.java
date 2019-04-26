package com.class26;

public class Constructor {

	public static void main(String[] args) {

		Constructor obj = new Constructor();
	}

	Constructor() {
		this(1);
		System.out.println("Hi");
	}

	Constructor(int a) {
		this(1, 3);
		System.out.println("Hello");
	}

	Constructor(int a, int b) {
		System.out.println("How are you");
	}
}
