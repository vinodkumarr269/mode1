package com.hcl.java;

public class PosNeg {
	public void check(int n){
		if(n>0){
			System.out.println("positive no");
		}else{
			System.out.println(" negitive no");
		}
	}
	public static void main(String[] args) {
		int n=-2;
		PosNeg obj=new PosNeg();
		obj.check(n);
		
	}

}
