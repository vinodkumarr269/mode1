package com.hcl.java;

public class Prime {
	public void cal(int x)
	{
		int i=2,count=0;
		while(i<x)
		{
			if(x%i==0)
			{
				count++;
				break;
			}
			i++;
		}	
			if(count==0)
			{
				System.out.println("Yes");
			}else{
				System.out.println("no");
			}
	}
	public static void main(String[] args) {
		int x=13;
		Prime o=new Prime();
				o.cal(x);
		
	}

}
