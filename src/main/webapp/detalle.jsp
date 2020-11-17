<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="includes/cabecera.jsp" />

	<h1>${perro.nombre}</h1>
	*TODO maquetar el resto de campos del perro
	<hr>
	${perro}
	
	<hr>
	${perro.historia}
	
	<hr>
	<a href="perro-eliminar?id=${perro.id}">ELIMINAR PERRO, Cuidado no tiene vuelta atras!!!</a>

<jsp:include page="includes/pie.jsp" />