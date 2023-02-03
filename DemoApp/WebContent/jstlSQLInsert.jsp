<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
	 url="jdbc:mysql://localhost:3306/test" 
	user="root" password="" />
	<sql:update dataSource="${db}" var="rows_inserted">
		INSERT INTO students VALUES (104, "Riyas");
	</sql:update>
	<c:out value="${rows_inserted}"/>
</body>
</html>