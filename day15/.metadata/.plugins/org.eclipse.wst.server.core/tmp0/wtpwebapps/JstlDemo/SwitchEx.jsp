<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="no" value="${param.no}"/>
Selected Value is:<c:out value="${no}"/>
<c:choose>
	<c:when test="${no==1}">
		<c:out value="Hi i am aditya...">
		</c:out>
	</c:when>
	<c:when test="${no==2}">
		<c:out value="hi an sai"></c:out>
	</c:when>
	<c:when test="${no==3}">
		<c:out value="hi an vinod"></c:out>
	</c:when>
	<c:otherwise>
	<c:out value="invalid choise"/>
	</c:otherwise>
</c:choose>
</body>
</html>