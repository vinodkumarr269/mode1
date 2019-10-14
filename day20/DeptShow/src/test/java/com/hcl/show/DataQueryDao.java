package com.hcl.show;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DataQueryDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void searchDept(int deptno){
		String cmd="select * from Dept where Deptno=?";
		List dep=null;
		dep=jdbcTemplate.query(cmd, new Object[]{deptno}, new RowMapper() {
			
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("deptNo")+"----"+
						rs.getString("dname")+"-----"+
						rs.getString("loc");
							return res;
			}
		});
		for (Object object : dep) {
			System.out.println(object);
		}
	}
		
	public void showEmploy(){
		String cmd="select * from dept";
		List dep=null;
		dep=jdbcTemplate.query(cmd,new RowMapper() {
			
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("deptNo")+"----"+
			rs.getString("dname")+"-----"+
			rs.getString("loc");
				return res;
			}
		});
		for (Object object : dep) {
			System.out.println(object);
		}
	}

}
