package com.class16;

public class Greetings {

	public static void main(String[] args) {

		Greetings obj = new Greetings();
		obj.hello();
		// how to find largest number --> instead of printing code of line 19-25? we'll do it in method and then call it!
		obj.findLargest(20,10); //20--> to a; b=10 (line 19)// calling M FindLargest and passing values as 20 &10
		obj.findLargest(30,31);//calling M FindLargest and passing values as 30 &31(we call them arguments!)
		obj.findLargest(3000,364341);//values a and b
		obj.helloToInstructor("Awet");
		obj.helloToInstructor("Arif");
	}
	void hello() {// M without any parameter. This line is a M signature. name of M should be a verb
		System.out.println("Hello"); //M body
	}
	void findLargest( int a, int b) { // M with 2 parameters
	// we put our parameters (a and b) inside of () (instead of lines 21-22)
		
	//	int a = 10; //it compares only 2 numbers=10 and 20
	//	int b = 20;
		if (a > b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");

		}
	}
	void helloToInstructor(String name) {//name="Awet"/ M with 1 parameter
		System.out.println("Hello "+name);
	}
}
