<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.employ.DaoConnection"%>
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
<table border="3" bgcolor="blue">
	<tr bgcolor="red">
		<th>Empno</th>
		<th>Name</th>
		<th>Dept</th>
		<th>Desig</th>
		<th>Basic</th>
		
		<th>update</th>
		<th>delete</th>
	</tr>
	<%
	Connection con=DaoConnection.getConnection();
	String cmd="select * from employ";
	PreparedStatement pst=con.prepareStatement(cmd);
	ResultSet rs=pst.executeQuery();
	while(rs.next()){
		%>
		<tr>
			<td bgcolor="yellow"><%=rs.getInt("empno") %></td>
			<td bgcolor="green"><%=rs.getString("name") %></td>
			<td bgcolor="orange"><%=rs.getString("dept") %></td>
			<td bgcolor="white"><%=rs.getString("desig") %></td>
			<td bgcolor="pink"><%=rs.getInt("basic") %></td>
			<td bgcolor="cryon"><a href="UpdateEmploy.jsp?empno=<%=rs.getInt("empno")%>">update</a></td>
			<td><a href="DeleteEmploy.jsp?empno=<%=rs.getInt("empno")%>">delete</a></td>
			
			
		</tr>
<%
	}
%>	
</table><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="AddEmploy.jsp">Add Employ</a>

</body>
</html>