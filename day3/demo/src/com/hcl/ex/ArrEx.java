package com.hcl.ex;

public class ArrEx {
	public static void main(String[] args) {
		try {
			int [] a=new int[]{12,5};
			a[10]=5/2;
		} 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("out of boundry");
		}
		catch (ArithmeticException e){
    		System.out.println("division by zero impossible");
     	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	
}
