package com.hcl.Quiz;

public class Quiz4 {
	public static void main(String[] args) {
		Object[] arr=new Object[]
				{
			12,"welcome",true,11,11.6,"ban"
				};
				for (Object object : arr) {
					if(object instanceof Integer){
						System.out.println(object);
					}
				}
	}

}
