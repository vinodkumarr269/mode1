<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource  var="conn"
  driver="com.mysql.jdbc.Driver"
 	url="jdbc:mysql://localhost:3306/bank"
	user="root"
	password="root"
	/>
	<sql:query var="accounts" dataSource="${conn }">
	select * from accounts where accountno=?
	<sql:param value="${param.accountNo }"/>
	</sql:query>
	<c:set var="flag" value="0"/>
	<c:forEach var="e"  items="${accounts.rows }">
	Account No:
	<c:out value="${e.accountNo }"/><br/>
 First Name:
	<c:out value="${e.firstName }"/><br/>
	last Name:
	<c:out value="${e.lastName }"/><br/>
	city:
	<c:out value="${e.city }"/><br/>
      State:
	<c:out value="${e.state }"/><br/>
	Amount:
	<c:out value="${e.amount }"/><br/>
	CheqFacil:
	<c:out value="${e.cheqFacil}"/><br/>
	Account Type:
	<c:out value="${e.accountType }"/><br/>
	<c:set var="flag" value="1"/>
	</c:forEach>
	<c:if test="${flag==0 }">
		<c:out value="account not found"/>
		</c:if>
	

</body>
</html>