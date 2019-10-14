package com.hcl.inheritance;

 class C3 {

	public void show()
	{
		System.out.println("from show");
	}
	

}

class C2 extends C3{
	public void display(){
		System.out.println("from display");
	}
}
public class C1{
	public static void main(String[] args) {
		C2 o=new C2();
		o.show();
		o.display();
	}
	
}