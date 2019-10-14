package com.hcl.abs;
abstract class Animal{
	abstract void name();
	abstract void type();
}
class Lion extends Animal{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("lion");
		
	}

	@Override
	void type() {
		// TODO Auto-generated method stub
		System.out.println("wild");
		
	}
	
}
class Crocodile extends Animal{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("crocodile");
		
	}

	@Override
	void type() {
		// TODO Auto-generated method stub
		System.out.println("water");
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
		Animal[] arr=new Animal[]{
				new Lion(),new Crocodile()};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
		}
	}

