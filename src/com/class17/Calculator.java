package com.class17;

public class Calculator { // for class we have only 2 access options:public or default!!
// we don't need a main M
	
	public int sum(int x,int y) {
		return x+y;
	}
	 int sub(int x,int y) {
		return x-y;
	}
	int mult(int x,int y) {
		return x*y;
	}
	int div(int x,int y) {
		return x/y;
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		//
//		 Application obj=new Application();
//		 obj.sum(1,9);// we can use it only if the M is public
//		 
//		// obj.div(1,1); error--> the M is private
//		 
//		 obj.mult(1,2); //error--> The M is protected
//		 
//		 
//		 
//	}

}
