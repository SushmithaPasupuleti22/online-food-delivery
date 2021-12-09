<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-Restaurant</title>
</head >
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------Restaurant---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>restaurantId</th>
			<th>restaurantName</th>
			<th>address</th>
			<th>itemList</th>
			<th>managerName</th>
			<th>contactNumber</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="restaurant" items="${restaurants}">
		
		<tr>
			<td>${restaurant.restaurantId }</td>
			<td>${restaurant.restaurantName }</td>
			<td>${restaurant.address }</td>
			<td>${restaurant.itemList }</td>
			<td>${restaurant.managerNumber }</td>
			<td>${restaurant.contactNumber }</td>
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
</html>>