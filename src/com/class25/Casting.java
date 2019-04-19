package com.class25;

public class Casting {

	public static void main(String[] args) {
		/* 2 types of casting
		 *  implicit
		 *  explicit */
	
	//implicit or automatic/widening/upCasting--> something smaller put in a bigger box happens automatically--Compiler takes care of it
	double a=10;
	System.out.println(a);
	
	 //explicit or manual or narrowing casting--programmer takes care of conversion
	double b=10.0;
	int c=(int)b;// in parentheses we put the type in which we want to convert our variable
	
	int i=130;
	//byte by=130;//the value is too big to put 130 in byte(it's takes only values up to 127)
	byte by=(byte)i;
	System.out.println(by);
	
//-------type casting for objects--------------------------
	
	//UpCasting--> compiler will do it automatically
	Payment pay=new MasterCard();//subtype through into supertype!
	
	//downCasting
	//MasterCard mc=new Payment();// trying to put super class into our subclass--> compiler won't allow
	MasterCard mc=(MasterCard)new Payment();
	
	
	
	
	
	}

}
