package com.class17_2;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		NestedLoops demo=new NestedLoops();
		
		demo.printNumber();
		demo.printAtriangle();
		demo.printAsquare();
		demo.printApatternWithNumbers();
		demo.printNumbers();
		demo.guessAnumber(8,15);
		
	}
	void printNumber() {
		for (int i=1;i<=3;i++) {
			for (int y=1; y<=3; y++) {
				System.out.println(i+" "+y);
				}
		}
	}
	
	void printAtriangle() {
	for (int i=1; i<=4; i++) {
		for(int y=1;y<=i;y++ ) {
			System.out.print("*");
		}
		System.out.println();
	} }	
	
	void printAsquare() {
	for (int i=1; i<=4;i++) {
		for (int y=1; y<=6;y++) {
			if (i==1 || i==4 || y==1 || y==6) {
				System.out.print("*");
			} else {
				System.out.print(" ");	
			}
		}
		System.out.println();
	}
		}
	
	void printApatternWithNumbers() {
	for (int a=4; a>0; a--) {
		for (int b=5;b>0;b--) {
			System.out.print(b);
		}
		System.out.println();	
		}}
	void printNumbers() {
	for (int i=1; i<=7;i++) {
		for (int y=1;y<=7;y++) {
			System.out.print(i);
		}
		System.out.println();
	}}
	
	void guessAnumber(int secretNumber, int number) {
	
	Scanner scan=new Scanner(System.in);
	for( int i=1; i<20; i++) {
		System.out.println("Please enter a secret number between 1 to 20");
		number=scan.nextInt();
			if (number>secretNumber) {
				System.out.println("Your number is too large");
			} else if (number<secretNumber) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("Congratulations!!. You got it!");
				break;
		}
	}}
	
}
