package com.class17;

public class LestedLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<=5;i++) {
			System.out.print(i);
		}
	
		/*i want to print  pattern
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789  ---> 5 rows-outer loop and 9 columns-inner loop
		 * 123456789 */

		for (int i=1; i<=5; i++) {
			for(int y =1; y<=9; y++) {
				System.out.print(y);//1234567896
			}
			System.out.println();// creates a new line for us!
		}
		
		/*i want to print  pattern
		 * 1111111
		 * 2222222
		 * 3333333
		 * 4444444 --->rows=7 and columns=7
		 * 5555555
		 * 6666666
		 * 7777777 */
		
		for (int i=1; i<=7;i++) {
			for (int y=1;y<=7;y++) {
				System.out.print(i);//1111111-->2222222
			}
			System.out.println();
		}
		
		/*i want to print  pattern
		 *     *****
		 *     *****
		 *     *****
		 *     *****--->rows=4 and columns=5*/
		
		for (int i=0; i<4;i++) {
			for (int y=0; y<5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*i want to print  pattern
		 *     54321
		 *     54321
		 *     54321
		 *     54321--->rows=4 outer loop and columns=5-inner*/
		
		for (int a=4; a>0; a--) {
			for (int b=5;b>0;b--) {
				System.out.print(b);
			}
			System.out.println();	
			}
		
		/*i want to print  pattern
		 * 55555
		 * 44444
		 * 33333
		 * 22222 --->rows=5 and columns=5
		 * 11111    */
		
		for (int a=5; a>0;a--) {
			for (int b=5;b>0;b--) {
				System.out.print(a);
			}
			System.out.println();	
			}
		
		/*    *      1 row 1 column
		 *    **     2 rows 2 columns--> columns depend on # of rows
		 *    ***    3 row 3 columns
		 *    ****   4 row 4 columns (columns are equal or less than # of rows) */
		
		for (int i=1; i<=4; i++) {
			for(int y=1;y<=i;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*  ******
		 *  *    *
		 *  *    *    row=4, column=6
		 *  ******    when our column ==1 or ==6 we print stars!!! and when row ==1 or ==4 we prints stars
		 */
		
		for (int i=1; i<=4;i++) {
			for (int y=1; y<=6;y++) {
				if (i==1 || i==4 || y==1 || y==6) {
					System.out.print("*");
				} else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		
			}
	}
