package com.hcl.day3;

public class Attendance {
	public static void display(Object...ob){
		for (Object object : ob) {
			System.out.println(object);
		}
	}
	public static void show(int x,String...name){
	for(String s:name){
			System.out.print(x+" "+s);
		
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(0);
		show(1,"v","0k");
		show(2,"g","v","j");
		display();
		display("fafa",7);
	}

}
