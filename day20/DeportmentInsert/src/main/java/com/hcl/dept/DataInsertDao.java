package com.hcl.dept;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertDept(){
		int deptNo;
		String dname,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deptno");
		deptNo=Integer.parseInt(sc.nextLine());
		System.out.println("enter deptname");
		dname=sc.nextLine();
		System.out.println("enter loc ");
		loc=sc.nextLine();
		String cmd="insert into dept values(?,?,?)";
		jdbcTemplate.update(cmd,new Object[]
				{
					deptNo,
					dname,
					loc
				});
		System.out.println("Data Inserted ...");
		
		
	}

}
