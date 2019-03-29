package com.home;

import java.util.Scanner;

public class Lkhjogkposkfb {
	public static void main(String[] args) {
		
	
	

//		 Write a program to find the average of row 2.
//       2 6 9 3 7
//       1 7 9 4 8
//       0 4 6 2 5
//       0 1 2 3

		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
	
		double sum=0;	//cause the result could be hole number or with decimals!!!!
		for (int i=0; i<rating[1].length; i++) {
		sum+=rating[1][i];
		}
		double avarage=sum/rating[1].length;
		System.out.println(avarage);
}

}
		
		
		
		
		
	

