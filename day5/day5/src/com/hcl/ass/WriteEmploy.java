package com.hcl.ass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
				try {
					FileOutputStream fout;

			fout = new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout=
					new ObjectOutputStream(fout);
			Employ e=new  Employ(1, "vimoc", 555.2);
			objout.writeObject(e);
			objout.close();
			fout.close();
				} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
	}

}
