package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
public static void main(String[] args) {
	SortedSet s= new TreeSet();
	s.add("vinod");
	s.add("hinod");
	s.add("ainod");
	s.add("tinod");
	System.out.println("sorted");
	s.forEach(System.out::println);
	
	
}
}
