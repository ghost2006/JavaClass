package com.class8;

public class ForLoops {

	public static void main(String[] args) {
		
		/* for ( int i=0;                  i<=5;                   i++) {
		 *initialize(assign) the variable--provide/test condition--inc/dec)
		 *System.out.println("Good Morning");
		 *}                                                             
		 *First we initialize(happened only once)-->check our condition,execute code-->increment-->
		 *check the condition-->inside of code,execute code-->increment-->checking our condition again */
  
		for (int i=0; i<=5; i++) { //i local variable for our loop
			System.out.println("Good Morning"+i);
		}
		/* i want to print numbers from 10 to 1 */
		
		for (int i=10; i>=1; i--) {  //use FOR LOOP if we know how many times we should execute our code
			System.out.println(i);
		}
		/* want is the output?*/
		for (int a=0; a<=20; a+=2) {
		System.out.println(a);
	}
		
		for (int b=1; b<=50; b+=5) {
			System.out.println(b);
		}
		
		for (int b=1; b>=50; b+=7) {
			System.out.println(b); //won't start our loop-condition is false
}
		
		
		
		}
}