package com.hcl.day3;
enum Student{
	VI,VK,RI
	
}

public class Enum3 {
	public static void show(){
		Student[] arrStudent =Student.values();
		
	for(Student s:arrStudent){
		System.out.println(s);;
		
	}
	}
	public static void maon(String[] args){
		show();

}
}