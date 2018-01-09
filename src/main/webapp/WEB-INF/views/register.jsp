<%--
  Created by IntelliJ IDEA.
  User: rams0516
  Date: 1/9/2018
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>Register new User</title>
</head>
<body>
<h4>Enter your details to signup!</h4>
<sf:form action="${pageContext.request.contextPath}/registerUser" method="post" commandName="user">
    <center>
        <table  border="1px">
            <tr>
                <td>Name</td>
                <td><sf:input type="text" name ="name" path="name"/><sf:errors path="name"/></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><sf:input type="text" name="email" path="email"/><sf:errors path="email"/></td>
            </tr>
            <tr>
                <td>User Name</td>
                <td><sf:input type="text" name="username" path="username"/><sf:errors path="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><sf:input type="password" name="password" path="password"/><sf:errors path="password"/></td>
            </tr>
            <tr>
                <td><input type ="Submit" value="Signup"/></td>
                <td><input type ="Reset"/></td>
            </tr>
        </table>
    </center>
</sf:form>
<p>${fail}</p>
</body>
</html>
