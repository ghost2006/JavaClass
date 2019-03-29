package com.class11;

public class MUltidimensionalArray {

	public static void main(String[] args) {
		// create 2D array;
//1. using keyword
		int[][] d = new int[4][4];// 4 rows and 4 columns=16 elements
		// 1st row
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;
		// 2d row
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
		// 3d row
		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;
		// 4th row
		d[3][0] = 100;
		d[3][1] = 200;
		d[3][2] = 300;
		d[3][3] = 400;
		System.out.println(d[1][2]);// 3
		System.out.println(d[2][3]);// 20

//2. second way using literal
		int[][] c = { { 12, 13, 14, 15 }, { 1, 2, 3, 4 }, { 5, 10, 15, 20 }, { 100, 200, 300, 400 } };
		System.out.println(c[3][1]);// 200
		System.out.println(c[0][0]);//12
		
		
		
		
		
	}
}
