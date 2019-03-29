package com.class7;

public class Task {

	public static void main(String[] args) {
		// print only even numbers from 10 to 100

		int num=1;
		while (num<=100) {
			if (num%2==0) {
				System.out.println(num);
			}
			num++;
		}
	
		/* create a boolean variable WorkDay and assign true;
		 * create int variable day and assign to 1
		 * as long as it workDay print-->"i need a day off" and increment day
		 * day once is 6--> your condition for your loop should become false-> "i don't need a day off any more"*/
		
		boolean workDay=true;
		int day=1;
	
		while (workDay) {
			 System.out.println("I need a day off");
			 if(day==6) {
				 System.out.println("I do not need a day off");
				 workDay=false;
			 }
			 day++;
		}
		
		
		
		
		
	}
}
