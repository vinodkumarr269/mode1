package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGemDemo {
public static void main(String[] args) {
	Map<Integer,String> m=new Hashtable<Integer,String>();

	m.put(1,"dharshini");
	m.put(2,"vinod");
	m.put(3,"laksh");
	m.put(4,"hemu");
	m.put(5,"raghu");
	int key;
	String result;
	System.out.println("enter key");
	Scanner sc =new Scanner(System.in);
	key=sc.nextInt();
	result =m.getOrDefault(key, "not found");
	System.out.println(result);
	
}
}
