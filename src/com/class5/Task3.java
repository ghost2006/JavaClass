package com.class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("please enter your quiz");
		int q = inp.nextInt();
		System.out.println("please enter your mid.term");
		int mT = inp.nextInt();
		System.out.println("please enter your final score");
		int fS= inp.nextInt();
		int sum = (q+mT+fS)/3;
		
		if (sum<50) {
			System.out.println("grade F");
		} else if (sum>=50 && sum<=70) {
			System.out.println("grade C");
		} else if (sum>=70 && sum<90) {
			System.out.println("grade B");
		}	else if (sum>=90)	{
			System.out.println("grade A");
		} 
		}
	}
