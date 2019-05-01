package com.class28;

public interface TakeScreenshot {
	
	String fileExtention=".png"; // by default public static final variable and it has to be defined at the time it was declared!!!
	
	 void takeScreenshot();
	
	 /* from java 8 we can have defined methods in interface:
	* default 
	* static   */
	 
	 static void m1() {
		 System.out.println("Static method 1"); //can be some common behavior, so it won't affect code in all concrete classes!!
	 }
	default void m2() {
		 System.out.println("Default method 2"); //it can be overridden or it can be used like this in a child class!!!
	 }
}
