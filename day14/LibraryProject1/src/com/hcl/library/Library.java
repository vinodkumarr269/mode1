package com.hcl.library;

public class Library {
	private int id;
	private String bookname;
	private String authorname;
	private String dept;
	private String edtion;
	private int all;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEdtion() {
		return edtion;
	}
	public void setEdtion(String edtion) {
		this.edtion = edtion;
	}
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", bookname=" + bookname + ", authorname=" + authorname + ", dept=" + dept
				+ ", edtion=" + edtion + ", all=" + all + "]";
	}
	

}
