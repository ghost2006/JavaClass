package com.class27;

public class FileTest {

	public static void main(String[] args) {
		
		File file1=new JavaFile();
			file1.close();
			file1.edit();
			file1.open();
		
		File file2=new WordFile();
			file2.close();
			file2.edit();
			file2.open();
			
		File file3=new PDFFile();
			file3.close();
			file3.edit();
			file3.open();
	}

}
