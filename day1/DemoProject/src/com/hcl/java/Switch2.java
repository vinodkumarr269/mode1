package com.hcl.java;

public class Switch2 {
	public void show(String op){
		switch(op.toUpperCase()){
		case "INSERT":
		    System.out.println("insert ope");
		break;
		case "UPDATE":
		System.out.println("update ope");
		break;
		default:
			System.out.println("invalid");
			
		}
	}

	public static void main(String[] args) {
		String op="update";
				Switch2 o=new Switch2();
		o.show(op);

	}

}
