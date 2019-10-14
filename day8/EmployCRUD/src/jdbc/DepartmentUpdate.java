package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deptno");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		dname=sc.nextLine();
		System.out.println("loc");
		loc=sc.nextLine();
		System.out.println("head");
		head=sc.nextLine();
		String cmd="update department set head=?,loc=?,dname=? where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1,head);
			pst.setString(2, loc);
			pst.setString(3, dname);
			pst.setInt(4, deptno);
			pst.executeUpdate();
			System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
