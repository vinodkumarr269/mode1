package com.hcl.bean;

import java.util.List;

public class Faculty {
	private String fname;
	private List<Student> students;
	public String getFname() { 
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void teaching(){
		System.out.println(("Faculty")+fname+"sharing lunch with students");
		for (Student student : students) {
			student.display();
		}
	}
	

}
