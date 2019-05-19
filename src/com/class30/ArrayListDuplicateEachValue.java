package com.class30;

import java.util.ArrayList;

public class ArrayListDuplicateEachValue {
	
	public static void main(String[] args) {

		ArrayList<Integer> arList = new ArrayList<Integer>();
	
		for (int i=0; i<=5; i++) { //add 6 values from 0 to 5 inclusively
			arList.add(i);
		}
		System.out.println(arList); // [0, 1, 2, 3, 4, 5]
	
		int length = arList.size()*2;
		
		for (int i = 1 ; i < length ; i+=2) {
			arList.add(i, arList.get(i-1));
		}

		for (Integer element:arList){
			System.out.print(element+", ");
		}
		//Be careful with Integers
		arList.remove(2); //removes element at index 2 which is '1' !!!
		System.out.println(arList); //[0, 0, 1, 2, 2, 3, 3, 4, 4, 5, 5]

		arList.remove(new Integer(2)); //will remove number '2'
		System.out.println(arList); //[0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5]
	}


}
