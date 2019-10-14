package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> setEmploy=new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1,"divya",6789));
		setEmploy.add(new Employ(2,"laksh",5865));
		setEmploy.add(new Employ(3,"vinod",9214));
		setEmploy.add(new Employ(4,"prem",8956));
		setEmploy.add(new Employ(5,"raghu",8546));
		setEmploy.add(new Employ(6,"hema",2155));
		System.out.println("employ list");
		setEmploy.forEach(System.out::println);
		
	}


}
