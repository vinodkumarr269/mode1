package com.hcl.ems;

public class EmployBAL {
	public static Employ searchEmployBal(int empId){
		return new EmployDao().searchEmployDetails(empId);
	}
	public static String applyForLeaveBal(Leave obj) {
		return new EmployDao().applyForLeave(obj);
	}
}
