<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="includes/cabecera.jsp" />

	<h1>${mensaje}</h1>
	
	<p>* Si queremos ver la historia del perro, tendremos que acceder a sus detalles</p>
	 
	 <table>	 
	 	<caption>Perro dados de Alta en la Perrera</caption>	 	
	 	<thead>
	 		<tr>
	 			<th>Id</th>
	 			<th>Nombre</th>
	 			<th>Raza</th>
	 			<th>Vacunado</th>
	 			<th>Acciones</th>
	 		</tr>
	 	</thead>	 	
	 	<tbody>
	 	 	<!-- repertir por cada perro -->
	 	 	<c:forEach items="${perros}" var="p">
		 		<tr>
		 			<td>${p.id}</td>
		 			<td>${p.nombre}</td>
		 			<td>${p.raza}</td>
		 			<td>${ (p.vacunado) ? 'Si' : 'No' }</td>
		 			<td class="flex">
		 				<a href="perro-detalle?id=${p.id}"><i class="fa fa-eye"></i></a> 
		 				<a href="perro-eliminar?id=${p.id}"><i class="fa fa-trash"></i></a>		 				 
		 			</td>
		 		</tr>
		 	</c:forEach>	
	 	</tbody>	 	
	 	<tfoot>
	 		<tr>
	 			<td colspan="5">Total de perros X</td>
	 		</tr>
	 	</tfoot>	 	
	 </table>
	

<jsp:include page="includes/pie.jsp" />