package com.class7;

public class Loops {

	public static void main(String[] args) {
		
		/* to eliminate repetition we use LOOPS in Java:
			1. while
			2. do while
			3. for
			enhanced foor loops() (for each loop) //collections or arrays
		*/
		boolean morning=true;
		
		/*if(morning) {
			System.out.println("Good Morning"); -->print only once!
		}
		*/
//		while (morning) {
//		System.out.println("Good Morning");//-->it will print infinite number of times - its infinite loops
	
		int a=1;
		while(a<10) {
		System.out.println("Good Morning");
		a++;
		}
	  //
		int b=1;
		while (b<5) {  //first it checks the condition! it should be true!
			System.out.println("I'm inside while loop one"+b);
			b++;
		}
		System.out.println("I'm outside of while loop");
		
		// i want to print the values from 10 to 20 inclusive;
		int z=10;
		while(z<=20) {
			System.out.println(z);
			z++;
		}
		// i want to print values from 1 to 20 inclusive but all in 1 line with space;
		int q=1;
		while (q<=20) {
			System.out.print(q+" ");
			q++;
		}
		// i want to print values from 10 to 1
		int e=10;
		while(e>=1) {
			System.out.println(e);
			e--;
		}
		
		
	}
}
