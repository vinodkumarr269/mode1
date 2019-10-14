package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaProduct {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();

		list.add(new Product(1,"hp",25000));
		list.add(new Product(2,"keyboard",300));
		list.add(new Product(3,"mouse",150));
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		System.out.println("name wise");
		for (Product product : list) {
			System.out.println(product);
			
		}
		Collections.sort(list, (p1, p2)->{
			return (int)(p2.price-p1.price);
		});
		System.out.println("price wise");
		for (Product product : list) {
			System.out.println(product);
			
		}
	}

}
