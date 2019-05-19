package com.class35;

public class ThrowsKeyword {
                                            	// using Throws 
	public static String name;
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Get some coffee.."); // who will call this M will take care of that exception
	}
	
	public static void allStudentsSleeping() throws InterruptedException {
	 studentSleeping(); //calling the static method!
	}  // !!!! it will be throwing the Ex of our unhandled Ex until someone will use the try-catch block
	
	public static void sleepMode() {
		try {
			allStudentsSleeping();
		} catch (InterruptedException e) { //there is no exception
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) { // JVM always looks for the Main method!!!
		
		sleepMode();
}
}