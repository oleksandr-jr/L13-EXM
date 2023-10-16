<%--
  Created by IntelliJ IDEA.
  User: OleksandrJR
  Date: 14/04/23
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ include file="parts/logo.jsp" %>

<%
    String name = "Users List";
%>
<h1>Page name: <%= name %>.</h1>


<%
    if (request.getAttribute("usersCollection") == null) {
        out.print("Коллекция пользователей не найдена!");
    } else {
        out.print("Коллекция пользователей найдена!");
    }
%>

    <ul>
        <c:forEach var="user" items="${requestScope.usersCollection}">
        <li>${user.getName()}</li>
        </c:forEach>
    </ul>
</body>
</html>
