<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="calc.jsp">
	<center>
	First No:
	<input type="text" name="firstNo"/><br/><br/>
	Second No:
	<input type="text" name="secondNo"/><br/><br/>
	<input type="submit" value="submit"/>
	</center></form>
	
	<%
	if(request.getParameter("firstNo")!=null &&
	request.getParameter("secondNo") != null){
	int a,b,c;
	a=Integer.parseInt(request.getParameter("firstNo"));
	b=Integer.parseInt(request.getParameter("secondNo"));
	c=a+b;
	out.println("sum is<B>"+c);
	}
	%>
	

</body>
</html>