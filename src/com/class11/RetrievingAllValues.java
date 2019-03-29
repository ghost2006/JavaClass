package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		int [][]num= {
				{11,12,13,14}, //4
				{21,22,23,},//3
				{31,32,33,34}	};//4

		int rows=num.length;
		System.out.println(rows); //it gives our rows
		
		//to find our number of column  we should
		int cols=num[0].length;
		System.out.println(cols); //the length of each row/array!!
		
		for (int row=0; row<num.length; row++) { //gives us the # of rows
			for (int col=0; col<num[row].length; col++) { //we have our columns
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		
	//------------------------------------------------------------------------------------------------------------------------------------------	
		
		String [][] food= { {"burger", "fries", "hot dog", "meatloaf"}, // new String [3][4]; //1st array or row
							{"lo mein", "fried rice"},
							{"biriyani", "korma", "naan", "chick peas"}};
		
		for (int i=0; i<food.length; i++) {
			for (int j=0; j<food[i].length; j++) {
				System.out.print("I love "+food[i][j]+" ");
		}
			System.out.println();
		}
		
		
		
		
	}

}
