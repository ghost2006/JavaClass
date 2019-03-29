package com.class2;

public class Concatenation {

	public static void main(String[] args) {
		
		String name = "John";
		//My name is John;
		System.out.println("My name is "+ name);
		
		String day="Sunday";
		//Sunday is a coding day
		System.out.println(day + " is a coding day");
		
		int num1=11;
		int num2=14;
		// The value of num1 is___ and the value of num2 is___.
		System.out.println("The value of num1 is "+num1+ " and the value of num2 is "+num2 +".");
	
		
		//concatenation+operation
		int x=10;
		int y=20;
		String a="Hello";
		String b="Bye";
		System.out.println(x+y+a+b); //10+20+hello+bye=30Hellobye
		System.out.println(b+a+y+x);//bye+hello+20+10=hellobye2010
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(a+b+(x+y));//hellobye30 - (x+y)-arithmetic operation, a+b - concatenation
		
		//!!!!!!!! print---> syso ctrl +space+enter ---> it will print System.out.println  for you!!!
		
		
		
		int j=10;
		int v=3;
		
		int div=j/v;
		System.out.println(div);//3 or 3.3---> will be 3(cause of integer). it has only full numbers, only double will have 3.3!!!
	}

}
