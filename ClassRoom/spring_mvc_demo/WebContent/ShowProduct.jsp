<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="fo" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Show Product
	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Price</th>
		</tr>
		<fo:forEach var="product" items="${data}">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.productPrice}</td>
				<td>${product.type}</td>
				<td>${product.online}</td>
			</tr>
		</fo:forEach>

	</table>
</body>
</html>