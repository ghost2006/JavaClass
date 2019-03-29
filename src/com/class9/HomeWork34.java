package com.class9;

public class HomeWork34 {

	public static void main(String[] args) {
		/* 3. Print the following pattern:
		1
		12
		123
		1234
		12345    5 rows; columns are == or less than # of rows*/
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//-----------------------------------------------------------------------------------------------------------------------------------		
		/* 4. Print the following pattern:
*
**
***
****
*****
****
***
**
*       */
		for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=5;i>=1;i--) {
            for(int j=1;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        /*for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1;i<=4;i++)
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
         * 
         */
	}
	}
