package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentSearch {
	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deptno to search");
		deptno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
	String cmd="select * from department where deptno=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,deptno);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("dname "+rs.getString("dname"));
				System.out.println("dno "+rs.getInt("deptno"));
				System.out.println("loc "+rs.getString("loc"));
				System.out.println("head "+rs.getString("head"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
