package com.class21;

import com.class20.Task2;

public class TestAccessModifiers {

		public static void main(String[] args) {
			Task2 obj=new Task2();
			
			obj.checkIfStringiIsPalindrome("Hello"); //accessing public method in different package
			System.out.println(obj.name3);////accessing public variable in different package
		}

}
