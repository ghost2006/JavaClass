package com.class25;

public class Student {

	public void study(){
		System.out.println("Students must study");
		}
	protected void doHomework() {
		System.out.println("Students must do homework");
	}
	void attendClasses(String str) {
		System.out.println("Students must attend the classes");
	}
	//creating child specific private method doResearch
	private void doResearch() {//private members can't be inherited that's why --> can't override private methods
		System.out.println("Students must do research");
	}
}
