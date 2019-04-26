package com.class28;

public class BankTest {

	public static void main(String[] args) {
		
		//Bank bank=new Bank();// can't be instantiated
		
		Bank bank=new BOA();
			bank.hasChecking();
			bank.hasSavings();
			bank.hasSavings();
			
		Bank bank1=new PNC();
			bank1.hasChecking();
			bank1.hasSavings();
			bank1.hasSavings();

			//Bank.hello="bye";--> can't assign,cause it's final
			//bank.hello;
			System.out.println(Bank.hello);// can access only through static way
			
	}

}
