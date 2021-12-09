<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Food Delivery-Bill</title>
</head >
<body bgcolor="purple">
	<div align="center">
		
<h1>Online Food Delivery</h1>
<h3>**************************************************</h3>
<h2>--------BILL---------</h2>

	<table border="2" width="70%" cellpadding="2">
		<thead>
		<tr>
			<th>billId</th>
			<th>billDate</th>
			<th>order</th>
			<th>totalItems</th>
			<th>totalCost</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="bill" items="${bills}">
		
		<tr>
			<td>${bill.billId }</td>
			<td>${bill.billDate }</td>
			<td>${bill.order }</td>
			<td>${bill.totalItems }</td>
			<td>${bill.totalCost }</td>
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