package com.class3;

public class ModulesOperator {
	public static void main(String[] args) {
	int a=10;
	int b=3;
	
	int div=a/b;
	System.out.println(div);//3 or 3.3. will be 3!!!
	
	//modulus operator
	int mod=a%b;
	System.out.println(mod); //it will show the remaining part of division
	
	
	int q=101;
	int w=10;
	System.out.println(q%w);//--->1  
	
	//parantheses,exponents,multiplication/division,modulus,addition/subtraction
	int e=-5+4*6;
	System.out.println(e);//19
	
	int x=(22+9)%7;
	System.out.println(x); //3
	
	int y = 20+ -3*5/8;  
	System.out.println(y);//19
	
	int z= 5+15/3*2-8%3;  //5+15-2 --> division_mult_mod
	System.out.println(z);//13
	
	int r = (5+15)/3*2-8%3; //parenthenses->div->mult->mod
	System.out.println(r);//10
}
}
