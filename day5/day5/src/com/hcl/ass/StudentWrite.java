package com.hcl.ass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentWrite {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=
					new FileOutputStream("c:/files/student.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Student s=new Student(1,"vinod","bangalore",8.8);
		objout.writeObject(s);
		objout.close();
		fout.close();
		System.out.println("file created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
