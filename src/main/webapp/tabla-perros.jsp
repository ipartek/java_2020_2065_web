<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${mensaje}</h1>
	
	<p>* Si queremos ver la historia del perro, tendremos que acceder a sus detalles</p>
	
	 <ul>
		 <c:forEach items="${perros}" var="perro">
		 	<li>${perro.id} <a href="perro-detalle?id=${perro.id}">${perro.nombre}</a> ${perro.raza} ${perro.peso} ${perro.vacunado}</li>	
		 </c:forEach>
	 </ul>
	

</body>
</html>