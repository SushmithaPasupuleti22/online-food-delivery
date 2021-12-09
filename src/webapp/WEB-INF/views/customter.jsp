<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-Customer</title>
</head >
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------Customer---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>customerId</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>age</th>
			<th>gender</th>
			<th>mobileNumber</th>
			<th>address</th>
			<th>email</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="customer" items="${customers}">
		
		<tr>
			<td>${customer.customerId }</td>
			<td>${customer.fistName }</td>
			<td>${customer.lastName }</td>
			<td>${customer.age }</td>
			<td>${customer.gender }</td>
			<td>${customer.mobileNumber }</td>
			<td>${customer.address }</td>
			<td>${customer.email }</td>
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