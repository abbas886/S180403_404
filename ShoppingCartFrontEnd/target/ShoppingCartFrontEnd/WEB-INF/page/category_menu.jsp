<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">

<c:forEach var="category" items="${categories}">
<ul class="nav navbar-nav">
      
      <li class="dropdown">
      <a class="dropdown-toggle" data-toggle="dropdown"
       href="#">${category.name} <span class="caret"></span></a>
        <ul class="dropdown-menu">
         </ul>
      </li>
      
      
     
    </ul>
</c:forEach>
    
  </div>
</nav>
  
</body>
</html>