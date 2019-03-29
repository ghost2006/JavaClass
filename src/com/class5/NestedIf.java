package com.class5;

public class NestedIf {

	public static void main(String[] args) {
		// check if user has a credit card-> check what is the balance--> if balance is >1000--> pay off immediately
		// else "you are good"
		
	
		boolean creditCard =true;
		int balance=1000;
		
		if(creditCard) {
			System.out.println("Let's check the balance");
				if (balance>=1000) {
					System.out.println("pay off immiditely");
				} else if (balance==0){
					System.out.println("please use your card");
				} else {
					System.out.println("you are good");
				}
		} else {
			System.out.println("do yo want a credit card");
		}
	}

}
