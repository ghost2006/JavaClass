package com.class17_2;

import java.util.Scanner;

 public class ScannerMethod {

	public static void main(String[] args) { //public defines the access of the code,it helps us to control to the access
		
		ScannerMethod obj= new ScannerMethod();
		obj.sub();// it'll use a,b that we provided inside of M!!
		obj.sum(12,13);
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		obj.sum(a, b); //it'l use a,b from a scanner
		int sum=obj.sum1(11, 1); //or
		System.out.println(obj.sum1(11, 1));
		int d=1;
		int c=obj.sum1(d, 123);
		System.out.println(c);
	}
	void sum(int x, int y) { // if we use protected --> can use it only in one package
	System.out.println(x+y);
}
	 void sub() { // by default we have a public access modifier --> we can use int in different class but in one package
	 int a=10; int b=20;
	System.out.println(a-b);
	}
	
	int sum1 (int x, int y) { //if we'll put private before int --> we woun't be able to use it in different class
		//System.out.println(x+y);
		return x+y;
	}
	
	
	
	
	
}
