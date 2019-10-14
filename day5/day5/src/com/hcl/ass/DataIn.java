package com.hcl.ass;
//getting from file


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
	public static void main(String[] args) throws IOException {
	
		try {
			DataInputStream din
			 = new DataInputStream(new FileInputStream("c:/files/data.txt"));
	
	int x=din.readInt();
	x++;
	System.out.println(x);
	String name=din.readUTF();
	System.out.println(name);
	double bas=din.readDouble();
	System.out.println(bas);
	boolean flag=din.readBoolean();
	System.out.println(flag);
	din.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
