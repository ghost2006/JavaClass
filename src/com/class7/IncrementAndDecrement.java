package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// POST increment 
		//   a++;                   
		int a=299;
		int b=a++;//first assign -->increment
		         //   int b=a;    --->a=a+1
		System.out.println(a) ;//300
		System.out.println(b);//299
		
		//POST decrement
		//a--;
		int z=10; 
		int c= z--;// first assign---> decrement 
		          //   int c=z;   --->   z=z-1
		System.out.println(z);//9
		System.out.println(c);//10
		
	}
}
