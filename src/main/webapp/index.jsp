<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="includes/cabecera.jsp" />
	
		<h1>Soy la pagina de inicio</h1>
		
		<%
			// podemos combinar HTML + Java = JSP - Java Server Page
			out.print("<p>Este parrafo esta escrito en Java</p>");
		
		%>
		
		<p>Esto hace una peticion GET al controlador</p>
		<a href="perro-controller">Table Perros</a>
		
		
		
<jsp:include page="includes/pie.jsp" />		
	