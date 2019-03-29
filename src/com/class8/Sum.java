package com.class8;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum =sum+i;
			System.out.println(sum);//15 (0+1=1->1+2=3->3+3=6->6+4=10->10+5)
		}
		/*find sum of all even numbers from 1 to 100 inclusive*/
		
		int sum1=0;
		for (int i=0; i<=100; i+=2) {
			sum1=sum1+i;
			System.out.println(sum1);		
		}
		//------------------------------------------------------------------
		int sumAll=0;
		for (int y=10; y<=50; y+=10) {
			sumAll=sumAll+y;
		}
		System.out.println(sumAll);
	}
	
}

