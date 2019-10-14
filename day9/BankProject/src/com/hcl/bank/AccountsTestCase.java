package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	@Test 
	public void testWithdrawAmount(){
		assertEquals("amount debited...",AccountBAL.withdrawAccountBal(3,3000)); 
		assertEquals("insufficient funds",AccountBAL.withdrawAccountBal(3,3000000));
		assertEquals("account not found",AccountBAL.withdrawAccountBal(-3,3000));
		assertEquals("Account Closed...",AccountBAL.withdrawAccountBal(1,300)); 
		
		
	}
	@Test
	public void testDepositeAccount(){
		assertEquals("amount credited...",AccountBAL.depositAccountBal(3,3000));
		assertEquals("Account No not found",AccountBAL.depositAccountBal(-3,3000));
		assertEquals("Account Closed...",AccountBAL.depositAccountBal(1,3000));
	}
	@Test
	public void testCloseAccount(){
		assertEquals("Account Closed...",AccountBAL.closeAccountBal(4));
		assertEquals("Account not found...",AccountBAL.closeAccountBal(-4)); 
	}
	@Test
	public void testUpdateAccount(){
		assertEquals("updated",AccountBAL.updateAccountBal(2,"Chennai","TN"));
		assertEquals("Account No not Found...",AccountBAL.updateAccountBal(-1,"chennai","TN"));
		assertEquals("Account Closed Already...",AccountBAL.updateAccountBal(1,"chennai","TN"));
	}
	@Test
	public void testSearchAccount(){ 
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
	}
	@Test
	public void testCreateAccount(){
		Accounts objAccounts=new Accounts();
			int accno=AccountBAL.generateAccountBal();
			
			objAccounts.setAccountNo(accno);
			objAccounts.setFirstName("Bindhu");
			objAccounts.setLastName("Sree");
			objAccounts.setCity("Bangalore");
			objAccounts.setState("Karnantaka");
			objAccounts.setAmount(992222);
			objAccounts.setCheqFacil("yes");
			objAccounts.setAccountType("savings");
			assertEquals("Account created successfully",AccountBAL.createAccountBal(objAccounts));
			
			
			
			
		
	}

	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void testGenerateAccountNo(){
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		assertEquals(accno,AccountBAL.generateAccountBal());
	}

	@Test
	public void testgettersAndSetters() {
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("sai");
		objAccounts.setLastName("kumar");
		objAccounts.setCity("bangalore");
		objAccounts.setState("karnataka");
		objAccounts.setAmount(20000);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		objAccounts.setStatus("active");
		
		
		
		assertEquals(1,objAccounts.getAccountNo());
		assertEquals("sai",objAccounts.getFirstName());
		assertEquals("kumar",objAccounts.getLastName());
		assertEquals("bangalore",objAccounts.getCity());
		assertEquals("karnataka",objAccounts.getState());
		assertEquals(20000,objAccounts.getAmount());
		assertEquals("yes",objAccounts.getCheqFacil());
		assertEquals("savings",objAccounts.getAccountType());
		assertEquals("active",objAccounts.getStatus());
		
	}

}
