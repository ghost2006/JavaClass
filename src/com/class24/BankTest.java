package com.class24;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		BOA boa=new BOA();
		PNC pnc =new PNC();

		int interestRate;
		interestRate=bank.chargeInterest();
		System.out.println("bank charges Intrest= "+interestRate);
		
		System.out.println("bank charges Intrest= "+bank.chargeInterest());
		System.out.println("boa charges Intrest= "+boa.chargeInterest());
		System.out.println("pnc charges Intrest= "+pnc.chargeInterest());
		
	}

}
