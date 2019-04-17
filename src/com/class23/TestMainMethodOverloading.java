package com.class23;

public class TestMainMethodOverloading {

	public static void main(String[] args) {
		
		MainMethodOverloading.main(); //i am a maim Method with no parameters
		
		MainMethodOverloading.main("Hello");
		
		String [] array= {"hello", "bye"};
		MainMethodOverloading.main(array);//i am a maim Method with string argument array
		
		MainMethodOverloading.main(11);
	}

}
