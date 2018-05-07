<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- need to use few tags like if, loops in this page. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- external css -->
<link rel="stylesheet" type="text/css" href="resources/css/style.css">

</head>
<body>

${msg}


	<center>
		<h2 >Welcome to Shopping Cart</h2>
	</center>

	<!--  include login_header.jsp here -->
	<jsp:include page="login_header.jsp"></jsp:include>
	<jsp:include page="category_menu.jsp"></jsp:include>
	
	<%-- <jsp:include page="imageslider.jsp"></jsp:include> --%>

	<!-- when user click login, then only login.jsp
	should include...it means we need to write
	some condition. by using jstl tags -->

<div>
	<c:if test="${isUserClickedLogin==true}">
		<jsp:include page="login.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserClickedRegister==true}">
		<jsp:include page="register.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isAdmin==true}">
		<jsp:include page="admin/admin.jsp"></jsp:include>
	</c:if>


</div>
</body>
</html>






