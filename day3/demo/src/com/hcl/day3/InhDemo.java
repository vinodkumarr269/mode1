package com.hcl.day3;
class First{
	public void show(){
		System.out.println("first");
	}
}
	class Second extends First{
		public void show(){
		//	super.show();
			System.out.println("second");
		}
	}


public class InhDemo {
	public static void main(String[] args) {
	
	//Second o=new Second();
	//o.show();
//First o1=new Second();
//o1.show();
//Second o2=new First();
//o2.show();
		//First o1=new First();
		Second o2=new Second();
		First f1=(First)o2;
		f1.show();
	//	Second f3=(Second)o1;
}
}