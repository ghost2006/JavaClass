package com.class10;

public class Task {

	public static void main(String[] args) {
		// 1. Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		char [] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		/* char [] grades=new char [6];
		 * grades[0]='A';
		 * grades[1]='B';
		 * grades[2]='C';
		 * grades[3]='D';
		 * grades[4]='E';
		 * grades[5]='F';
		 * System.out.println(grades[1]);
		*/
		
		//2.Create an array of names and store all names of your group. Then print your name from that array.
		//(use 2 different ways of creating an array).
		
		String [] group= {"Douglas", "Liza", "Rayan", "Kasu", "Valeriia"};
		System.out.println(group[4]);
		
		/*String [] groups= new String [5];
		 *  group[0]="Douglas";
		 *  group[1]="Liza";
		 *  group[2]="Rayan";
		 *  group[3]="Kasu";
		 *  group[4]="Valeriia";
		 *  System.out.println(group[4]);
		 */
		
		/*3.Create an array of words: Java, Saturday, day, coding, is. 
		Print the following sentence using element of array: “Saturday is Java coding Day”.*/
		
		String [] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		System.out.println("The size of our array is "+words.length);
		
		/*String [] words=new String [5];
		 * words[0]="Java";
		 * words[1]="Saturday";
		 * words[2]="day";
		 * words[3]="coding";
		 * words[4]="is";
		 *  System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		 */
		
	}
	
	
}
