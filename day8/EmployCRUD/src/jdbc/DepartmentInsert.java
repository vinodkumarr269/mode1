package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentInsert {
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
		Connection con=DaoConnection.getConnection();
		String cmd="insert into department values (?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.setString(4, head);
			pst.executeUpdate();
			System.out.println("record inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
