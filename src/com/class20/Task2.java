package com.class20;
public class Task2 {

	public static void main(String[] args) {

		Task2 obj =new Task2();
		System.out.println(obj.reverse("Sugar"));
		System.out.println(obj.checkIfStringiIsPalindrome("civic"));
		String [] array=obj.returnArray("Hi How Are You");
		for (int i=0; i<array.length; i++) { //to print all array elements we use a loop
			System.out.println(array[i]);
		}
		System.out.println("-----------------------------");
		for (String word:array) {
			System.out.println(word);
		}
	}
 //Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
	
	String reverse (String a) {   //protected or default!
		String reversed="";
		for (int i=a.length()-1; i>=0; i--) {
			reversed+=a.charAt(i);
		}
		return reversed;
	}
	//Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
	
	public boolean checkIfStringiIsPalindrome(String str) {
//		String reversed="";               // or boolean flag=false; than flag=true;
//		for (int i=str.length()-1; i>=0; i--){ 
//			reversed+=str.charAt(i);
//		}
		String reversed =reverse(str); //we used 1st M inside of this one
		
		if (str.equalsIgnoreCase(reversed)){
			return true;
		}else {
			return false;	
		}
	}
	//Create a method that will take a string and return array of words from that string. Method should be available only within same class.
	private String [] returnArray(String str) {
		String [] arr = str.split(" ");
			return arr;
		}
	}
	

