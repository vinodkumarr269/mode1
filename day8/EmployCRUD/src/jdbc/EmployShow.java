package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface EmployShow {
public static void main(String[] args) {
	Connection con=DaoConnection.getConnection();
	String cmd="select * from Employ";
	try {
		
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			System.out.println("emp no"+rs.getInt("empno"));
			System.out.println("emp name"+rs.getString("name"));
			System.out.println("emp dept"+rs.getString("dept"));
			System.out.println("emp desig"+rs.getString("desig"));
			System.out.println("emp basic"+rs.getInt("basic"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
