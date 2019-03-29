package com.class9;
public class NestedLoopsRew {
	public static void main(String[] args) {
		
		/* Write a program that prints the following pattern
		1 2 3 4 5 6 7 8 9 10
		2 4 6 8 10 12 14 16 18 20 --->2nd row is twice 1st row!
		3 6 9 12 15 18 21 24 27 30   ----->each column starts from 1st number of row * next column(1*3); (2*3); (3*3);(4*3);(5*3);(6*3);(7*3)..(10*3)
		4 8 12 16 20 24 28 32 36 40-->it's 3 times 1st row
		5 10 15 20 25 30 35 40 45 50 --->(5*1); (5*2); (5*3);(5*4)..(5*10) */

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=10;j++) {
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		 /* Write a program that prints the following pattern
	        * ....1
	        * ...22
	        * ..333
	        * .4444
	        * 55555
	  1 to 5--->1st loop
	  1 to 5-i-->2d loop
	  1 to i --->3d loop*/
		
		for (int i=1; i<=5; i++) {  //our rows;
			for (int j=1; j<=(5-i); j++) {  //prints dots						
				System.out.print(".");
			}
			for (int l=1; l<=i; l++) { // prints numbers!
				System.out.print(i);
			}
				System.out.println();
		}
		
		/* Write a program that prints the following pattern
	....1
	...2
	..3
	.4
	5   */
		for (int i=1; i<=5; i++) {  
			for (int j=1; j<=(5-i); j++) {  						
				System.out.print(".");
			}
				System.out.println(i);
		}
		
		
		
		
		
		
		
	
}
	}
