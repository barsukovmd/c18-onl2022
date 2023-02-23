<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create New Student</title>
    <link rel="stylesheet" href="<c:url value="styles/page.css"/>">
</head>
<body>
<div class="login-box">
    <h2>Create Student</h2>
    <form action="<c:url value="/create"/>" method="post">
        <div class="user-box">
            <input type="text" name="name" required="">
            <label>Name</label>
        </div>
        <div class="user-box">
            <input type="text" name="surname" required="">
            <label>Surname</label>
        </div>
        <div class="user-box">
            <input type="number" name="age" required="">
            <label>Age</label>
        </div>
        <div class="user-box">
            <input type="text" name="course" required="">
            <label>Course №</label>
        </div>
        <div class="user-box">
            <input type="text" name="cityName" required="">
            <label>City</label>
        </div>
        <div>
            <input type="submit" value="Create">
        </div>
    </form>
    <a href="<c:url value="students-database"/>" class="button">Return</a>
</div>
</body>
</html>