<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-Order</title>
</head>
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------Order Details---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>orderId</th>
			<th>orderDate</th>
			<th>cart</th>
			<th>orderStatus</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="order" items="${orders}">
		
		<tr>
			<td>${order.orderId }</td>
			<td>${order.orderDate }</td>
			<td>${order.cart }</td>
			<td>${order.orderStatus }</td>
			<%-- <td><a href="/customerboot/updateCustomer/${customer.id}">Update</a></td>
			<td><a href="/customerboot/deleteCustomer/${customer.name}">Delete</a></td> --%>
		</tr>
		
		</c:forEach>
		</tbody>
	</table>
<!-- <a href="/customerboot/addCustomer">Add Customer</a> -->
<h3>**************************************************</h3>
<h2 >Thank you</h2>
	</div>
</body>
</html>