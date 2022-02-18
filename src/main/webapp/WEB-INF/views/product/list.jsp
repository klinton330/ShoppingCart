<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>
<h1>Book List</h1>

<table cellpadding="2" cellspacing="2" border="1">

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		
		<c:forEach var="product"  items="${products }">
	
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td><img src=<c:url value='/assests/images/${product.photo}' />
					width="200" height="150"></td>
				<td>${product.price}</td>
				<td><a href="${pageContext.request.contextPath }/shopping/cart/buy/${product.id}">Buy</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>