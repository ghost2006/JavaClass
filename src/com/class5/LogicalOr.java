package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*  we have 7 days a week
		 * if days are from 1-5---> weekdays
		 * if they are from 6-7 ---> weekend
		 * otherwise "Not a valid day"
		 */
		int day=4;
		    //false or false or false or true --> TRUE  - it's matching at least one condition!!
		if (day==1 || day==2 || day==3 ||day==4 ||day ==5) {
			System.out.println("It's a weekday");
			      //false or false --> FALSE
		} else if (day==6 || day==7){
			System.out.println("Its' a weekend");
		} else {
			System.out.println("Not a valid day");
		}
	}
}
