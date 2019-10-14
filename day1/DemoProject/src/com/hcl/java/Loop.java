package com.hcl.java;

public class Loop {
		public void show(int n){
			int i=1;
			while(i<=5){
				System.out.println("welcome");
				i++;
			}
		}
		public static void main(String[] args) {
			int n=5;
			new Loop().show(n);
		}

	}

