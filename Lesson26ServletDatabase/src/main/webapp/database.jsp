<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Database</title>
</head>
<tbody>
<h1><em>Students</em></h1>
<body>
<div>
    <div style="float: left; margin: 0 10px 0 10px">
        <a href="<c:url value="/createStudent.jsp"/>" class="button">Create</a>
    </div>
    <div style="float: left; margin: 0 420px 0 0">
        <a href="<c:url value="/deleteStudent.jsp"/>" class="button">Delete</a>
    </div>
    <div style="float: right">
        <a href="<c:url value="startPage.jsp"/>" class="button">Return</a>
    </div>
</div>
<br>
<table class="container">
    <tr><em>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>City</th>
        <th>Course</th>
        <th></th>
    </em></tr>
    <c:forEach var="students" items="${students}">
        <tr>
            <td>${students.id}</td>
            <td>${students.name}</td>
            <td>${students.surname}</td>
            <td>${students.age}</td>
            <td>${students.course}</td>
            <td>${students.city.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
