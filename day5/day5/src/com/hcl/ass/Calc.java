package com.hcl.ass;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Calc {
public static void main(String[] args) {
	
	try {
		int a,b,c;

		System.out.println("enter 2 numbers");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());

		c=a+b;
		System.out.println(c);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
	
}
}
