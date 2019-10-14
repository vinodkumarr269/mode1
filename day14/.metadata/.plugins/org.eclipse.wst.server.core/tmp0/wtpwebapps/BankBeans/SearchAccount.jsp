<%@page import="com.hcl.bank.Accounts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="com.hcl.bank.SearchAccount"/>
<jsp:setProperty property="*" name="bean1"/>
<%
Accounts obj=bean1.searchAccount();
if(obj != null){
	out.println("first name "+obj.getFirstName());
	out.println("last name "+obj.getLastName());
	out.println("city name "+obj.getCity());
	out.println("state name "+obj.getState());
	out.println("Amount name "+obj.getAmount());
	out.println("cheqFacil name "+obj.getCheqFacil());
	out.println("account  type "+obj.getAccountType());
	
}
else{
	out.println("not found");
}
%>

</body>
</html>