package com.class11;

public class CheckIfRowsEqualToColumn {

	public static void main(String[] args) {
		/*Write a program that checks if a 2-D integer array is a square array, meaning, if its rows and columns are equal.
Hint:
		int[][] a = { {1,1,1},
					  {1,1,1},
					  {1,1,1}}; //should be true
		
		int[][] b = { {1,1,1,1},
			          {1,1,1,1},
		          	  {1,1,1,1} } //should be false*/

		int[][] a = {
				{1,1,1}, 
				{1,1,1},
				{1,1,1}   };
	
		boolean equality=true;                                                      //should be true
	  for (int i=0; i<a.length; i++){  
	      if (a.length!=a[i].length){
	      equality=false;
	  } 
	     }
	  System.out.println(equality);
//------------------OR ANOTHER WAY----------------------------------------------------------------------------------------------------------------
	  
    int row=0;
    int col=0;
        for(int i=0;i<a.length;i++) {
            row++;
        if(a.length==a[i].length) {
            col++;
        }
    }
    if(row==col)
    	System.out.println("true");
		
		
		
		
	}

}
