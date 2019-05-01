package com.class30;

public class CollectionConcept {
	
	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		int c=30;
	
		int [] array= {10,20,30,40};
		int [] intArray= new int[3];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		System.out.println(intArray[2]);
		
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		 for(int num:intArray) {
			 System.out.print(num+", ");
		 }
	
		 
}
}
