package com.class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		
		/* ask user to enter price and boolean value for sale
		 * based on the sale we'll check the price:
		 * if price<20--> apply discount 20% and give the final price
		 * if price is>20 less <100--> discount of 30% and give the final price
		 * if price is>100 less 500--> apply 50% discount and give the final price */

		Scanner scan = new Scanner (System.in);
		boolean sale; int discount; int price; double finalPrice;
		
		System.out.println("Please enter if there is sale");
		sale=scan.nextBoolean();
		
		if (sale) {
			
			System.out.println("Please enter price of the item");
			price=scan.nextInt();
			
			System.out.println("Let's check all discounts");
				if (price<20) {
					discount=20;
					finalPrice=price-(price*0.2);
				} else if (price>=20 && price<100) {
					discount=30;
					finalPrice=price-(price*0.3);
				}else if (price>100 && price<500) {
					discount=50;
					finalPrice=price-(price*0.5);
				}else {
					discount=75;
					finalPrice=price-(price*0.75);
				}
				System.out.println("the final price is "+finalPrice);
		} else {
			System.out.println("not interested");
		}
	}
}
