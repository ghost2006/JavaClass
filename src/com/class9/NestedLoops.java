package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		/* for (initialization; condition; inc/dec){
		 * code C;
		 * 		for (initialization; condition; inc/dec){
		 * code D;
		 *   } } */
		 
		  for (int i=0; i<3; i++){  //i-counter variable, it shows how many times our inner loop will be executed!
		  	 for (int y=0; y<3; y++) {
		  		System.out.println("I am inner loop"+y);
		  }
		  	System.out.println("---I am outer loop---"+i);//3 outer loop takes control of our inner loop
		  	}
		
	 
	for (int i=1;i<=3;i++) {
		for (int y=1; y<=3; y++) {
			System.out.println(i+" "+y); //11;12;13//21;22;23//31;32;33
		}
	}
	
	
	

		
		
		
		
	}
}
