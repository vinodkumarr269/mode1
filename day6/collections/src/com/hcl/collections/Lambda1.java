package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<Integer> lstData= new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(11));
		lstData.add(new Integer(18));
		lstData.add(new Integer(19));
		lstData.add(new Integer(13));
	
	lstData.forEach(p-> {
	
		if(p>=15){
		
	System.out.println(p);	
		}
		
	});
	}
}
