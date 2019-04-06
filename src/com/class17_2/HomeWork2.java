package com.class17_2;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		/*
		 * 2. Ask users to enter the item they want to buy and the price for the item.
		 * Then ask user to pay for it. Every time user enters money accumulate the
		 * amount and tell user how much is left to pay off the amount. Whenever user
		 * done with payments tell them "Thank you for shopping!" money=continues input
		 * from user total=total+ money; loop continues until total matches the price
		 */

		int price;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		String item = scan.nextLine();

		System.out.println("Please enter the price of your item");
		price = scan.nextInt();

		int paidMoney = 0;
		while (paidMoney < price) {
			System.out.println("Please pay for your item");
			int pay = scan.nextInt();
			paidMoney += pay;// 0+pay(50)=50 total. left-50
			if (paidMoney < price) {
				System.out.println("You have to pay additional amount: " + (price - paidMoney));
			} else if (paidMoney == price) {
				System.out.println("Thank you for shopping!");
			} else if (paidMoney > price) {
				System.out.println("You paid extra. Here is your change: " + (paidMoney - price));
			}
		}
		
		
		/* int pay;
		 * total=0;
		 * int balance;
		 * int change;
		 * do{ 
		 * System.out.println("Please pay for your item");
			pay = scan.nextInt();
			total=total+pay; --> accumulating the money user is paying!
			balance=price-total;
			if (total>price){
			change= total-price;
			System.out.println("Please take your change");
			break;
			} else if (total<price){
			balance=price-total;
			System.out.println("Please enter more $ "+balance);
			}
			}while (total!=price);
		 * System.out.println("Thank you for shopping!");*/
		
		
		
		
		
		}
	}
	
	
	
	
	

