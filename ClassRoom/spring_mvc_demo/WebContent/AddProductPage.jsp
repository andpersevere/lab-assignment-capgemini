<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<style>
thead {
	color: green;
}

tbody {
	color: black;
}

tfoot {
	color: red;
}

table, th, td {
	border: 0px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
	<thead><tr><th>Add Product</th></tr></thead>
	
		<fo:form action="pageSubmit" method="post" modelAttribute="myForm">
			<tr>
				<td>Product Id</td>
				<td><fo:input path="productId"/></td> 
				<td><span><fo:errors path="productId"/></span> </td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><fo:input path="productName"/></td>
				<td><span><fo:errors path="productName"/></span> </td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><fo:input path="productPrice"/></td>
				<td><span><fo:errors path="productPrice"/></span> </td>
			</tr>
			<tr>
				<td>Type</td>
				<td><fo:select path="type" items="${dataItem}"/></td> 
			</tr>
			<tr>
				<td>Online</td>
				<td><fo:radiobuttons path="online" items="${radioDataItem}"/></td> 
			</tr>
			<tr>
				<td>Features</td>
				<td><fo:checkboxes path="features" items="${featureDataItem}"/></td> 
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