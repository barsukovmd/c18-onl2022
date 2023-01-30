<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello Servlet</title>
</head>
<body>
<h1><% out.println("Yauhen Developer!"); %></>
<h1>
    <%@page import="model.Calculator" %>
    <%
        Calculator calculator = new Calculator();
        out.println("Numbers are 10 and 2\n");
        out.print(" Sum: " + calculator.sum(10, 2));
        out.println(" Subtraction : " + calculator.subtraction(10, 2));
        out.println(" Multiplying: " + calculator.multiply(10, 2));
        out.println(" Division: " + calculator.division(10, 2));
    %>
</h1>

<br/>
<a href="my-servlet2023">Hello Yauhen Developer</a>
</body>
</html>