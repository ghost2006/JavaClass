package com.class9;

import java.util.Scanner;

public class NestedPyramid {
	public static void main(String[] args) {
		 
		/*    *     
		 *   ***    
		 *  *****    
		 * ********  */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter layers #");
		int num=scan.nextInt();
		for(int i=0;i<num;i++) {
	         for(int j=0;j<num-i;j++) { //printing space
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("* "); //we're printing space here as well!
	        }
	        System.out.println();  
	    }

		System.out.println("-----------");
		
/*    * * * * *
      * * * *
      * * * 
      * *
      *           */
		
		int rows = 5;

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------");	
/*     1 2 3 4 5
       1 2 3 4 
       1 2 3
	   1 2
	   1          */
        
        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		
        System.out.println("-------------");
        
 /* * * * * * * * * *
     * * * * * * *
       * * * * *
        * * *
          *      */
        
        for(int i = rows; i >= 1; --i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            for(int j=i; j <= 2 * i - 1; ++j) {  //stars
                System.out.print("* ");
            }
            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("-------------");
        
  /*    1
        2 3
        4 5 6
        7 8 9 10     */
        
        int row = 4, number = 1;

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }

            System.out.println();
        }   
        
        
	}

}
