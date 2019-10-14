package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmpSearch1 {
	public static void main(String[] args) {
		String daname;
		System.out.println("enter daname");
		
		Scanner sc=new Scanner(System.in);
	daname=sc.nextLine();

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
					"root","root");
			String cmd="select * from dept where dname=? ";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, daname);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				//System.out.println("emp name "+rs.getString("name"));
				System.out.println("dapartment "+rs.getString("loc"));
				System.out.println("dname "+rs.getString("dname"));
				System.out.println("dept no"+rs.getInt("deptno"));
					
			}else{
				System.out.println("record not found");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
