package com.class11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number
		
		int [] numbers= {100, 20, 13, 406};
		
		int largest=numbers[0];//assign 100 to our largest value, we are assuming that it's the largest
		
		for (int i=0; i<4; i++) {
			if (numbers[i]>largest) {
				largest=numbers[i]; // first it will be 100, we'll compare 20 with 100/than 13 with 100; than 406 with 100-->406 becomes the largest value!!!
		}}
		System.out.println("the largest number is "+largest);
//-----------------------------------------------------------------------------------------------------------------------------------------------
		//2. using Advanced loops
		int largestNumber=0;
		for (int num:numbers) {
			if (num>largestNumber) {
				largestNumber=num;
			}}
			System.out.println("the largest number is "+largestNumber);
	}
// Write a program that prints the highest value in the array.
	
//	int[][] a = {
//			{5,2,3,7},
//			{1,5,1,1},
//			{8,3,1,2} };                                             //should be 8

//    int largest=a[0][0];
//    
//    for (int i=0; i<a.length; i++){
//      for (int j=0; j<a[i].length; j++){
//        if (a[i][j]>largest){
//          largest=a[i][j];
//        }
//      }
//    }
//    System.out.println(largest);		
//}	
}
