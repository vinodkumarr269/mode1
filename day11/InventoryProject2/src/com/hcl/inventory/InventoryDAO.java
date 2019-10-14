package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.hcl.inventory.DaoConnection;


	public class InventoryDAO {
		Connection con;
		PreparedStatement pst;
		public int generateordernoDao() {
			con = DaoConnection.getConnection();
	          int orderno = 0;
	          String cmd = "select case when max(OrderId) is null then 1" 
	          +"  else max(OrderId)+1 end orderno from Orders";
	          try {
				pst = con.prepareStatement(cmd);
				ResultSet rs = pst.executeQuery();
				rs.next();
				orderno = rs.getInt("orderno");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          return orderno;       
		}
		
		public String orderInventoryDao(String stid, int orderedquantity){
		con=DaoConnection.getConnection();
		Inventory objstock=searchInventoryDao(stid);
		String result="";
		if(objstock!=null){
			int QA=objstock.getQuantityAvail();
			if(QA-orderedquantity>=0){
				int price=objstock.getPrice();
				int billamount=price * orderedquantity;
			String cmd="insert into orders values(?,?,?,?)";
				try {
					InventoryDAO id= new InventoryDAO(); 
					int orderid=id.generateordernoDao();
					pst=con.prepareStatement(cmd);
					pst.setInt(1, orderid);
					pst.setString(2, stid);
					pst.setInt(3, orderedquantity);
					pst.setInt(4, billamount);
					pst.executeUpdate();
					cmd="update stock set quantityAvail=quantityavail-? where stockid=?";
					pst=con.prepareStatement(cmd);
					pst.setInt(1,orderedquantity );
					pst.setString(2, stid); 
					pst.executeUpdate();
					cmd="select gamt from amount";
					pst=con.prepareStatement(cmd);
					ResultSet rs = pst.executeQuery();
					rs.next();
					int gross= rs.getInt("gamt");
					cmd="update amount set gamt=gamt+? ";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, billamount);
					pst.executeUpdate();
					result = "order placed";	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			
			
		}
		else{
			result="item not found";
		}
		return result;
		
	}

	public Inventory searchInventoryDao(String stockid){
		con=DaoConnection.getConnection();
		String cmd="select * from stock where stockid=?"; 
		Inventory objAccounts=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				objAccounts=new Inventory();
				objAccounts.setStockid(rs.getString("stockid"));
				objAccounts.setItemName(rs.getString("itemName"));
				objAccounts.setPrice(rs.getInt("price"));
				objAccounts.setQuantityAvail(rs.getInt("quantityavail"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objAccounts;
	}
	public String createInventoryDao(Inventory objInventory){
		con=DaoConnection.getConnection();
		String cmd="Insert into stock(stockid,itemname,price,quantityavail)" 
	+"values(?,?,?,?)";
		String result="";
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, objInventory.getStockid());
			pst.setString(2, objInventory.getItemName());
			pst.setInt(3, objInventory.getPrice());
			pst.setInt(4, objInventory.getQuantityAvail());
			pst.executeUpdate();
			result="created sucessfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	public String generateStockIdDao(){

		con=DaoConnection.getConnection();
		String stockid;
		String stid="";
		String cmd="select max(stockid) sid from stock";
		try {
			pst=con.prepareStatement(cmd);
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
	
		return stid;
	}

}
