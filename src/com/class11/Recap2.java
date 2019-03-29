package com.class11;

public class Recap2 {

	public static void main(String[] args) {
	
		int [][]arr={
			{1,2,3},  //1 array that is stored with index 0
			{10,20,30}, //2 array with index [1]
			{100,200,300}};  // 3d array index [2]
		
			        // how many total arrays
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");	
				}
				System.out.println();  //creating a new line for us
			}
//------------------------------------------------------------------------------------------------------------------------------------------------			
			System.out.println("---------FOR EACH LOOP------------");
// here we're looking through our 2d array; loop through each element inside of 2D array-->each element=array
			for (int[] singleArray:arr) { //we taking 1st array to singleARray; then 2d and 3d.we store all of them inside of it! (single arrays)
				//loop through each single array	
				for (int numbers:singleArray) { //we're looping through {1,2,3}...(here single numbers) during 3d iteration we're taking {100,200,300} and printing them
					System.out.print(numbers+" ");
				}
				System.out.println();
			}
			
			
			
			
		}
	}

