package com.pack1;

public class Maximum {
	/* Write a program to find the maximum and minimum value of an array.*/
	//int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

	   static int findMax(int [] array) { //here we're passing array
		   
	   int max = array[0];
	
	   for (int j = 0; j < array.length; j++) {
	       if (array[j] >= max) {
	           max = array[j];
	       }
	   }  
	       return max;
	   }  
	   
//---------------------------------------------------------------------------   
	   
	       static int  findMin(int [] array) {
	    	   int min = array[0];
	    	   
	    	   for (int j = 0; j < array.length; j++) {
	    	   if (array[j] <= min) {
	           min = array[j];
	       }
	    	   }
	    	   return min;
	   }
	       


}
	
	   
	   
	   

