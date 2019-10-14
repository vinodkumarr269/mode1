package com.hcl.java;

public class CtoK {
	public void calc(double c){
		double f;
		f=273+c;
		System.out.println(f);
		
		
	}
	
   public static void main(String[] args) {
	        double c=37;
	        CtoK obj=new CtoK();
	        obj.calc(c);
   }
}
