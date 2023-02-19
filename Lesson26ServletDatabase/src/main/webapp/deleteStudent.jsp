<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Student</title>
    <link rel="stylesheet" href="<c:url value = "/styles/studentPage.css/">">
</head>
<body>
<div class="login-box">
    <h3>Delete student by <em>ID</em></h3>
    <form action="<c:url value="students-database/delete"/>" method="post">
        <div class="user-box">
            <label>
                <input type="number" name="id" required="">
            </label>
            <LABEL>ID</LABEL>
        </div>
        <div>
            <input type="submit" value="Delete">
        </div>
    </form>
    <a href="<c:url value="students-database"/>" class="button">Return</a>
</div>
</body>
</html>