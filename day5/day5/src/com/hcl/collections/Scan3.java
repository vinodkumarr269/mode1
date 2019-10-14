package com.hcl.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		
		
		try {
			fw = new FileWriter("c:/files/data.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write("12 ram 12.522 6 34.6 true priya"+"false 42 1,5 221 annad prem 4.6");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileReader fr;
		try {
			fr = new FileReader("c:/files/data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()){
			if(sc.hasNext()){
				System.out.println(sc.nextInt());
			}
			else
				sc.next();
		}
		sc.close();
		fr.close();
		
	}

}
