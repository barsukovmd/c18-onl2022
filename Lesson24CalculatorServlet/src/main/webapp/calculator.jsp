<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<h1><%= "Hello Yauhen" %>
    <jsp:forward page="my-calculator?value1=10&value2=2&calculator=SUM"/>
</body>
</html>