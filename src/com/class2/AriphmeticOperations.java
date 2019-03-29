package com.class2;

public class AriphmeticOperations {
	public static void main (String [] args) { 

		//declare 2 int variables and then we perform:
		//addition, subtraction, multiplication, division 
		int a=30;
		int b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		

		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//print: the__of 2 numbers is__
		System.out.println("the sum of 2 numbers is "+ sum);
		System.out.println("the division of 2 numbers is "+ div);
		System.out.println("the subtraction of 2 numbers is " +sub);
		System.out.println( "the multiplication of 2 numbers is "+ mult);
		System.out.println("the sum of 2 words is " + sum+ ".");
		
		
		//1
		double n=2.2;
		double m=1.1; 
		double sum1=n+m;
		
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(m*m);
		System.out.println(n/m);
		System.out.println(sum1);
		
		System.out.println("The sum of 2 numbers "+n+" and " +m+" is equal to "+sum1);
		
		//2
		double q = 3.9;
		double sq = 3.9*2;
		System.out.println(sq);
		System.out.println("The square of the " +q+" is " +sq);
			
         //3
		int a1=5;
		int b1=8;
		int per=(a1+b1)*2;
		System.out.println(per);
		System.out.println("The perimeter of a rectangler with width " +a1+ "and height " +b1+" is equal to (a1+b1)*2 and the area is "+per);
		
}
	 
	
}