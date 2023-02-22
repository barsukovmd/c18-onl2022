<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome to Start Page</title>
    <link rel="stylesheet" href="<c:url value="/styles/index.css"/>">
</head>
<body>
<div style="float: left; margin: 0 10px 0 10px">
    <a href="<c:url value="/create"/>" class="button">Create</a>
</div>
<div style="float: left; margin: 0 420px 0 0">
    <a href="<c:url value="/delete"/>" class="button">Delete</a>
</div>
<div style="float: right">
    <a href="<c:url value="/students-database"/>" class="button">Back</a>
</div>
</body>
</html>