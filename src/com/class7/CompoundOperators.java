package com.class7;

public class CompoundOperators {

	public static void main(String[] args) {

		int a= 10; //declare and assign the variable
		a=a+10; //reassign the value
		System.out.println(a);//20

		int b=100;
		b=b+100;
		System.out.println(b);//200
		
		int c=100;
		c+=100;// c=c+100; compound or shorthand operator !!!
		System.out.println(c);//200
		c+=35;//c=c+35; as c=200->235
		System.out.println(c);//235
		c+=50;// c=c+50;
		System.out.println(c);//235+50=285
		
		int d=30;
		d-=10;   // d=d-10;
		System.out.println(d); //20
		d+=50;  //d=d+50;
		System.out.println(d);//70
		d/=5;  //d=d/5;
		System.out.println(d); //14
		d%=4;
		System.out.println(d); //2
		
		/* 1. Declare variable and increase by 100 using shorthand operator
         * 2. Declare variable and decrease by 67 using shorthand operator
         * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
         * each person should get an equal piece of cake
         * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
         * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people*/
		
		//1
		int l= 2;
		l+=100;
		System.out.println(l);
		
		//2
		int n= 100;
		n-=67;
		System.out.println(n);
		
		//3
		int cakePiece=11;
		cakePiece/=4;
		System.out.println("Every person got "+cakePiece);
		
		//4
		int cakePiece1=25;
		cakePiece1%=7;
		System.out.println("The leftover is "+cakePiece1);
		
	}
}
