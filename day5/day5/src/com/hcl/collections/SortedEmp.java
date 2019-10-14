package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedEmp {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(new Emp(1,"vinod",5445));
		s.add(new Emp(1,"vino",545));
		s.add(new Emp(1,"inod",45));
		s.forEach(System.out::println);
		
	}

}
