package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibraryDAO {
	Connection con;
	PreparedStatement pst;
	
	
	public Library searchLibrary(){
		con=DaoConnection.getConnection();
		String cmd="select * from books where id=?";
		Library objLib=null;
		try{
		pst=con.prepareStatement(cmd);
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			objLib.setId(rs.getInt("id"));
			objLib.setAuthorname(rs.getString("authorname"));
			objLib.setBookname(rs.getString("bookname"));
			objLib.setDept(rs.getString("dept"));
			objLib.setEdtion(rs.getString("edition"));
			
		}
		
		
		
		}
		
	}

}
