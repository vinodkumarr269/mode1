package com.hcl.java;

public class EvenorOdd {
	public void calc(int n){
		if(n%2==0)
		{
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		int n=10;
	//	EvenorOdd obj=new EvenorOdd();
		//obj.calc(x);
		new EvenorOdd().calc(n);
	}

}
