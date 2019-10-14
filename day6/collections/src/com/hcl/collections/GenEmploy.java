package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"divya",6789));
		lstEmploy.add(new Employ(2,"laksh",5865));
		lstEmploy.add(new Employ(3,"vinod",9214));
		lstEmploy.add(new Employ(4,"prem",8956));
		lstEmploy.add(new Employ(5,"raghu",8546));
		lstEmploy.add(new Employ(6,"hema",2155));
		System.out.println("employ list");
		lstEmploy.forEach(System.out::println);
		
	}

}
