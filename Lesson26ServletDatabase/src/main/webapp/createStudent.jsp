<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create New Student</title>
    <link rel="stylesheet" href="<c:url value="styles/page.css"/>">
</head>
<body>
<div class="login-box">
    <h2>Create New Student</h2>
    <form action="<c:url value="/create"/>" method="post">
        <div class="user-box">
            <input type="number" name="age" required="">
            <label>Student id</label>
        </div>
        <div class="user-box">
            <input type="text" name="name" required="">
            <label>Student name</label>
        </div>
        <div class="user-box">
            <input type="text" name="surname" required="">
            <label>Student surname</label>
        </div>
        <div class="user-box">
            <input type="number" name="age" required="">
            <label>Student age</label>
        </div>
        <div class="user-box">
            <input type="number" name="age" required="">
            <label>Student course</label>
        </div>
        <div class="user-box">
            <input type="text" name="course" required="">
            <label>Student course</label>
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