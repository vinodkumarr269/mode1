<%@page import="java.sql.ResultSet"%>
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
<%
 int deptno=Integer.parseInt(request.getParameter("deptno"));
Connection con=DaoConnection.getConnection();
String cmd="select* from Dept where deptno=?";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setInt(1,deptno);
ResultSet rs=pst.executeQuery();
rs.next();

%>
<form method="get" action="UpdateDept.jsp">
<center>
Department No :
<input type="number" name="deptno" 
value=<%=rs.getInt("deptno") %> /> <br/>

Department Name :
<input type="text" value=<%=rs.getString("dname")%>
name="dname"/> <br/>
Location :
<input type="text" value=<%=rs.getString("loc")%>
name="loc"/> <br/>


<input type="submit" value="Update"/> <br/>

</center>
</form>
<% 
if(request.getParameter("deptno")!=null && request.getParameter("dname") !=null){

cmd="Update Dept set dname=?, loc=? Where Deptno=?";
pst=con.prepareStatement(cmd);
pst.setString(1,request.getParameter("dname"));
pst.setString(2,request.getParameter("loc"));
pst.setInt(3,deptno);
pst.executeUpdate();
    %>
<jsp:forward page="DeptShow.jsp"/>
<%
}
%>

</body>
</html>