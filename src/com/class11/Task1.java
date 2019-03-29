package com.class11;

public class Task1 {

	public static void main(String[] args) {
		//

		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jordan", "Jackson", "Obama" } };
		
		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][1] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);
	
	/*2. Create a 2D array that first row will contain 4 names and second row will contain grades. 
		Then you program should print name of the students that has as an A and B grade*/
		String[][] grades = { {"Alan", "Bill", "Jack", "Olga"}, 
				{ "A", "B", "C", "D"} };
		
		System.out.println(grades[0][0] + " " + grades[1][3]+" "+grades[0][1]+" "+grades[1][2]+" "+grades[0][2]+" "+ grades[1][1]+" "+grades [0][3]+" "+grades[1][0]);
	
	
	
}
}