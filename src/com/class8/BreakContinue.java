package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
	    //BREAK-------------------------------------------------------------------------------------------------
		for (int i=1; i<=10; i++) {
			if (i==5) {
				break; // break takes us completely out of the loop!!we skip our rest code!!!
			}
			System.out.println(i);
		}
		
	for (int g=0; g<=4; g++) {
		System.out.println("Hello");//it will print only 1 time!we don't have any conditions,so it'll stop after a break
		break;// our loop terminates
	}
		
		//CONTINUE-----------------------------------------------------------------------------------------------
		for (int i=0; i<=10; i++) {
			if (i==2 || i==3) {
				continue;//it interrupts our specific one iteration(it'll skip 2,3) it will print 0,1,4,5..
			}
			System.out.println(i);
		}
		System.out.println("I am outside of for loop");
	
		/* i want to print numbers from 1 to 20> but skip those that divisible by 3*/
		
		for (int a=1; a<=20; a++) {
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		
	}
}
