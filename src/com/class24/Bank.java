package com.class24;

public class Bank {

	//Parent class
	public int chargeInterest() {
	return 0;
	}
}

// 1 child class
class BOA extends Bank{ //it can't be public--> it's only one public class can be!!!!
	@Override // annotation works only when we override the method
	public int chargeInterest() {
		return 2;
		}
}

	// 2 child class
class PNC extends Bank{ //can have multiple default classes
	@Override // annotation 
	public int chargeInterest() {
	 return 3;
	 }
}















