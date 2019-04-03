package com.class14;

public class Iq2 {

	public static void main(String[] args) {
		// 
		// Write a java program to find the second largest number in the array?
		
		int arr[] = {144,46,0,86,292,-1};
		int min=arr[0];//144  or min=0! if we put 1000 or 0 in our array this M doesn't work!!!
		int secondLargest= arr[0];//144
		int largest =arr[0];//144
		int secondMin= arr[0];
		
		for (int a:arr) {
			if (a> largest) {
				largest=a;
			}
			if (a<min) {
				min=a;
			}
		}
		for (int a :arr) {
			if (a>secondLargest && a<largest) {
				secondLargest=a;
			}
			if (a<secondMin && a>min) {
				secondMin=a;
			}
		}
		System.out.println("The min "+ min);
		System.out.println("The second min "+ secondMin);
		System.out.println("The second largest "+ secondLargest);
		System.out.println("The largest "+ largest);
		
		
		
		
		
		
		
		
		
		
		
	}

}
