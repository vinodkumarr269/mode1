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
<form method="get action="EmploySearch.jsp">
	<center>
	Employ No:
	<input type="text" name="empno"/><br/><br/>
	<input type="submit" value="search"/><br/>
	</center>
</form>
<%
if(request.getParameter("empno") != null){
	Connection con=DaoConnection.getConnection();
	String cmd="select * from employ where empno=?";
	int empno=Integer.parseInt(request.getParameter("empno"));
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setInt(1,empno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()){
		out.println("employ name is "+rs.getString("name")+"<br/>");
		out.println("employ dept is "+rs.getString("dept")+"<br/>");
		out.println("employ desig is "+rs.getString("desig")+"<br/>");
		out.println("employ salary is "+rs.getInt("basic")+"<br/>");
	}
	else{
		out.println("****not found");
	}
}
%>

</body>
</html>