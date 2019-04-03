package com.class13;

import java.util.Scanner;

public class InterQuestions {

	public static void main(String[] args) {
		
//1. Write a program to swap 2 numbers without a temporary variable? 
		System.out.println("TASK1");
		
		int k = 1;
		int l = 2;
		k=k+l; //3
		l=k-l; //1
		k=k-l; //2
		System.out.println("k= "+k + " ,l= "+l);
		
//1. Swap 2 strings without a temporary variable?
		
		String a="syntax";
		String b="engineer";
		
		a=a+b; 
		b= a.replace(b, "");
		a= a.replace(b,"");
		System.out.println(a);
		System.out.println(b);
//2d way		
		a=a+b; //looparray
		b=a.substring(0, (a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
//2. Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		System.out.println("TASK2");
		
		int aR []= {1,54,9,0,311};
		int max = aR[0];
		for (int i=0; i<aR.length; i++) {
			if (aR[i]>max) {
				max=aR[i];
			}
		}
		System.out.println(max);
		
		int min = aR[0];
		for (int i=0; i<aR.length; i++) {
			if (aR[i]<min) {
				min=aR[i];
			}
		}
		System.out.println(min);
		
//3. Find out how many alpha characters present in a string?	
		System.out.println("TASK3");
		
		int count=0;
		String c="Good !@#$ QWerty";
		//c=c.toLowerCase() OR see below line 66;
		for (int i=0;i<c.length(); i++) {
			if (c.toLowerCase().charAt(i)>'a' && c.toLowerCase().charAt(i)<'z') {
				count++;
			}
		}
		System.out.println(count);
// 2d way 
		System.out.println(c.replaceAll("[^A-Za-z]","").length());

//4. How to find out the part of the string from a string? What is substring? Find number of words in string?	
		System.out.println("TASK4");
	
		String d="Good morning all";
		String [] array =d.split(" ");
		System.out.println(array.length);
		
//5. Write a java program to reverse String? 
		
		System.out.println("TASK5");
		String e="Good morning Lera";
		String reverse="";
		char arrayrev [] =e.toCharArray();
		for (int i=arrayrev.length-1; i>=0; i--) {
			reverse=reverse+arrayrev[i];
		}
		System.out.println("Reversed String is: "+ reverse);
		
//Reverse a string word by word?		
		
		String word="";
		String [] words= e.split(" "); //we split it -->to see how many words we have! words={good, morning, lera}
	
		for (int i=words.length-1; i>=0; i--) { //convert array to the string
			word += words[i]+" ";
		}
		System.out.println(word.trim());
		
	//6. Write a Java Program to find whether a String is palindrome or not?	
// Ex: level, madam,refer, civic, radar...
		System.out.println("TASK6");
		
		String reverseWord="";
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a word to check whether it's palindrome or not");
		String input= scan.nextLine();
		
		for (int i=input.length()-1; i>=0; i--){ //to reverse our word
			reverseWord+=input.charAt(i);
		}
		if (input.equalsIgnoreCase(reverseWord)){// to check if it's the same in reversed position
			System.out.println("The word "+input+ " is a palindrome");
		}else {
			System.out.println("The word "+input+ " is not a palindrome");	
		}
		
// 7. Write a java program to check whether a given number is prime or not
//Prime number is a number that is greater than 1 and is only divisible by 1 or itself (2, 3, 5, 7, 11, 13, ... 29, 31..109, 113, 127, 131, 137, 139, 149, 151)*/
		System.out.println("TASK6");
	    
		 int number;
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter any number");
		    number = scanner.nextInt();//15
		    boolean prime = true;
		    for (int i=2; i<number;i++) {//  we starts from 2-->i=2!!!
		    	if (number%i!=0) {//we want to cut the condition that our number/itself or /by 1.
		    	}else {
		    		prime = false;
		    		// System.out.println("the number is not a prime");
		    		break;
		    	}
		    }
		   System.out.println(prime);
			
 
//  8. Write a Java Program to print first 10 numbers of Fibonacci series.
		   // 1 2 3 5 8 13 21 34 55 89 144  
		      //1= 0+1  2= 1+1  3= 1+2     5= 2+3      8= 3+5 13= 5+8
		       //  a b         //3=b+(a+b) sum=b+(a+b) sum=b+(a+b) 
		
	    int aa=0;
	    int bb=1;
	     
	   for (int i=0; i<10; i++) {
		   System.out.println(aa+bb);
		   if (i==0) {
			   
			   continue;
		   }
		   bb=aa+bb;
		   aa=bb-aa;
	   }
	   
	   
	   
	   
	   
	   
	   
	   	}  
      
	}
