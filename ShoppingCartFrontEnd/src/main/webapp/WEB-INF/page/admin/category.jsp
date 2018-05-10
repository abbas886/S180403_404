<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="category/save" method="post">

		Category Name : <input type="text" name="name" value=${selectedCategory.name}><br>
		Category Description: <input type="text" name="description" value = ${selectedCategory.description}><br>
		<input type="submit" value="Save">


	</form>




	<!--   display all the categories -->

	<table border="2" align="center" bgcolor="blue"> 
		<tr>
			<td>Name</td>
			<td>Description</td>
			<td>Date</td>
		</tr>
		<c:forEach var="category" items="${categories}">
			<tr>

				<td>${category.name}</td>
				<td>${category.description}</td>
				<td>${category.added_date}</td>
				
				<td> <a href="category/delete/?name=${category.name}"> delete</a> 
				| <a href="category/edit/?name=${category.name}"> edit</a> </td>

			</tr>
		</c:forEach>
	</table>















</body>
</html>