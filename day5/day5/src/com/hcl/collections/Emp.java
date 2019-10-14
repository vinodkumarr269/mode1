package com.hcl.collections;

public class Emp implements Comparable {
		int empno;
		String name;
		  double basic;
		

		public  Emp(int empno, String name, double basic) {
			this.empno = empno;
			this.name = name;
			this.basic = basic;
		}

		@Override
		public String toString() {
			return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Emp e=(Emp)o;
			return name.compareTo(e.name);
		}
		

	}

