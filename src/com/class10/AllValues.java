package com.class10;

public class AllValues {

	public static void main(String[] args) {
		
		             //   0   1   2   3   4   5
		char [] grades= {'A','B','C','D','E','F'}; //size is 6
		
	for (int i=0; i<grades.length;i++){
		//can't do i<=grades.length-->boundary error! as i--> =6,but we don't have element #6!our last #5!
		// BUT we can use--for (int i=0; i<=grades.length-1;i++) {
		System.out.println(grades[i]);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};  // OR int[] numbers1 = new int[10];
    int sum = 0;
    
    for(int i =0; i < numbers.length;i++) {
        
        //sum = sum + numbers[i];
          sum+= numbers[i];
    }
    	System.out.println("The sum of all array elements = " + sum);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /*Write a program to test if an array (from 1 to 10) contains a specific value 6. Hint: use a boolean flag.*/
   
    	boolean found = false; // our default value- false!
    for(int i =0; i <10; i++) {
        
        if(numbers[i] == 6) {
            found = true;
            break;
        }
    }
    	if(found == true) {
        System.out.println("The array contains the value 6" );
    }else {
        System.out.println("The array do not contain the value 6" );
    }
	
    
    
    
    
    
    
    
    
	}

}
