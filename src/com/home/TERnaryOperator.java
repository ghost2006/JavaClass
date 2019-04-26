package com.home;

public class TERnaryOperator {

	public static void main(String[] args) {
		 
		 int i = 1;
		 int b2 = 5;
		 if(i < b2)
			 System.out.println("True");
		 else
			 System.out.println("False");
		 
/*This operator evaluates a boolean expression and assign the value based on the result.
  If the expression results true then the first value before the colon (:) is assigned to the variable num1 else the second value is assigned to the num1.
  
    variable num1 = (expression) ? value if true : value if false
		 
 Expressions can be without ()   Expressions ALways return a value!!!!
         (BOOLEAN expression) ? (expression #1):(expression #2); */
		 
		 String s = (i < b2) ? "True" : "False";
		 System.out.println(s);
		 
		 String s2 = (i < b2) ? (i < 2)? "Cool" : "Bad" : "----";
		 System.out.println((i > b2) ? (i < 2)? "Cool" : "Bad" : "----");
		 System.out.println((i < b2) ? (i >2)? "Cool" : "Bad" : "----");
		
		 //      false----------------------------->awesome
		 String q= b2<i ? b2==0? "Nice":"Excelent":"Awesome";
		 System.out.println(q);
		 //      true----->false--------->excellent
		 String q1= b2>i ? b2==0? "Nice":"Excellent":"Awesome";
		 System.out.println(q1);
		 
		 System.out.println((i>b2)?21:"Horse");
		// int animal=(i>b2)?21:"Horse"; doesn't compile! "Horse"can't be assigned to the int;
		 String animal=(i>b2) ? "Cat":"Dog";
		 System.out.println(animal);//Dog
		 
		 boolean b4 = i < b2 ? true : false; // true
		 boolean b3 = i > b2 ? true : false; // false
		 System.out.println(b4);
		 System.out.println(b3);

		 int l=1;
		 int m=1;
		 final int z= l<10 ? l++ : m++;
		 System.out.println("l="+l+" m="+m);//l=2 m=1 --> 1<10--> l++ --> we incremented only l!
		 
		 int k=1;
		 int p=1;
		 final int w= k>=10 ? k++ : p++;
		 System.out.println("k="+k+" p="+p);//k=1 p=2 --> 1<10--> p++ --> we incremented only p!
//------------------------------------------------------------------------------------------------------------------------------------------------------------		 
		 int num1, num2;
	        num1 = 25;
	                                    /* num1 is not equal to 10 that's why the second value after colon is assigned to the variable num2 */
		num2 = (num1 == 10) ? 100: 200;
		System.out.println( "num2: "+num2);
		                                /* num1 is equal to 25 that's why the first value is assigned to the variable num2 */
		num2 = (num1 == 25) ? 100: 200;
		System.out.println( "num2: "+num2);
	   }
		
	}


