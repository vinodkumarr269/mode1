package com.hcl.java;

public class FactNew {
	public void cal(int x)
	{
		int i=1,f=1;
		for(i=1;i<=x;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		int x=5;
		FactNew o=new FactNew();
		o.cal(x);
	}

}
