package com.hcl.bank;

public class WithdrawAccount {
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
		public String withdrawtAccount(){
			return AccountBAL.withdrawAccountBal(accountNo, amount);
		}

	}



