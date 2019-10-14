package com.hcl.bank;

public class DepositAccount {
	private int accountNo;
	private int amount;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String depositAccount(){
		return AccountBAL.depositAccountBal(accountNo, amount);
	}

}
