<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="DeptSearch.jsp">
	<center>
	dept No:
	<input type="text" name="deptno"/><br/>
	<input type="submit" value="search"/><br/>
	
	</center>
	</form>
	<%
if(request.getParameter("deptno") != null){
	Connection con=DaoConnection.getConnection();
	String cmd="select * from dept where deptno=?";
	int deptno=Integer.parseInt(request.getParameter("deptno"));
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setInt(1,deptno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()){
		out.println("dept name is "+rs.getString("dname")+"<br/>");
		out.println("loc is "+rs.getString("loc")+"<br/>");
		
	}
	else{
		out.println("****not found");
	}
}
%>

</body>
</html>