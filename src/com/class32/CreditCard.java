package com.class32;

public abstract class CreditCard {
	
	public String creditCardName;
	
	public CreditCard(String creditCardName){
		this.creditCardName=creditCardName;
	}
	public void openAccount() {
		System.out.println("Open "+creditCardName+" credit card");
	}
	public abstract void intrestRate();
	public abstract void annulaFee();
}
class Visa extends CreditCard{
	
	public Visa(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void intrestRate() {
		System.out.println(creditCardName+" Credit card has interest rate of 25%");	
	}
	@Override
	public void annulaFee() {
		System.out.println(creditCardName+"Credit card has anual fee of 250$");
	}
}
class AX extends CreditCard{
	
	public AX(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void intrestRate() {
		System.out.println(creditCardName+" Credit card has interest rate of 22%");	
	}
	@Override
	public void annulaFee() {
		System.out.println(creditCardName+"Credit card has No anual fee of 200$");
	}
}
class MasterCard extends CreditCard{
	
	public MasterCard(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void intrestRate() {
		System.out.println(creditCardName+" Credit card has interest rate of 20%");	
	}
	@Override
	public void annulaFee() {
		System.out.println(creditCardName+"Credit card has No anual fee");
	}
}