package com.class26;

public class A {
/*Write program in class A has final display method and try overload and override this method and observe result .*/
	
	public final void method() {
		System.out.println("Final Method");
	}
	
	public final void method(String str) { //overloading method
		System.out.println("We can overload the Final Method");
	}
}

class B extends A{
//	public final void method() {
//		System.out.println("Final Method  overriding");
//	}
}