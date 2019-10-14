package com.hcl.exception;


public class ThrEx {
	public void show(int x){
	boolean	flag=true;
		if(x<0){
			flag=false;
			throw new NumberFormatException("negitive not allowed");
		}
		if(x==0){
			flag=false;
			throw new ArithmeticException("zero is invalid");
		}
		if(flag==true){
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		try {
			int n=05;
			new ThrEx().show(n);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
