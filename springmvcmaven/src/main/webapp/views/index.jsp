<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome Lakshmi, In Spring MVC World!
	
	<form action="addProgram" method="post">
		Enter your ID : <input type="text" name="id"> <br>
		Enter your Name : <input type="text" name="name"> <br>
		<input type="submit">
	</form>
	
		<form action="getDetail" method="get">
		Enter your ID : <input type="text" name="id"> <br>
		<input type="submit">
	</form>
</body>
</html>