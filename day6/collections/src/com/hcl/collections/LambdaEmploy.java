package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();

		list.add(new Employ(1,"vinod",780996));
		list.add(new Employ(2,"nod",796));
		list.add(new Employ(3,"od",996));
		Collections.sort(list,(s1,s2)->
		{
			return s1.name.compareTo(s2.name);
		});
		System.out.println("name wise");
	for (Employ employ : list) {
		System.out.println(employ);
	}
	Collections.sort(list,(s1,s2)->{
		return (int)(s1.basic-s2.basic);
	});
	System.out.println("basic wise");
		for (Employ employ : list) {
			System.out.println(employ);
		}
		list.stream().filter(p->(p.basic>=1000)).forEach(x->{
		System.out.println(x);
		});
		
	}

}
