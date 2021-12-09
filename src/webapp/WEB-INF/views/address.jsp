<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-Address</title>
</head >
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------Address---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>addressId</th>
			<th>buildingName</th>
			<th>streetNo</th>
			<th>area</th>
			<th>city</th>
			<th>state</th>
			<th>country</th>
			<th>pincode</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="address" items="${address}">
		
		<tr>
			<td>address.addressId</td>
			<td>address.buildingName</td>
			<td>address.streetNo</td>
			<td>address.area</td>
			<td>address.city</td>
			<td>address.state</td>
			<td>address.country</td>
			<td>address.pincode</td>
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