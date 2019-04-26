package com.class28;

public interface Bank { //it's not a class,it's an interface that should have only undefined methods
	
	//String name; we can't have any instance variables!!!!
	static String name="Bank";// by default all variables inside of interface become public static final. can have only static variables
	String hello="Hi";//by default --> public static final
	
	//by default Compiler adds public & abstract to every method in interface!!!
	 public abstract void hasChecking(); //can't have methods body
	 void hasSavings();
	 void hasCreditCard();
	 //static void hasLoan();--> can't have static abstract methods 
}
class BOA implements Bank{ // have to provide all implementations
	@Override
	public void hasChecking() {
	System.out.println("BOA has 2 checking accounts");	
	}
	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings accounts");	
	}
	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different credit cards");	
	}
}
class PNC implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");	
	}
	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings accounts");	
	}
	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different credit card");	
	}
	public void hasLoan() {
		System.out.println("PNC has loan");
	}
	
}