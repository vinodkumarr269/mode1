package com.hcl.java;

public class CircleDemo {
	public void calc(double radius){
		double area;
		double circ;
		area=Math.PI*Math.pow(radius,2);
		circ=2*Math.PI*radius;
		System.out.println(" area of circle "+area);
		System.out.println(" circumferance "+circ);
	}
	public static void main(String[] args) {
		double radius=12.5;
		CircleDemo obj=new CircleDemo();
		obj.calc(radius);
	}

}
