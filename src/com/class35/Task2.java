package com.class35;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		/*  Create a static method that will return a List of Exceptions.
			Inside your method create objects of 4 exception classes and store them inside your list.
			Call your method inside main and print name and details of all Exception objects.*/
		
	List<Exception>exceptionList=getList();   //we can call our Static Method only using it's name if it's in the same class!!!!
	
	System.out.println(exceptionList.size());
	for (Exception singleEx:exceptionList) {
		System.out.println(singleEx.getMessage());
	}
}
	public static List<Exception> getList(){
		
		List <Exception> list =new ArrayList<>(); // created an arrayList, cause List is an interface and can't be instantiated!!!
	//1st try catch for arithmetic ex	
	try {
		System.out.println(10/0); // we created a new obj of ArithmeticException
	} catch(ArithmeticException e) {
		list.add(e);
	}
	//2d try catch for arrayOutOfBounds ex	
	int []array= {1,78};
	try {
	System.out.println(array[2]); // new ArrayIndexOutOfBoundsException
	} catch (ArrayIndexOutOfBoundsException aioe){
		list.add(aioe);
	}	
	//3d try catch for mismatchInput ex	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Print any number");
	try {
		int input= scanner.nextInt();
	
	} catch (InputMismatchException ime) {
		list.add(ime);
	}
	//4th try catch for NullPointer ex	
	String str=null;
	try {
		System.out.println(str.length());
	} catch(NullPointerException npe) {
		list.add(npe);
	}
	return list;
	}

}
