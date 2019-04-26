package com.home;

public class StringBuilderExample {

	public static void main(String[] args) {

	/* StringBuilder Class creates a String without storing all those String values
	 * StringBuilder is not immutable */
		
		StringBuilder sb=new StringBuilder("start");
		sb.append("+middle"); //returns the reference to the sb, which was ignored 
		StringBuilder same=sb.append("+end"); // same is pointing to the same object and will print the same as sb
		
		System.out.println(sb);
		System.out.println(same);

		// There is only 1 strBuilder obj
		StringBuilder a=new StringBuilder("abc");
		StringBuilder b=a.append("de"); //abcde   ---> 2 variables (a,b) referring to the obj!
		b=b.append("f").append("g"); //abcdefg    ---> they are still referring to the same obj
		
		System.out.println(a);//abcdefg
		System.out.println(b);//abcdefg
//------------------------------------------------------------------------------------------------------------------------------		
	// Creating a StringBilder
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder("animal"); //StringBuilder contains a specific value & assigned sb2 to point to it
		StringBuilder sb3= new StringBuilder(5); //want to reserve a certain # of slots for characters 
	
		//-------StringBuilder Methods-----------------------------------------------------------------------------------------
 /*charAt(), indexOf(), length(), and substring() work exactly the same as in String class */
		
		StringBuilder c= new StringBuilder("animals");
		String sub= c.substring(c.indexOf("a"), c.indexOf("al")); //anim
		int len= c.length(); //7 ---> returns 7-size of StringBuilder!
		char ch= c.charAt(6);// returns the character 's' at index 6
		System.out.println(sub+ " "+len+" "+ch); //anim 7 s
		
// append() adds the parameter to the StringBuilder and returns a reference to the current StringBuilder		
		
		StringBuilder d= new StringBuilder().append(1).append('c');
		d.append("-").append(true);
		System.out.println(d); //1c-true
		
//insert () adds characters to the StringBuilder at the requested index and returns the reference to the current StringBuilder;
//		StringBuilder.insert(int offset, String str);
		
		StringBuilder e= new StringBuilder("animals");
		e.insert(7, "-"); // animals-
		e.insert(0, "-"); // -animals
		
//delete() is the opposite method of insert-- it removes characters from the sequence and returns the reference to the current StringBuilder;
		
//deleteCharAt() -when you want to delete only one character	
		StringBuilder f= new StringBuilder("abcdef");
		f.delete(1, 3); //adef -->we deleted bc
		//f.deleteCharAt(5); error--> we have"adef" has only 4 characters, so we'll get a outOfBoundaryException
		
// reverse()-- reverses the characters int the sequences and returns the reference to the current StringBuilder;
		
		StringBuilder j= new StringBuilder("ABC");
		System.out.println(j.reverse()); //CBA

// toString() -- converts a StringBuilder into a String        String Var= StringBuilder.to String();
		String str=j.reverse().toString();
		System.out.println(str);
	}

}
