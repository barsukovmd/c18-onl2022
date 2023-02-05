<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1><%= "Hello Yauhen" %>
</>
</h1>
<h2>
    <jsp:forward page="/calculator?param1=2&param2=5&operation=sum"/>
</h2>
</body>
</html>