package com.class17_2;

import com.class17.Calculator;
import com.class17.ScannerMethod;

public class Application {

	public static void main(String[] args) {
		
		ScannerMethod scnMthd= new ScannerMethod ();
		// scnMthd.sub();
		// scnMthd.sum(123,150);
		 
		 
		 Calculator operations= new Calculator();// object= instance of the class// instantiation of the class!
		 int x=10, y=100;
		 
		int d= operations.sum(x,y); //if it's public we can use the M 
		 System.out.println(d);//2d way to use the M with a returned value or see above
		 
		// operations.div();// gives the error--> cause it's defined by the default
	Application app= new Application();
	
	System.out.println(app.example6('a'));
	}
	
	void example() {
		System.out.println("No return value and NO Parametrs");
	}
	
	void example2(String name) {
		System.out.println("No return value but with Parameter: "+ name);
	}
	boolean example3() {
	System.out.println("with return value and NO Parametrs");
	return true;
}
	String example4(String name) {
		System.out.println("with return value and Parameter");
		return name;
	}
	boolean example5(String name) {
		System.out.println("with return value and Parameter");
		return false;
	}
	
	long example6(char name) {
		System.out.println("with return value and Parameter");
		return name;
	}
	
	
	
	public void sum(int a, int b) {
		 System.out.println(a+b);
	 }
	private void div(int a,int b) {
		 System.out.println(a-b);
	 }
 protected void mult (int a, int b) {
		 System.out.println(a*b);
	 }
	 
}
