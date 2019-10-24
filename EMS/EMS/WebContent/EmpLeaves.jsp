<%@page import="com.hcl.ems.Employ"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.ems.EmsDao"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="table-wrapper-scroll-y my-custom-scrollbar">
	<table class="table table-striped mb-0" border="1" bordercolor=white>
		<tr class="table-primary">
			<th>Employ ID</th>
			<th>Employ Name</th>
			<th>Employ Leave Balance</th>
			
			<th>Leave ID</th>	
			<th>Start Date</th>
			<th>End Date</th>
			<th>Leave Type</th>
			<th>Status</th>
			<th>Reason</th>
			<th>Number of Days</th>
		</tr>
		
		<%
		int mgrId = Integer.parseInt((String)session.getAttribute("EMP_ID"));
	 	List<Leaves> leaves = EmsBal.getEmployLeavesBal(mgrId);
	 	
	 	
	 	%>
	 	<%-- <c:forEach var="l" items="${leaves}">
	 		<td>
	 			<c:out value="${l.getReason()}"/>
	 		</td>
	 	</c:forEach> --%>
	 	
	</table>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	
</body>
</html>