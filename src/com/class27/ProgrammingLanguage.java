package com.class27;

public abstract class ProgrammingLanguage {
	
	public void understandLogic() {
		System.out.println("To learn programming you must understand logic");
	}
	public void knowSyntax() {
		System.out.println("To learn programming you must know syntax");
	}
	public abstract void writeCode(); // the implementation of this M is hidden to this class
	public abstract void debug();
}

class Java extends ProgrammingLanguage{
	@Override
	public void writeCode() {
		System.out.println("To learn Java programming you must use Eclipse, Netbeans, IntelliJ");
	}
	@Override
	public void debug() {
		System.out.println("In Java to debug use Eclipse");
		
	}
	
}
class CSharp extends ProgrammingLanguage{
	@Override
	public void writeCode() {
		System.out.println("To learn C# programming you must use Visual Studio");	
	}
	@Override
	public void debug() {
		System.out.println("To do debug in C# need to use Visual Studio");
	}
	
}