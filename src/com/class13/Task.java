package com.class13;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		/* Create a String and print it in reverse order (Sunday → yadnuS).
		 * Create a String and if the String is not empty perform the following: 
	    if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String*/

		String st="Good Evening!";
		
		for (int i=st.length()-1; i>=0; i--) { //>=!!
			System.out.print(st.charAt(i));
		}
		    System.out.println();
		
		if (!st.isEmpty()){
			if (st.length()%2!=0 && st.length()>=3) {
				System.out.println(st.charAt(st.length()/2));
			} else {
				System.out.println("Something went Wrong");
			}
		}else {
			System.out.println("Something went Wrong");
		}
		
	/*Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
	Example Output:                     Example Output:	
	Mom’s first name? Mary              Mom’s first name? Mary
	Dad’s first name? Daniel            Dad’s first name? Daniel
	Boy or Girl? boy                    Boy or Girl? girl
	Suggested baby name: DANRY          Suggested baby name: MAIEL */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter M name");
		System.out.println("Enter W names");
		System.out.println("Enter the gender of your baby");
		String firstMname= scan.nextLine();
		String firstWname=scan.nextLine();
		String gender=scan.nextLine();
		
		if (gender.equalsIgnoreCase("boy")) {
			System.out.println("Suggested baby name: "+firstMname.substring(0,firstMname.length()/2).concat(firstWname.substring(firstMname.length()/2)));
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name: "+firstWname.substring(0,firstWname.length()/2).concat(firstMname.substring(firstMname.length()/2)));
		}
		
		
		
		
		
		
		
		
	}		
		
	}

