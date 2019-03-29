package com.class11;

public class TheAvarageOfTheRow {

	public static void main(String[] args) {

//		 Write a program to find the average of ROW 2.
//      2 6 9 3 7
//      1 7 9 4 8
//      0 4 6 2 5
//      0 1 2 3

		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
	
		double sum=0;	//cause the result could be hole number or with decimals!!!!
		for (int i=0; i<rating[1].length; i++) { //accessing the rows
		sum+=rating[1][i];
		}
		System.out.println(sum/rating[1].length);
		
//		Print the average of values in COLUMN 3.
	    
			 int sum1=0;
			 for (int i=0; i<rating.length; i++) {
					 sum1+=rating[i][2];
			 }
				 System.out.println(sum1/rating.length);	
		
		
// Find the number of values below the value of 7.		
		
		int numberOfValues=0;
		for (int i=0; i<rating.length; i++) {
			for(int j=0; j<rating[i].length; j++) {
				if (rating[i][j]<7) {
					numberOfValues++;
				}
			}
		}
		System.out.println(numberOfValues);
		
// 	Find the number of values above the value of 7.	
	int count=0	;
	for (int [] inner:rating) {	
		for (int element:inner) {
			if (element>7) {
				count++;
			}
		}
	}
	System.out.println("The number of all elements above 7 is "+count);
	}
}
