<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Delete Student</title>
    <link rel="stylesheet" href="<c:url value = "/styles/page.css"/>">
</head>
<body>
<div class="login-box">
    <h3>Delete students by <em>ID</em></h3>
    <form action="<c:url value="/delete"/>" method="post">
        <div class="user-box">
            <label>
                <input type="number" name="id" required="">
            </label>
            <label>ID</label>
        </div>
        <div>
            <input type="submit" value="Delete">
        </div>
    </form>
    <a href="<c:url value="students-database"/>" class="button">Return</a>
</div>
</body>
</html>