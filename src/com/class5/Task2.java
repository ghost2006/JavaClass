package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner (System.in);
		
		System.out.println("Please enter your height");
		int height= inp.nextInt();
	
		if (height<5) {                             // if (height==5 && height<6) { --> if we use this condition first> better to use AND
			System.out.println("you are short");    //System.out.println("you are medium");
		} else if (height==5 || height<6) {         //if else (height<5) {
			System.out.println("you are medium");   //System.out.println("you are short");
		}else if (height>=6) {
			System.out.println("you are tall");	
		} else {
			System.out.println("enter valid height");	
		}
	}
}
