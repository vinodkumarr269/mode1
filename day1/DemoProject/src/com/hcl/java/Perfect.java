package com.hcl.java;

public class Perfect {
	public void cal(int n)
	{int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println(" perfect");
		}
		else{
			System.out.println("no");
		}
	}
	public static void main(String[] args) {
		int n=28;
		Perfect o=new Perfect();
				o.cal(n);
	}


}
