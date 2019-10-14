package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptSearch {
	private int deptNo;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public ResultSet serachDept() {
		Connection con=DaoConnection.getConnection();
		String cmd="select * from dept where deptNo=?";
		ResultSet rs=null;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptNo);
			rs=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
