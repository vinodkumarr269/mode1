package com.hcl.inheritance;
class First{
	static{
		System.out.println("base static");
	}
	public First(){
		
		System.out.println("base class");
	}
}
class Second extends First{
	static{
		System.out.println("derived static");
	}
	public Second()
	{
		System.out.println("second");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new Second();
	}

}
