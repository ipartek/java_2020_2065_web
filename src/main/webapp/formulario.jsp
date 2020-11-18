<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="includes/cabecera.jsp" />
	
	
		${perro}
		<h1>Editar Perro</h1>
		
		<i>***Esto envia datos por POST al controlador</i>
		
		<form method="post" action="perro-controller">
		
			<div class="form-group">
				<label for="id">Id:</label>
				<input value="${perro.id}" type="text" id="id" name="id" readonly>
			</div>
			
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<input value="${perro.nombre}" type="text" autofocus id="nombre" name="nombre" placeholder="Nombre del perro" required>
			</div>
			
			
			<div class="form-group">
				<label for="raza">Raza:</label>
				<input value="${perro.raza}" type="text" id="raza" name="raza" placeholder="Raza del perro" required>
			</div>
			
			<div class="form-group">
				<label for="peso">Peso(kg):</label>
				<input value="${perro.peso}" type="text" id="peso" name="peso" placeholder="Peso en Kilogramos" required>
			</div>
			
			<div class="form-group">
				<label for="vacunado">Marca si esta Vacunado</label>
				<input type="checkbox" id="vacunado" name="vacunado" class="w-7" ${ (perro.vacunado) ? "checked" : "" }>
			</div>
			
			<div class="form-group">
				<label for="historia">Historia</label>
				<textarea id="historia" name="historia" cols="30" rows="5" placeholder="Cuentame la historia del perro">${perro.historia}</textarea>	
			</div>
			
			<input type="submit" class="boton" value="Guardar Datos">
		</form>
		
<jsp:include page="includes/pie.jsp" />		
	