<%@ page import="java.util.ArrayList" %>
<%@ page import="main.model.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Students List</h1>
<table border="1">
    <caption>Student Table List</caption>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Course</th>
    </tr>
        <%
    ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("data");
    for (Student student : students) {
%>
    <tr>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
    </tr>
        <%}%>
</body>
</html>