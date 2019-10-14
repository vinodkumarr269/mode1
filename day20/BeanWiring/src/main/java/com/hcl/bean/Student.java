package com.hcl.bean;

public class Student {
	private int sno;
	private String name;
	private LunchBox lunchBox;
	
	public LunchBox getLunchBox() {
		return lunchBox;
	}
	public void setLunchBox(LunchBox lunchBox) {
		this.lunchBox = lunchBox;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("Sno "+sno+"Name"+name);
		lunchBox.eat();
	}

}
