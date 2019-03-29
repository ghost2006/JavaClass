package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/* write a java program to ask user enter daily sales amount
		 * based on sales range commission will be different;
		* Example: sales is <100--> commission=2
		* sales more than 100 and less 200=5 */
		int commission;
		Scanner scan = new Scanner (System.in); //to enable our keyboard
		System.out.println("PLease enter sales amount");
		int sales=scan.nextInt();  //capture our input
		
		if (sales>0 && sales<100) {
			commission=2;
		}else if (sales>=100 && sales<200) {
			commission=5;
		} else if (sales>=200 && sales<500) {
			commission=10;
		} else if (sales>=500) {
			commission=20;
		} else {
			commission=0;
		}
		System.out.println("Your commission is "+commission);
	}

}
