<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart Page</title>
</head>
<body>
	<h1>This is Cart page</h1>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Option</th>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Sub Total</th>
		</tr>

		<c:set var="total" value="0" />
		<c:forEach var="item" items="${sessionScope.cart}">
			<c:set var="total" value="${total+item.product.price*item.quantity}" />
			<tr>
				<td>Delete</td>
				<td>${item.product.id}</td>
				<td>${item.product.name}</td>
				<td><img
					src=<c:url value='/assests/images/${item.product.photo}' />
					width="200" height="150"></td>
				<td>${item.product.price}</td>
				<td>${item.quantity}</td>
				<td>${item.product.price*item.quantity}</td>
			</tr>
		</c:forEach>
    <tr>
			<td colspan="6" align="right">Sum</td>
			<td>${total}</td>
		</tr>
	</table>
</body>
</html>