<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEmployee" method="post">
		 Employee ID : <input type="number" name="eid"> <br>
		 Employee Name : <input type="text" name="ename"> <br>
		 Employee Department : <input type="text" name="dept"> <br>
		 Employee Designation : <input type="text" name="designation"> <br>
		 Employee Salary : <input type="number" name="salary"> <br>
		<input type="submit">
	</form>
	<hr>
	
	<form action="getDetail" method="get">
		 Employee ID : <input type="number" name="eid"> <br>
		<input type="submit">
	</form>
	<hr>
	
 	<form action="getDetailByName" method="get">
		 Employee Name : <input type="text" name="ename"> <br>
		<input type="submit">
	</form>  
	<hr>
	
	<form action="deleteDetail" method="post">
		 Delete Employee ID : <input type="number" name="eid"> <br>
		<input type="submit">
	</form>
	<hr> 

</body>
</html>