package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		SortedSet s=new TreeSet(c);
		s.add(new Employ (1,"vinod",6582));
		s.add(new Employ (2,"kumar",682));
		s.add(new Employ (3,"sai",658));
		s.add(new Employ (4,"prem",652));
		s.add(new Employ (5,"reddy",62));
		System.out.println("sorted data");
		s.forEach(System.out::println);
	}

}
           