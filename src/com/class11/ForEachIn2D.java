package com.class11;

public class ForEachIn2D {

	public static void main(String[] args) {
		/* create a grocery list: fruits{}
		 *                        veggies{}
		 *                        dairy{}
		 * retrieve all values using 2 different loops*/
		
		String [] [] groceryList= {{ "peach", "plum", "banana", "orange", "grape"},
				{"tomatoes", "cucumber", "cabbage"}, 
				{"sour cream", "milk", "cheese"}};
		
		for (int i=0; i<groceryList.length; i++) {
			for (int j=0; j<groceryList[i].length; j++) {
				System.out.print(groceryList[i][j]+",");
		}
			System.out.println();
		}
//2	-----------------------------------------------------------------------	
		
		for (String [] grocery:groceryList) {
			for (String groc:grocery) {
				System.out.print(groc+",");
			}
			System.out.println();
		}
		
 

		}
	}
		
			
		
		
		
		
		
		
		
		
