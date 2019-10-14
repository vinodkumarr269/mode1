package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no");
		accountNo=sc.nextInt();
		System.out.println("enter deposite amount");
		depositAmount=sc.nextInt();
		System.out.println(AccountBAL.depositAccountBal(accountNo,depositAmount));
	}

}
 