package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LamdaLimit {
	public static void main(String[] args) {
		List<Integer> lstData= new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(11));
		lstData.add(new Integer(18));
		lstData.add(new Integer(19));
		lstData.add(new Integer(13));
	System.out.println("for limiting");
	lstData.stream().limit(3).forEach(p->{
	System.out.println(p);	
	});
	System.out.println("after skiping 2 valus");
	lstData.stream().skip(3).forEach(p->{
		System.out.println(p);
	});
	System.out.println("filter data");
	lstData.stream().filter(p-> p>15).forEach(System.out::println);
	}
}
