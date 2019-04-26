package com.class26;

public class childSuper extends MainSuper {

	int a=3;
	String str="hot dog";
	char b='F';
	
		childSuper(String str){
			//super(str);
			System.out.println("from child with 1 parameter");
		}
		childSuper(String str, String str2){
			super(str,str2);
			System.out.println("from  child with 2 parameters");
		}
		public static void main(String[] args) {
			
			childSuper obj=new childSuper("hi");
			
			childSuper obj1=new childSuper("hi","hello");
			
			obj.print();
			obj.getVariables();
			
		}
		void print() {
			System.out.println(super.a+" "+super.str+" "+super.b);
			System.out.println(a+" "+str+" "+b);
		}
		public void getVariables() {
			super.getVariables();
			System.out.println("The values are "+a+" "+str+" "+b);
		}
	}

