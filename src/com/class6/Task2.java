package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String language;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		String country=scan.nextLine();
		
		switch (country) {
		case "USA":
			language="English";
			break;
		case "Italy":
			language="Italian";
			break;
		case "England":
			language="English";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Ukraine":
			language="Ukrainian";
			break;
		case "Poland":
			language="Polish";
			break;
			default:
				language="Unknkown";
		}
		System.out.println("You speak "+language);
	}
}
