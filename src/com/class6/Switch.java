package com.class6;

public class Switch {

	public static void main(String[] args) {
		// 
//		int day=5;
//		String dayName;
//		if (day==1) {  //  always checking the BOOLEAN!
//			dayName="Monday";
//		} else if (day==2) {
//			dayName="Tuesday";
//		}else if (day==3) {
//			dayName="Wednesday";
//		}else if (day==4) {
//			dayName="Thursday";
//		} else if (day==5) {
//			dayName="Friday";
//		}else if (day==6) {
//			dayName="Saturday";
//		}else if (day==7) {
//		dayName="Sunday";
//		}else {
//			dayName="Invalid";
//		}
//	System.out.println("Today is "+dayName);
	
	   //SWITCH ---> always checking the VALUE! it's either == or !=
		int day=4;
		String dayName;
		
		//down we put our variable that we want to check--day
		switch (day) {  // we compare here int day=5.
		case 1:
			dayName="Monday";
			break;
		case 2:	  //using only equality, it checks the value! values has to be matched.
			dayName="Tuesday";
			break; // tells you to get out of the switch block after it found the matching value!!!
		case 3:
			dayName="Wednesday";
			break;
		case 4:  //always should be distinct! 
			dayName="Thursday";
			break;
		case 5:  // duplicate cases are not allowed!
			dayName="Friday";	
			break;
		case 6: 
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default: // the same as "else"! it's optional and can appear anywhere inside of the 
			dayName="Invalid";
	}		
}
}
