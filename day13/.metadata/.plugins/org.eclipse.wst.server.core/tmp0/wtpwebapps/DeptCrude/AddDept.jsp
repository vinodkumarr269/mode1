<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.dept.DaoConnection"%>
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
<form method="get" action="AddDept.jsp">
	<center>
	Dept no:
	<input type="text" name="deptno"/><br/> 
	Dept Name:
	<input type="text" name="dname"/><br/> 
	Location:
	<input type="text" name="loc"/><br/> 
		<input type="submit" name="create"/><br/> 
		<%
		if(request.getParameter("deptno")!= null){
		Connection con=DaoConnection.getConnection();
		String cmd="insert into dept values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1,Integer.parseInt(request.getParameter("deptno")));
		pst.setString(2,request.getParameter("dname"));
		pst.setString(3,request.getParameter("loc"));
		pst.executeUpdate();
		%>
		<jsp:forward page="DeptShow.jsp"/>
		<%
		}
		%>
		
	
	</center>
</form>

</body>
</html>