<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource  var="conn"
  driver="com.mysql.jdbc.Driver"
 	url="jdbc:mysql://localhost:3306/sqlpractice"
	user="root"
	password="root"
	/>
	<sql:query var="empQuery" dataSource="${conn }">
	Select * from Employ WHERE Empno=?
	<sql:param value="${param.empno }"/>
	</sql:query>
	<c:set var="flag" value="0"/>
	<c:forEach var="e" items="${ empQuery.rows}">
	Employ No:
	<c:out value="${e.empno }"/><br/>
	Employ Name:
	<c:out value="${e.name }"/><br/>
	department:
	<c:out value="${e.dept}"/><br/>
	desig:
	<c:out value="${e.desig }"/><br/>
	basic:
	<c:out value="${e.basic }"/><br/>
	<c:set var="flag" value="1"/>
	</c:forEach>
	<c:if test="${flag==0 }">
		<c:out value="employ not found"/>
		</c:if>
</body>
</html>