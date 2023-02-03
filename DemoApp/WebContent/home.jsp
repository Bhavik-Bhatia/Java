<%@ include file="header.jsp" %>
<%@ page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<%! 

//Declarative Tag
int var=20; 

%>

<% 
	//Scriplet Tag
	out.println("This is Scriplet Tag </br>");
	out.println("Declaration: "+var+"</br>");
	out.println("Implicit Objects: "+application.getInitParameter("Name"));

%>

</br>Expression Tag: <%=var%>

</body>
</html>