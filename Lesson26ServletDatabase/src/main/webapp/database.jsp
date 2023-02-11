<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.Students" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Database</title>
</head>
<body>
<h1>Students</h1>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <tbody>
    <%
        PrintWriter writer = response.getWriter();
        List<Students> students = (List<Students>) request.getAttribute("students");
        System.out.println(students);
        if (students != null && !students.isEmpty()) {
            students
                    .forEach(stud -> writer.println("<tr><td>" + stud.getName() + "</td></tr>"));

        }
    %>
    <% for (Students stud : students) {%>
    <tr>
        <td>
            <%=stud.getName()%>
        </td>
    </tr>
    <%} %>
    </tbody>
</table>
</body>
</html>
