package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
	int a=19;
	int b=5;
	boolean result = a>b;
	boolean result1 = a==b;
	
	System.out.println(result);
	System.out.println(result1);
	
	
	//compare 2 numbers and if a is larger than b---> print smth
	if (a>b) {
		System.out.println("a is larger than b");
	} else {
		System.out.println("b is larger than a");
	}
	
	// declare price and if price higher then expected price---> i will not buy it
	double shoesPriece=32.99;
	double allowedPrice=31.99;
	
	if(shoesPriece<=allowedPrice) {
	System.out.println("I am buying those shoes");
	} else {
	System.out.println("I am not buying those shoes");
	}
	System.out.println("I am a continues code");
	}

}
