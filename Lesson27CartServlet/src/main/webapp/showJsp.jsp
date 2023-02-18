<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="cart.Cart" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<%Cart cart = (Cart) session.getAttribute("cart");%>
<p>Name of product:<%=cart.getName()%>
</p>
<p>Quantity of product:<%=cart.getQuantity()%>
</p>
</body>
</html>