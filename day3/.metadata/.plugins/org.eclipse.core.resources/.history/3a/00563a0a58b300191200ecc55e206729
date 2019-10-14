package com.hcl.day3;
class Employ{
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}
	class Amith extends Employ{

		public Amith(int empno, String name, double basic) {
			super(empno, name, basic);
			
		}
		
	}
	class Vinod extends Employ{

		public Vinod(int empno, String name, double basic) {
			super(empno, name, basic);
		}
		
	}
	


public class SupCon {
	public static void main(String[] args) {
		Employ e1=new Amith(1,"amith",6364);
		Employ e2=new Employ(2, "vinod", 8889);
		//System.out.println(e1);
		//System.out.println(e2);
		Employ[] arrEmploy=new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
			
		}}
	

}
