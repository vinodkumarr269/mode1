package com.hcl.inventory;

import static org.junit.Assert.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;





public class InventoryTestCase {
	@Test
	public void testOrderInventory(){
		assertEquals("order placed",InventoryBAL.orderInventoryBal("S002",2));
		assertEquals("item not found",InventoryBAL.orderInventoryBal("S030",2));
		
		
	}

	
	@Test
	public void testSearchInventory(){
		assertNotNull(InventoryBAL.searchInventory("S002"));
		assertNull(InventoryBAL.searchInventory("S400"));
	}
	@Test
	public void testCreateInvenory(){
		Inventory objInventory=new Inventory();
		String stockid=InventoryBAL.generateStockId();
		objInventory.setStockid(stockid);
		objInventory.setItemName("lap");
		objInventory.setPrice(40000);
		objInventory.setQuantityAvail(8);
		assertEquals("created sucessfully",InventoryBAL.createInventory(objInventory));
		
	}
	@Test
	public void testGenerateStockId(){
	Connection con=DaoConnection.getConnection();
	String stockid;
	String stid="";
	String cmd="select max(stockid) sid from stock";
	try {
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		stid=rs.getString("sid");
		int id=Integer.parseInt(stid.substring(1));
		id++;
		stid = String.format("S%03d", id);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
assertEquals(stid,InventoryBAL.generateStockId());
}

	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}

	@Test
	public void testGettersAndSetters() {
		Inventory objInventory=new Inventory();
		objInventory.setStockid("S001");
		objInventory.setItemName("itemName");
		objInventory.setQuantityAvail(10);
		objInventory.setPrice(10000);
		
		assertEquals("S001",objInventory.getStockid());
		assertEquals("itemName",objInventory.getItemName());
		assertEquals(10,objInventory.getQuantityAvail());
		assertEquals(10000,objInventory.getPrice());
	}

}
