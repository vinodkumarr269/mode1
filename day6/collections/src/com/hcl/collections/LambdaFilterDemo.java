package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"samsung",17000));
		list.add(new Product(2,"iphone",65000));
		list.add(new Product(3,"sony",25000));
		list.add(new Product(4,"nokia",19000));
		list.add(new Product(5,"redmi",22000));
		System.out.println("with rescept to price");
		list.stream().filter(p -> p.price>=20000).forEach(x->{
			System.out.println(x);
		});
		System.out.println("with rescept to starting letter");
		list.stream().filter(p ->p.name.startsWith("s")).forEach(x ->
		{
			System.out.println(x);
		});
		System.out.println("max price");
		Product maxP=list.stream().max((p1,p2)-> p1.price>=p2.price ? 1:-1).get();
				System.out.println(maxP);
		Product minP=list.stream().min((p1,p2)-> p1.price>=p2.price ? 1:-1).get();
		System.out.println("min value");		
		System.out.println(minP);
	}
	

}
