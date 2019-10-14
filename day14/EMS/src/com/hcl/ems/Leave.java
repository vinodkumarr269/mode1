package com.hcl.ems;

public class Leave {
	private int leaveId;
	private String leaveStartDate;
	private String leaveEndDate;
	private int noOfDays;
	private String reason;
	private leaveType leaveTpe;
	private String appliedOn;
	private String managerComments;
	private int empId;
	private leaveStatus leaveStatus;
	public leaveType getLeaveTpe() {
		return leaveTpe;
	}
	public void setLeaveTpe(leaveType leaveTpe) {
		this.leaveTpe = leaveTpe;
	}
	public leaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(leaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(String leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public String getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getAppliedOn() {
		return appliedOn;
	}
	public void setAppliedOn(String appliedOn) {
		this.appliedOn = appliedOn;
	}
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	

}
