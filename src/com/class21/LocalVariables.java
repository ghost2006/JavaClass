package com.class21;

public class LocalVariables {

	public static void main(String[] args) {
	
		String name="John"; //name is visible only for main M!!// can't use an access modifiers with local v,and they can't be a static!!!
		System.out.println(name);
		
		LocalVariables obj = new LocalVariables();
		obj.hello(name);// hello Jack!- belongs to hello M -- to check press fn+f3
		System.out.println(name);//john-belongs to main M
	}
	public void hello(String name) { // name local
		name ="Jack";// we reassign it
		System.out.println("hello "+name); // when we finished our execution the variable name dies,it doesn't exist anymore!!
}
	
}
