package com.hcl.java;

public class Even {
	public void show(int x)
	{
		int i=0;
		while(i<x)
		{
			i=i+2;
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	int x=20;
	new Even().show(x);
}
}
