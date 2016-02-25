<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Title</title>
</head>
<body>
<h2>Hello you little buster</h2>
<br/>
<c:forEach var="offer" items="${offers}">
   <p> <c:out value="${offer}"></c:out> </p>

</c:forEach>
</body>
</html>
