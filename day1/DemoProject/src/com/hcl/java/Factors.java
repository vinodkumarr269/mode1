package com.hcl.java;

public class Factors {
	public void cal(int n)
	{
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int n=15;
		Factors o=new Factors();
				o.cal(n);
	}

}
