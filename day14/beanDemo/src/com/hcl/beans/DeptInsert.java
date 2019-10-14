package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptInsert {
	private int deptNo;
	private String dname;
	private String loc;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String insertDept(){
		Connection con=DaoConnection.getConnection();
		String cmd="insert into dept values(?,?,?)";
		String result="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptNo);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.executeUpdate();
			result="record inserted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
