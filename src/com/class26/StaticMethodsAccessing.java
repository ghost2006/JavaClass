package com.class26;

public class StaticMethodsAccessing {

	public static void method1() {
		System.out.println("m1 static method in parent class");
	}
}

class Child extends StaticMethodsAccessing {

	public static void method1() {
		System.out.println("m1 static method in child class");
	}

	public static void method2() {
		StaticMethodsAccessing.method1(); // we can access Static methods using a Class name!
		method1();//We can't use 'this.' and 'super.' with static members only with non-static
	}
}
