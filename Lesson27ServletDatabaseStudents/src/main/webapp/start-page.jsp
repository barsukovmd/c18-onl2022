<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>Welcome to Start Page</title>
    <link rel="stylesheet" href="<c:url value="/styles/index.css"/>">
</head>
<body>
<div>
    <a id="db" class="button purple" href="<c:url value="students-database"/>">
        <i class="fa fa-address-book" aria-hidden="true"></i>
        <span>Работа с БД</span>
    </a>
</div>
</body>
</html>
