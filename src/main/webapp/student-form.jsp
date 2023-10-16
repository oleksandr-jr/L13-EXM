<%--
  Created by IntelliJ IDEA.
  User: OleksandrJR
  Date: 16/10/23
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>

<h1>Create student</h1>


<form action="insert" method="post">
    <label>Id</label>
    <input type="text" name="id" value="${student.id}"/>
    <br/>
    <label>First name</label>
    <input type="text" name="firstName" value="${student.firstName}"/>
    <br/>
    <label>Last name</label>
    <input type="text" name="lastName" value="${student.lastName}"/>
    <br/>
    <label>Email</label>
    <input type="text" name="email" value="${student.email}"/>
    <br/>
    <input type="submit" value="Save"/>
</form>


</body>
</html>
