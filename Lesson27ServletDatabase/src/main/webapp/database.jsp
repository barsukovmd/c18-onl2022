<%@ page import="model.Students" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Students</title>
    <link rel="stylesheet" href="<c:url value="/styles/table.css"/>">
    <link rel="stylesheet" href="<c:url value="/styles/page.css"/>">
</head>
<h1><span class="blue">&lt</span>All<span class="blue">&gt</span> <span class="yellow">Students</span></h1>
<body>
<h1><em>Students</em></h1>
<h1>Hello world</h1>
<table class="table table-hover">
    <tr>
        <th bgcolor="#663399">id</th>
        <th bgcolor="#b8860b">Name</th>
        <th bgcolor="#ffefd5">Surname</th>
        <th bgcolor="#fa8072">Age</th>
        <th bgcolor="#ffd700#00fa9a">Course</th>
        <th bgcolor="#ffd700">City</th>
    </tr>
    <tbody>
    <%
        List<Students> student = (List<Students>) request.getAttribute("students");
        for (Students stud : student) {%>
    <tr>
        <td>
            <%=stud.getId()%>
        </td>

        <td><%=stud.getName()%>
        </td>

        <td>
            <%=stud.getSurname()%>
        </td>
        <td><%=stud.getAge()%>
        <td/>

        <td><%=stud.getCourse()%>
        </td>
        <td><em>
            <%=stud.getCity().getCityName()%>
        </em>
        </td>
    </tr>
    <%} %>
    <a href="students-database">Student Servlet</a>
    </tbody>
</table>
</body>
</html>