package com.hcl.collections;
interface IHello{
	void sayHello();
}
interface ICalc{
	int calc(int a,int b);
}

public class Lambda2 {
	public static void main(String[] args) {
		IHello h1=()->{
			System.out.println("hello from rishab");
		};
		IHello h2=()->{
			System.out.println("hello from lakshmi");
		};
		IHello h3=()->{
			System.out.println("hello from laksh");
		};
		IHello[] arr=new IHello[]{h1,h2,h3};
		for(IHello iHello:arr){
			iHello.sayHello();
		}
		ICalc ad1=(a,b)->{
			System.out.println("sum");
			return a+b;
		};
		ICalc ad2=(a,b)->(a-b);
		ICalc ad3=(a,b)->(a*b);
		System.out.println(ad1.calc(12,4));
		System.out.println(ad2.calc(3,5));
		System.out.println(ad3.calc(10,4));
	}

}
