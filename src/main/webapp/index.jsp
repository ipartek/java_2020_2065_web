<h1>Soy la pagina de inicio</h1>

<%
	// podemos combinar HTML + Java = JSP - Java Server Page
	out.print("<p>Este parrafo esta escrito en Java</p>");

%>

<p>Esto hace una peticion GET al controlador</p>
<a href="perro">Listado de Perros</a>

<form method="post" action="perro">
	<p>Esto envia datos por POST al controlador</p>
	<input type="text" name="nombre" placeholder="Nombre del perro">
	<br>
	<input type="text" name="raza" placeholder="Raza del perro">
	<br>
	<input type="submit" value="Enviar">
</form>