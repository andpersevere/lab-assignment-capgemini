<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Add Product
	<table>
		<fo:form action="pageSubmit" method="post" modelAttribute="myForm">
			<tr>
				<td>Product Id</td>
				<td><fo:input path="productId"/></td> 
			</tr>
			<tr>
				<td>Product Name</td>
				<td><fo:input path="productName"/></td> 
			</tr>
			<tr>
				<td>Product Price</td>
				<td><fo:input path="productPrice"/></td> 
			</tr>
			<tr>
				<td>Type</td>
				<td><fo:input path="type"/></td> 
			</tr>
			<tr>
				<td>Online</td>
				<td><fo:input path="online"/></td> 
			</tr>
			<tr>
				<td>
					<input type="submit" value="Add Product">
				</td>
			</tr>
		</fo:form>
	</table>
</body>
</html>