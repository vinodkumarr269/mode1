package com.hcl.java;

public class Fact {
	public void cal(int x)
	{int i=1,f=1;
		while(i<x)
		{
			f=f*i;
			
			i++;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		int x=6;
	//	Fact obj=new Fact();
		//obj.cal(x);
		new Fact().cal(x);
	}

}
