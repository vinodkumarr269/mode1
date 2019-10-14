package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("priya", "darshini");
		m.put("laksh","laksh");
		m.put("rishab", "hcl");
		m.put("kirumba","lakshmi");
		String Key="priya";
		String Value=(String)m.getOrDefault(Key, "not found");
		System.out.println(Value);
	}

}
