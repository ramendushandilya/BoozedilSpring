<%--
  Created by IntelliJ IDEA.
  User: rams0516
  Date: 1/9/2018
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>Login</title>
</head>
<body>

<p>${success}</p>
<sf:form action="${pageContext.request.contextPath}/validate" method="post" commandName="user">
    <center>
        <table  border="1px">
            <tr>
                <td>User Name</td>
                <td><sf:input type="text" path="username" name="username"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><sf:input type="password" path="password" name="password"/></td>
            </tr>
            <tr>
                <td><input type ="Submit"/></td>
                <td><input type ="Reset"/></td>
            </tr>
        </table>
    </center>
</sf:form>
</body>
</html>
