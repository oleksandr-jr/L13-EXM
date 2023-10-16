<%--
  Created by IntelliJ IDEA.
  User: OleksandrJR
  Date: 14/04/23
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beans</title>
</head>
<body>
<jsp:useBean id="UserBean" class="org.javarush.l13exm.repository.UserBean" />
<jsp:setProperty name="UserBean" property="name" value="TestUser" />
<jsp:setProperty name="UserBean" property="email" value="test@mail.com" />

<p>Got message....</p>
<jsp:getProperty name="UserBean" property="name" />
<jsp:getProperty name="UserBean" property="email" />
</body>
</html>
