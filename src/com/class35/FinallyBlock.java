package com.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=10;
	    int b=0;
		
	    try{
			System.out.println("Try block");
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("Ñatch block code");
		} finally {                               // code inside this block always gets executed!!!!
			System.out.println("Finally block code");
	    	}
	
	    /* Output:Try block
			      Ñatch block code
 			      Finally block code*/

	try {  //it will be checked no matter what!!!
		System.out.println(a/b);
	} finally{
		System.out.println("Finally block code");	// it'll be executed even without exception, it always gets executed!!!!
	}
	System.out.println("Continues code...");	
	/* Output: Finally block code  -> nobody is catching the obj of Ex--> only finally code & Ex
			   Exception in thread "main" java.lang.ArithmeticException: / by zero */

//	  int a1=10;
//    int b1=0;
//	
//    try {
//		System.out.println(a1/b1);
//	} finally{
//		System.out.println("Finally block code");	// it'll be executed even without exception, it always gets executed!!!!
//	}
//	System.out.println("Continues code...");
	/*3
	Finally block code
	Continues code...*/
	
	}

}
