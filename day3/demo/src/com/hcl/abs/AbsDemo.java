package com.hcl.abs;
abstract class Training{
	abstract void name();
	abstract void email();
}
class Anubhav extends Training{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("name is anubhav");
		
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("email id jdfjdfh@gmail.com");
		
	}
	
}
class SaiKrishna extends Training{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("name is sai krishna");
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("sai@gmail.com");
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training t1=new Anubhav();
		Training t2=new SaiKrishna();
		t1.name();
		t1.email();
		t2.email();
		t2.name();

	}
	

}
