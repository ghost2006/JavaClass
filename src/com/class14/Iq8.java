package com.class14;

public class Iq8 {

	public static void main(String[] args) {
		//  // 1 2 3 5 8 13 21 34 55 89 144  

	//a+b=c	                         a-->b, b-->c, than again again a-->b, b-->c; again and again
	  //a+b=c            
		//a+b=c
		   //a+c=c
		
		int a=1;
		int b=0;
		int c=0;
	for (int i=0; i<10; i++) {
		
		c=a+b;
		a=b;
		b=c;
		System.out.println(a+" ");
	}
		
		
		
		
		
		
		
		
		
	}

}
