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


	<!-- Create SupplireController ...@PostMapping("supplier/save")" -->
	<form action="supplier/save" method="post">

		<table align="center" border="2" bordercolor="blue">
			<tr>
				<td>Email ID:</td>
				<td><input type="text" name="emailID" value="${selectedSupplier.emailID}"></td>
			</tr>
			<tr>
				<td>Supplier Name:</td>
				<td><input type="text" name="name" value="${selectedSupplier.name}"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirm_password"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobile" value="${selectedSupplier.mobile}"></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><input type="textarea" name="address" value="${selectedSupplier.address}"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>

		</table>

	</form>



	<!--  display the list of suppliers -->
	<table align="center" border="3" bordercolor="blue">
		<c:forEach var="supplier" items="${suppliers}">

			<tr>
				<td>${supplier.emailID}</td>
				<td>${supplier.name}</td>
				<td>${supplier.mobile}</td>
				<td>${supplier.address}</td>
				<td>${supplier.added_date}</td>

				<td><a href="supplier/delete?emailID=${supplier.emailID}">
						Delete</a> <a href="supplier/edit?emailID=${supplier.emailID}">
						| Edit</a></td>
		</tr>
	</c:forEach>
	</table>

























</body>
</html>