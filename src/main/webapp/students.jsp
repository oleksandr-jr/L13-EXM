<%@ page import="java.util.List" %>
<%@ page import="org.javarush.l13exm.Student" %>
<%@ page import="java.util.Collection" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: OleksandrJR
  Date: 16/10/23
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<h1>Students</h1>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Email</th>
    </tr>
    </thead>

    <tbody>
        <c:forEach var="student" items="${studentsList}">
            <tr>
                <td>${student.id}</td>
                <td>${student.firstName}</td>
                <td>${student.lastName}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
    </tbody>

</table>


</body>
</html>
