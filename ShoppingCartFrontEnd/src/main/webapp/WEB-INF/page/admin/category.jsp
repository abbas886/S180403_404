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

Category Name : <input type="text" name="name"><br>
Category Description: <input type="text" name = "description"><br>
<input type="submit" value="Save">


</form>




<!--   display all the categories -->

<c:forEach var="category" items="${categories}">

${category.name} :
${category.description} :
${category.added_date}
<br>

</c:forEach>
















</body>
</html>