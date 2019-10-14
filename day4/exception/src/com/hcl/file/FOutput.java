package com.hcl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {public static void main(String[] args) {
	FileInputStream src;
	FileOutputStream tar;
	try {
		src=new FileInputStream("C:/hcljava/day4/exception/src/com/hcl/exception/Custom.java");
		tar=new FileOutputStream("c://files/target.txt");
		int ch;
		while((ch=src.read()) !=-1){
			tar.write((char)ch);
		}
		src.close();
		tar.close();
		System.out.println("file copied");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
