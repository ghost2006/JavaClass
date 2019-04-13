package com.class22;
public class SyntaxStudent {
/*schollName
 * batchNumber
 * studentName
 * studentLastName
 * 
 * getStudentDetails
 */
	public static String schoolName= "Syntax";
	public static int batchNumber= 4;
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lastName){
		studentName=name;
		studentLastName=lastName;
	}
	
	public static void main(String[] args) {

	}
 public void getStudentDetails() {
	String details="I am student at "+ schoolName+ " from batch "+ batchNumber+ " and my name is "+ studentName+" "+studentLastName;
	 System.out.println(details);
 }
}
