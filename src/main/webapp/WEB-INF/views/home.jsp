<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
</head>
<body>

<sql:query var="rs" dataSource="jdbc/books">
  SELECT "Name", "Password" FROM public."UserDB"
</sql:query>

<c:forEach var="row" items="${rs.rows}">
  ID: ${row.Name}<br/>
  Name: ${row.Password}<br/>
</c:forEach>

</body>
</html>