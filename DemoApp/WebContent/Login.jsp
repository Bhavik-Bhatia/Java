<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%
	//Check Login
	if(session.getAttribute("Uname")!=null){
		response.sendRedirect("Welcome.jsp");
	}
	
%> 

<h1>Login</h1>

<form action="login" method="post">
  <label for="uname">User name:</label><br>
  <input type="text" id="uname" name="uname"><br>
  <label for="pass">Password:</label><br>
  <input type="password" id="pass" name="pass"><br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>