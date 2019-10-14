package com.hcl.intf;
interface ITraining{
	void name();
	void email();
}
class Hema implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("hema");
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("hema@gmail.com");
	}
	
}
class Keerthana implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("keethana");
		
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("kere@gmail.com");
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[]{
				new Keerthana(),new Hema()};
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		}
		}
	}


