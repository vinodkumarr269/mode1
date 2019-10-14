package com.hcl.collections;
class Data<T>{
	public void swap(T x,T y){
		T t;
		t=x;
		x=y;
		y=t;
		System.out.println(" x value "+x+" y value "+y);
	}
}

public class SwapDemo {
	public static void main(String[] args) {
		Data obj=new Data();
		int x,y;
		x=12;
		y=14;
		obj.swap(x, y);
		double d1=15.5,d2=10.6;
		obj.swap(d1, d2);
		String s1="hello",s2="hi";
		obj.swap(s1, s2);
		boolean f1=true,f2=false;
		obj.swap(f1, f2);
	}

}
