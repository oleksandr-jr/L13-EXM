<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<h1><% out.print(2*5); %> </h1>
<h1>Random number is <% out.print(Math.random() * 10); %> </h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>