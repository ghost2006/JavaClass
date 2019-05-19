package com.class35;

public class ExceprionHandling {

	public static void main(String[] args) {
		
		// Using Try - Catch 
		System.out.println("Begining of the code");
		 
		try {
			Thread.sleep(2000); //inside 'try' we put our problematic code (obj of an exception might be thrown- new InterruptedException)
		} catch (InterruptedException e) { //we'll store that obj inside InterruptedException class, inside 'e' variable
			System.out.println("i am a catch block of code");
			e.getMessage();
		}
		System.out.println("the end of teh program");
		// InterruptedException e =new InterruptedException(); behind the scene OR
		// Exception e= new InterruptedException();
	}

}
