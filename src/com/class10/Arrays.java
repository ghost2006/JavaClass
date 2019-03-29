package com.class10;

public class Arrays {

	public static void main(String[] args) {
		// 

		int num; 
		num=10;//int num=10;
		
		int[] array1;// declaring an array-array type of integers--> preferred way
		int [] array2;//declaring an array AND not specifying the size of array!
		int array3[]; //declaring an array
		
		array1=new int[4];//creating our array and telling that we store 4 values;-initialize or create an array
	
		array1[0]=10;	//we assigning the value! 
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//access the values only through our indexes 
		System.out.println(array1[0]);
		
	int [] numbers=new int[3];//declar+initialization in one line (11 and 15 lines combined together). here we specify the size of array
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		//numbers[3]=20;no error during compilation but error during the run time
		//System.out.println(numbers[3]);//ArrayIndexOutOfboundsException<--when we trying to squeeze extra value in our array
		System.out.println(numbers[2]);
		System.out.println(numbers[2]/numbers[0]);//3
		System.out.println(numbers[0]+numbers[2]);//20
		
		String [] a= new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		System.out.println(a[1]+" friends");
	}
}
