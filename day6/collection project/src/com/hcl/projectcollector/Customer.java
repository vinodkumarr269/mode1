package com.hcl.projectcollector;

public class Customer {
	private int custId;
	private String custName;
	private double annualPremium;
	private double modalPremium;
	private int paymentMode;
	//custId not negitive
	//customer not less than 5 chars
	//annual premium 20000 to 100000
	//modalpremium from 1000 to 50000
	//payment mode 1 or 2 3
	//add customer
	//show customer()
	//search customer()
	//delete customer()
	//update customer()
	//store customerfile()
	//readCustomerFile()
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAnnualPremium() {
		return annualPremium;
	}
	public void setAnnualPremium(double string) {
		this.annualPremium = string;
	}
	public double getModalPremium() {
		return modalPremium;
	}
	public void setModalPremium(double modalPremium) {
		this.modalPremium = modalPremium;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", annualPremium=" + annualPremium
				+ ", modalPremium=" + modalPremium + ", paymentMode=" + paymentMode + "]";
	}
	
	
	

}
