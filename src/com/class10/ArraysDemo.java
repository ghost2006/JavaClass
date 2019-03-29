package com.class10;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] numbers=new int [4];
		//numbers[2]=5;
		numbers[0]=1;
		numbers[1]=15;
		numbers[3]=10;
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);//0
		
		numbers [0]=2;//we reassigned the value of array#0
		System.out.println(numbers[0]);
		
		//Array Creation
					//0, 1,  2 ,3 --index
		int []array= {10,20,30,40};//a shorter way
		System.out.println(array[2]);
		System.out.println(array.length);// trying to find the size of our array!!
		
		//string of names-5 ;
		
		String [] names= {"John","Mike","Jane","Talgat","Olga"};
		System.out.println("There are "+names.length+ " values in my array of names");
		System.out.println(names[2]);
		
		//int [] numbers;
		//numbers={10,20,30}; --> this won't work, they should be on one line
		
		
		
	}
	
	
	
	
	

}
