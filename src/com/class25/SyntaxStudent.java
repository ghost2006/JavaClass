package com.class25;

public class SyntaxStudent extends Student{
	
//Access modifiers can't be more restrictive comparing to Parent class!!!! we can make it bigger or the same .we can't reduce the scope of methods
	
	public void study(){
		System.out.println("Syntax Students must study hard");
		}
//	public boolean study(){ not possible, cause we don't have the return type in parent class
//		System.out.println("Syntax Students must study hard");
//		return true;
//		}
	protected void doHomework() { //can change the access modifiers to public
		System.out.println("Syntax Students must do repl");
	}
	void attendClasses(String str) {// can make them protected or public but not Private
		System.out.println("Syntax Students must attend the all classes and take notes");
	}
	// Private methods can't be overridden--> they do not participate in inheritance
	private void doResearch() {
		System.out.println("Syntax Students must make Google their best friend");
	}
	
}
