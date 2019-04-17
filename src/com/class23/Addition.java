package com.class23;

public class Addition {
	
	//1.overloading method by changing number of parameters
	public void add(int a,int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	
	public void add(int a) {//two M with the same name - but it doesn't complain now, we changed our parameters---> M overloading
		System.out.println("Method to add 1 integer and 100");
		System.out.println(a+100);
	}
	
	public void add(int a,int b,int c) {// we overloading our add methods
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+c);
	}
	
	//2. overloading method by changing the data type of the parameters
	public void add(double a,double b) {
		System.out.println("Method to add 2 doubles");
		System.out.println(a+b);
	}
	
	public void add(int a,double b) {
		System.out.println("Method to add 1 integer and 1 double");
		System.out.println(a+b);
	}
	public void add(double a,int b) {
		System.out.println("Method to add 1 double and 1 integer");
		System.out.println(a+b);
	}
	
	public void add(double a,double b, double c) {
		System.out.println("Method to add 3 double values");
		System.out.println(a+b+c);
		}
	

}
