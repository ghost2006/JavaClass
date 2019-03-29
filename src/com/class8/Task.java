package com.class8;
public class Task {
	public static void main(String[] args) {
		
		//  numbers 1 to 100
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		//from 100 to 1
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		//1. from 1 to 20 odd numbers
		for (int i=1; i<=20; i+=2) {
			System.out.println(i);
		}
		//2.
		for (int i=1; i<=20; i++) {
			if(i%2==0) {
			System.out.println(i);
		}
		}
		//1. from 20 to 1 even numbers
		for (int i=20; i>=0; i-=2) {
			System.out.println(i);
		}
		//2.
		for (int i=20; i>=0; i--) {
			if (i%2==0) {
			System.out.println(i);
		}}
		//1. even numbers between 20 and 50
		for (int i=20; i<=50; i+=2) {
			System.out.println(i);
		}
		//2.
		for (int i=20; i<=50; i++) {
			if(i%2==0) {
			System.out.println(i);
		}
			}
		//1. print odd numbers between 50 and 20
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		//2.
		for (int i=20; i<=50; i++) {
			if(i%2==1) {
			System.out.println(i);
		}
		}
		//print even numbers between 50 and 20
		for (int k=50;k>=20; k--) {
			if (k%2==0) {
				System.out.println(k);
			}
		}
	}
	}
