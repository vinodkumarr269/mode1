package com.hcl.collections;

public class Student {
	String firstName;
	String lastName;
	String city;
	double cgp;
	public Student(String firstName, String lastName, String city, double cgp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", cgp=" + cgp + "]";
	}
	

}
