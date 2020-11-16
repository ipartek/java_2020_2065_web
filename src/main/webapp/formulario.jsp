<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="includes/cabecera.jsp" />
	
		<h1>Dar de alta nuevo Perro</h1>
		

		
		<form method="post" action="perro-controller">
			<p>Esto envia datos por POST al controlador</p>
			<input type="text" name="nombre" placeholder="Nombre del perro" required>
			<br>
			<input type="text" name="raza" placeholder="Raza del perro" required>
			<br>
			Marca si esta Vacunado
			<input type="checkbox" name="vacunado">
			<br>
			<textarea name="historia" cols="30" rows="5" placeholder="Cuentame la historia del perro"></textarea>	
			<br>
			<input type="submit" value="Enviar">
		</form>
		
<jsp:include page="includes/pie.jsp" />		
	