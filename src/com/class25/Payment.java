package com.class25;

public class Payment {
	
	public void makePayment() {//overridden
	System.out.println("We can make payment with no fee");
	}
	
	public void closePayment() {
		System.out.println("all payments need to be closed");
	}
}

class MasterCard extends Payment {
	
	public void makePayment() {//we changed the logic inside only
	System.out.println("We can make payment with master card and 2% fee");
	}
}

class Visa extends Payment {//overriding
	
	public void makePayment() {
	System.out.println("We can make payment with visa card and 1.5% fee");
	}
	
	public void annualFee() { // belongs only to the child class
		System.out.println("Visa card has annual fee");
	}
}
