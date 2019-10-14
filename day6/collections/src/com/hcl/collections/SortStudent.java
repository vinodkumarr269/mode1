package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student> c=new CityComaprator();
		Set<Student> setStudent=new TreeSet<Student>(c);
		setStudent.add(new Student("vinod","kumar","bang",7.9));
		setStudent.add(new Student("prem","reddy","ang",9.9));
		setStudent.add(new Student("sai","kumar","g",8.9));
		System.out.println("student list");
		setStudent.forEach(System.out::println);
		
		
	}

	
}
