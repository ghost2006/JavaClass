package com.class27;
public abstract class File {
	/*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract. 
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behavior: 
	 * Example: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed*/
	
	public abstract void open();
	
	public void edit() {
		System.out.println("You can open a file you'll need to download some particular apllication");
	}
	public void close() {
		System.out.println("You can close any file by pressing close botton");
	}
}
class JavaFile extends File{
	@Override
	public void open() {
		System.out.println("To open .java file we need to use notepad++ or sublime tex");
	}
}
class PDFFile extends File{
	@Override
	public void open() {
		System.out.println("To open .pdf file we need to use PDF Reader or Adobe Acrobat Reader");
	}
}
class WordFile extends File{
	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed");
	}	
}