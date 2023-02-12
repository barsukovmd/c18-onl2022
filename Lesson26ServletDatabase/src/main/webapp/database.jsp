<%@ page import="java.util.List" %>
<%@ page import="model.Students" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.City" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Database</title>
</head>
<body>
<h1>Students</h1>
<table>
    <tr>
        <th bgcolor="#663399">id</th>
        <th bgcolor="#b8860b">Name</th>
        <th bgcolor="#ffefd5">Surname</th>
        <th bgcolor="#fa8072">Age</th>
        <th bgcolor="#ffd700#00fa9a">Course</th>
        <th aria-disabled=</th>
        <th bgcolor="#ffd700">City</th>
    </tr>
    <tbody>
    <%
        List<Students> students = (List<Students>) request.getAttribute("students");
        for (Students stud : students) {%>
    <tr>
        <td><%=stud.getId()%>
        </td>

        <td><%=stud.getName()%>
        </td>

        <td><%=stud.getSurname()%>
        </td>

        <td>
                <%=stud.getAge()%>
        <td/>

        <td><%=stud.getCourse()%>
        </td>

        <td>
            <%=stud.getCity()%>
        </td>

        <td><%=stud.getCityId()%>
        </td>
    </tr>
    <%} %>
    </tbody>
</table>
</body>
</html>
