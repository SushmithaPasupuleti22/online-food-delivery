<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="login/user">
<!-- <form th:action="@{/login}" method="post" style="max-width: 400px; margin: 0 auto;">
 -->    <p>
       UserName: <input type="text" name="username" required />  
    </p>
    <p>
        Password: <input type="password" name="password" required />
    </p>
    <p>
        <input type="submit" value="Login" />
    </p>
</form>
</div>
</body>
</html>