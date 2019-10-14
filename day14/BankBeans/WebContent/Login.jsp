<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Login.jsp">
	<center>
		Login Id:
		<input type="text" name="login"/><br/>
		Password:
		<input type="password" name="password"/><br/>
		<input type="submit" value="login"/><br/>
	</center>
</form>
<%
if(request.getParameter("login")!= null 
&& request.getParameter("password")!= null){
	String login=request.getParameter("login");
	String password=request.getParameter("password");
	if(login.equals("vinod")&&password.equals("kumar")){
		%>
		<jsp:forward page="menu.html"/>
		<%
		
		}
	else{
		out.println("invalid");
	}
}

	 %>
</body>
</html>