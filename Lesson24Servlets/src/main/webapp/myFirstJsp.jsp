<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello Java Developer</title>
</head>
<body>
<h1><%= "Hello Yauhen" %>
</h1>

<h2>
    <%@page import="model.Calculator" %>
        <%
        Calculator calculator = new Calculator();
        out.println("Numbers are 10 and 2.");
    %>

    <br>
        <%
        out.println(" Sum: " + calculator.sum(10, 2));
        out.println(" Subtraction : " + calculator.subtraction(10, 2));
        out.println(" Multiplying: " + calculator.multiply(10, 2));
        out.println(" Division: " + calculator.division(10, 2));
    %>
    <br>

    <br/>
    <a href="my-servlet">Tap the link</a>
</body>
</html>