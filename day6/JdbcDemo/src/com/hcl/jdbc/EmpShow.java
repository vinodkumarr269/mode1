package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
					"root","root");
		
//	System.out.println("connected");
		
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from emp");
		
			while(rs.next()){
				System.out.println("employ number "+rs.getInt("empno"));
				System.out.println("employ name "+rs.getString("ename"));
				System.out.println("dept is "+rs.getInt("deptno"));
				System.out.println("employ job "+rs.getString("job"));
				System.out.println("employ salary "+rs.getDouble("sal"));
				System.out.println("mgr "+rs.getDouble("mgr"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
