package com.hcl.abs;
abstract class Employ{
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
class Janani extends Employ{

	public Janani(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
		
	}
	
}
class Raghu extends Employ{

	public Raghu(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ obj1=new Janani(1,"vi",4343);
		Employ obj2=new Janani(3,"ri",43773);
		Employ [] arrEmploy=new Employ[]{obj1,obj2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}

}
