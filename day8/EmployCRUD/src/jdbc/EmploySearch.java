package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ number");
		empno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
		String cmd="select * from Employ where empno=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("name"+rs.getString("name"));
				System.out.println("name"+rs.getString("dept"));
				System.out.println("name"+rs.getString("desig"));
				System.out.println("name"+rs.getInt("basic"));
			}
			else{
				System.out.println("record not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
