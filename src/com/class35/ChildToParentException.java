package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		
		int [] array = {17,99,8};
		
		try {
			Thread.sleep(2000); 
		System.out.println(array[3]); // new ArrayIndexOutOfBoundsException
		} catch(InterruptedException e) { 
		
		} catch (ArithmeticException e) { // have to put more specific(child) first at catch block & then only generic(parent) InterruptedException--Exception
		} catch (Exception e) {          // parent reference
			
		}
		System.out.println("code after exception");
		
		//ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException();
		//Exception e1=new ArrayIndexOutOfBoundsException();
	}

}
