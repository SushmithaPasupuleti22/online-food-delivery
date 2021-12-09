<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-FoodCart</title>
</head >
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------FoodCart---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>cartId</th>
			<th>customer</th>
			<th>itemList</th>
			
		</tr>
		</thead>
		<tbody>
		<c:forEach var="foodCart" items="${foodCarts}">
		
		<tr>
			<td>${foodCart.cartId }</td>
			<td>${foodCart.customer }</td>
			<td>${foodCart.itemList }</td>
			
			
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
</html>html>