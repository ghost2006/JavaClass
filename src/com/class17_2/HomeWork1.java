package com.class17_2;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/* 1. Write a program that reads a range of integers (start and end point, 
		provided by a user and then from that range prints the sum of the even and odd integers*/

		Scanner scan= new Scanner (System.in);
		System.out.println("Enter start value");
		int start=scan.nextInt();
		System.out.println("Enter end value");
		int end=scan.nextInt();
		
		int sumE=0;
		int sumO=0;
		
		for(int i=start; i<=end; i++ ) {
			
			if (i%2==0) {
				sumE=sumE+i;
			} else {
				sumO=sumO+i;
			}
		}
			System.out.println("The sum of even numbers= "+sumE);
			System.out.println("The sum of odd numbers= "+sumO);
			
			
			
		}
		
		}
		

