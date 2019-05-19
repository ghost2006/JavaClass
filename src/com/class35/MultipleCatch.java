package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		try {                          //'try' always must be accommodated with smth (catch or finally)!!
			Thread.sleep(2000); // new InterruptedException(); -->line 21
			System.out.println(10/0); // new ArithmeticException(); -->line 18   it'll always execute only 1 Catch!!!
		} catch(ArithmeticException e) {
			//3 ways to print name and details of an Exception:   !!!it can be only one at the time!!! 
			e.printStackTrace();    // name, details and location of an EX
//			System.out.println(e); // name and details of an EX
//			e.getMessage(); // only details of an EX
			
			System.out.println("Code of Arithmetic exception");
	   
		} catch (InterruptedException e) {
	    	System.out.println("Code of Interrupted exception");
	    }
	
		System.out.println("the end of the code"); 
		
	// Output: Beginning of the code
	//	       Code of Arithmetic exception
	//         the end of the code
	
	
	}

}
