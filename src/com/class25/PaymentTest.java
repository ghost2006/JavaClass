package com.class25;
public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa vs=new Visa();
		vs.makePayment();
		vs.annualFee();
	
		System.out.println("------PERFORMING UPCASTING!!!------");
		
/*Performing upCasting here-->achieving Run time Polymorphism-->
--> JVM decides which method should be executed during RunTime-that's way it's called run time POLY!
-->During run time it will check the child class-if we have some common methods between parent and child classes-->and execute the overriding one*/
	
	Payment pay=new MasterCard();// pay our reference variable, payment is our reference type
	//new MasterCard();--creating an object of child class and giving the reference to the parent class
	
	pay.closePayment(); // parent's method
	pay.makePayment();// overriding method from a child
		
	Payment pay1=new Visa();//here we achieving run time poly
		pay1.closePayment();
		pay1.makePayment();
		//pay.annualFee();  --> not accessible
		
		
		
	}

}
