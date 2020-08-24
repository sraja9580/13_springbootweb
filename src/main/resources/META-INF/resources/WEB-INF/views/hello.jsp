<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<%
Integer id1 = (Integer) request.getAttribute("id");
String name1 = (String) request.getAttribute("name");
String salary1 = (String) request.getAttribute("salary");
out.println("ID "+id1);
out.println("Name "+name1);
out.println("Salary "+salary1); 
%>
<br/>
<b>ID: ${id}</b>
<b>Name: ${name}</b>
<b>Salary: ${salary}</b>
</body>
</html>