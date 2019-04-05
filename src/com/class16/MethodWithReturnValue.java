package com.class16;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
		int stringLength=str.length();
		System.out.println(stringLength);

		char character=str.charAt(3);
		System.out.println(character);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		//String str=obj.askHowAreYou("Asel"); --> it'l show the error, this is not returnable M
		
		String day= obj.whatIsADay();//when we call this M we should use a String to store the string,that was returned 
		System.out.println("Today is "+day);
		
		// int num = obj.findLargest(20, 10); gives the error, it doesn't return anything
		obj.findLargest(20, 10);
		int largestNum=obj.findLargest1(20, 10);
		
		boolean isOdd;
		if (largestNum%2==0) { // we were able to do it,cause our M returned the value LargestNum!
			isOdd=false;
		}else {
			isOdd=true;
		}
		System.out.println(isOdd);
	}

	void askHowAreYou(String name) {// non returnable M
		System.out.println("How are you "+name);
	}
	
	String  whatIsADay() { // string our return type!
		return "Thursday";  // now this M returns a String (so we changed void to String!)
	}
	
	void findLargest(int a, int b) { // doesn't return anything
		if (a > b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");

		}
	}
	int findLargest1( int a, int b) {  // returns int
			if (a > b) {
				return a;
			} else {
				return b;

			}
		}
	
}
