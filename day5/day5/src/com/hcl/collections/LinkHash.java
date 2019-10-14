package com.hcl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHash {
	public static void main(String[] args) {
		Set s=new LinkedHashSet();

		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("raghu");
		s.add("anu");
	     
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("raghu");
		s.add("anu");
		
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("raghu");
		s.add("anu");
	     System.out.println("hash set data");
	     s.forEach(System.out::println);
	     
		
		
	}

}
